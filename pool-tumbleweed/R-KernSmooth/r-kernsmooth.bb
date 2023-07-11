SUMMARY = "Package provides recommended R-KernSmooth"
DESCRIPTION = "This packages provides R-KernSmooth, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.23.21"

RPM_NAME = "R-KernSmooth-2.23.21-46.1.aarch64.rpm"
RPM_HASH = "89d1437920662e53c70a0615233bb8f259eaa4798dcbf85c7897c5e279a2fabce06eed33fd23e1b0b1d653773a28d5396bf9f89892b7eefd6ec8f85375a641b6"

RPROVIDES:${PN} += "R-KernSmooth"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libRblas.so \
libc.so.6 \
libm.so.6"

inherit rpm
