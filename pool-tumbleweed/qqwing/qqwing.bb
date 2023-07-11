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

RPM_NAME = "qqwing-1.3.4-2.21.aarch64.rpm"
RPM_HASH = "3f310eab422ef26c0a5eb9c9efc02a6d257ac0309b070a98334a7aa2aef3cfef15baccbc21bfbe2c9035838266aae9cf29922c47df024fa6a8516786c7df947e"

RPROVIDES:${PN} += "qqwing"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqqwing.so.2 \
libstdc++.so.6"

inherit rpm
