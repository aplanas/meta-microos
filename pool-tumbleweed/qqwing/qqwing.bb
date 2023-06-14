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

RPM_NAME = "qqwing-1.3.4-2.20.aarch64.rpm"
RPM_HASH = "1c1018dea9b2883ec0a721a02706356342cf71308cf690d11744d2cf18b90a5faec9c52e5fbd11d67918e90fa1a846b0f944892716b3072f5f777fd3a4c8a3c9"

RPROVIDES:${PN} += "qqwing"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqqwing.so.2 \
libstdc++.so.6"

inherit rpm
