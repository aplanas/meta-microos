SUMMARY = "Package provides recommended R-spatial"
DESCRIPTION = "This packages provides R-spatial, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "7.3.16"

RPM_NAME = "R-spatial-7.3.16-45.2.aarch64.rpm"
RPM_HASH = "2e7a1cc27d95a909b1471b0f384a2632a3772559a88e4da3b3ecae81bfcc0c715482890e9116cded2f2751478a8e51d5f21130052af547ce3dae5c09ecde5042"

RPROVIDES:${PN} += "R-spatial \
R-spatial(aarch-64)"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libR.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
