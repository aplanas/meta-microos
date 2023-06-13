SUMMARY = "A Chess Program"
DESCRIPTION = "A smart chess playing program which uses opening book. \
 \
 \
 \
Authors: \
-------- \
    Dusan Dobes <dobes@math.muni.cz>"
LICENSE = "GPL-2.0+"

PV = "25"

RPM_NAME = "phalanx-25-1.25.aarch64.rpm"
RPM_HASH = "3ee54ff393a52d2ab95c0b30b58c4991c980b312e276d0eb49387f5635d269f4fc3e5926e2d3685bb85e3e0608aa8911ecedf5a6f1cf791aa3b03ea1068e3448"

RPROVIDES:${PN} += "chess_backend \
phalanx \
phalanx(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
