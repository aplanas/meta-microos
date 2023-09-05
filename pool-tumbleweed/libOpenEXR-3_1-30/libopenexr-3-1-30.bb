SUMMARY = "Library to Handle EXR Pictures in 16-Bit Floating-Point Format"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains shared library libOpenEXR"
LICENSE = "BSD-3-Clause"

PV = "3.1.11"

RPM_NAME = "libOpenEXR-3_1-30-3.1.11-1.1.aarch64.rpm"
RPM_HASH = "9c1ab5622b486818367aa4116676a93a4eaa4d71e1f58ce6c06bc0bad595b879682a6590f88362d36fa699fd09609245706ff024c2d9dc9d4732949b89c699c7"

RPROVIDES:${PN} += "libOpenEXR-3-1-30 \
libOpenEXR-3-1.so.30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libIex-3-1.so.30 \
libIlmThread-3-1.so.30 \
libImath-3-1.so.29 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
