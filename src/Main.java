public class Main {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 4};

        boolean isSorted = isSortedAscending(array);

        if (isSorted) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is unsorted in ascending order.");
        }
    }

    public static boolean isSortedAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}