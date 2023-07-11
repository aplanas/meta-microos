SUMMARY = "A Freecell Solver"
DESCRIPTION = "Command line programs which can be used to solve Freecell and other card games."
LICENSE = "MIT"

PV = "6.8.0"

RPM_NAME = "freecell-solver-6.8.0-1.4.aarch64.rpm"
RPM_HASH = "ecd5ef5024175757a4d83495a68811924d0b73b8cfe485c79d298c4f059f83f78b3ce33135914f7a5e94325d46228b5ce8aa5b1f7d6c6b551d80982280a6c555"

RPROVIDES:${PN} += "freecell-solver"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreecell-solver.so.0 \
python3-pysol-cards \
python3-random2 \
python3-six"

inherit rpm
