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

RPM_NAME = "libqqwing2-1.3.4-2.20.aarch64.rpm"
RPM_HASH = "beaf8e1960e64f8bc7393da4d4cd8f17f39312c53799b1380e52ba7b2bce66c8ee49ff8901fc51297bd9cc8c7b7d2f1550ef8c11d578496b3b8f82bc6872889f"

RPROVIDES:${PN} += "libqqwing.so.2()(64bit) \
libqqwing2 \
libqqwing2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
