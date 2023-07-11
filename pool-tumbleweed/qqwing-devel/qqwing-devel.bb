SUMMARY = "Sudoku solver and generator"
DESCRIPTION = "QQwing is a Sudoku puzzle generator and solver. It offers the following features. \
 \
 * Fast. It can solve 1000 puzzles in 1 second and generate 1000 puzzles in 25 seconds. \
 * Uses logic. Uses as many solve techniques as possible when solving puzzles rather than guessing. \
 * Rates puzzles. Most generators don't give an indication of the difficulty of a Sudoku puzzle. QQwing does. \
 * Can print solve instructions. Tells steps that need to be taken to solve any puzzle. \
 * Customizable output style. Including a CSV style that is easy to import into a database."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.4"

RPM_NAME = "qqwing-devel-1.3.4-2.21.aarch64.rpm"
RPM_HASH = "0acfdd7ae9362a92f79a341704e83a12b1ee5cb7c32cf95b08f93a4722802d0924933fc3c0402471db0a21dc3b7d3934210e7f575553d4373f4c19cb2c8d6ebd"

RPROVIDES:${PN} += "pkgconfig-qqwing \
qqwing-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqqwing2"

inherit rpm
