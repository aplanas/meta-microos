SUMMARY = "Library to Handle EXR Pictures in 16-Bit Floating-Point Format"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains shared library libOpenEXRCore"
LICENSE = "BSD-3-Clause"

PV = "3.1.7"

RPM_NAME = "libOpenEXRCore-3_1-30-3.1.7-1.2.aarch64.rpm"
RPM_HASH = "ea884b12d2ff67363f0479a596b865a5350aeb20e2185b7263a5c0ffb0f872fec2004fe70f8c6f3fae5fc7f7912670cfe9367a0257b8b06994063826ccf05e3a"

RPROVIDES:${PN} += "libOpenEXRCore-3-1-30 \
libOpenEXRCore-3-1.so.30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
