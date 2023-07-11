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

RPM_NAME = "liberfa1-2.0.0-1.11.aarch64.rpm"
RPM_HASH = "ef2f51ff493fdf8037e6369c6dce1191ee1b513d12914633f862205ced506c5cec8b9e8af1a102817c084d536be84b60f0c8d168800f9ca66b5801f2902baab8"

RPROVIDES:${PN} += "liberfa.so.1 \
liberfa1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
