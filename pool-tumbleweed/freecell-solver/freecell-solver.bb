SUMMARY = "A Freecell Solver"
DESCRIPTION = "Command line programs which can be used to solve Freecell and other card games."
LICENSE = "MIT"

PV = "6.8.0"

RPM_NAME = "freecell-solver-6.8.0-1.3.aarch64.rpm"
RPM_HASH = "d4289cdf4f2fba72c0bf43d049c018d09af7210a1a501e55b0ac99de54a4b4c004967084266a772cfeb3b6b5b12f1201f0e8c7a27738b8390bd3068c56cb76d5"

RPROVIDES:${PN} += "freecell-solver \
freecell-solver(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfreecell-solver.so.0()(64bit) \
python3-pysol-cards \
python3-random2 \
python3-six"

inherit rpm
