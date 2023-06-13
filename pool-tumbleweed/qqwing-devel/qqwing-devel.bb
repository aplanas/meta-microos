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

RPM_NAME = "qqwing-devel-1.3.4-2.20.aarch64.rpm"
RPM_HASH = "a78a7f0fd2baffa2d2544086bbccfb60637265c37d18bc23370a35486e691e84901357469eb26106c54a56e5f18c428cbb008ae12fbb20c26fbfe78a3a355cbd"

RPROVIDES:${PN} += "pkgconfig(qqwing) \
qqwing-devel \
qqwing-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqqwing2"

inherit rpm
