SUMMARY = "Essential Routines for Fundamental Astronomy"
DESCRIPTION = "ERFA is a C library containing key algorithms for astronomy, and is based on \
the SOFA library published by the International Astronomical Union (IAU). \
 \
ERFA is intended to replicate the functionality of SOFA (aside from possible \
bugfixes in ERFA that have not yet been included in SOFA), but is licensed \
under a three-clause BSD license to enable its compatibility with a wide \
range of open source licenses. Permission for this release has been obtained \
from the SOFA board, and is avilable in the LICENSE file included in this \
source distribution."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "liberfa1-2.0.0-1.10.aarch64.rpm"
RPM_HASH = "17dbbf42bd6d750334898c28c13e5ca6654fdcb6819f99f66fe6db4cf8673c9d826590adc7c687b0ae40af0d12aa8eebfc899cc772d90382bfa7dd6b9e3a9ddc"

RPROVIDES:${PN} += "liberfa.so.1()(64bit) \
liberfa1 \
liberfa1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
