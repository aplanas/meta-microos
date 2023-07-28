SUMMARY = "Library to simplify development of OpenEXR utilities"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains shared library libOpenEXRUtil"
LICENSE = "BSD-3-Clause"

PV = "3.1.9"

RPM_NAME = "libOpenEXRUtil-3_1-30-3.1.9-2.1.aarch64.rpm"
RPM_HASH = "1bf0f885b8cbda23dfad3d92aaeb549b8b6a291b806c3a247bc189dda84c475e7d87cdd4a48e87f98c412738a508ac0d00e85565b56f8ed15799e8e1969f46cb"

RPROVIDES:${PN} += "libOpenEXRUtil-3-1-30 \
libOpenEXRUtil-3-1.so.30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libIex-3-1.so.30 \
libOpenEXR-3-1.so.30 \
libOpenEXRCore-3-1.so.30 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
