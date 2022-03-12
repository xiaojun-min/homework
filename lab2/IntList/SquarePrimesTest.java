package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(14, 15, 16, 17, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("14 -> 15 -> 16 -> 289 -> 18", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimes2() {
        IntList lst = IntList.of(20, 6, 8, 7, 5);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("20 -> 6 -> 8 -> 49 -> 25", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimes3() {
        IntList lst = IntList.of(4, 7, 1, 8, 5);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("4 -> 49 -> 1 -> 8 -> 25", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimes4() {
        IntList lst = IntList.of(53, 8, 20, 2, 4);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("2809 -> 8 -> 20 -> 4 -> 4", lst.toString());
        assertTrue(changed);
    }
}
