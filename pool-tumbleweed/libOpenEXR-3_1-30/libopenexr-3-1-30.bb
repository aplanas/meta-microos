SUMMARY = "Library to Handle EXR Pictures in 16-Bit Floating-Point Format"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains shared library libOpenEXR"
LICENSE = "BSD-3-Clause"

PV = "3.1.9"

RPM_NAME = "libOpenEXR-3_1-30-3.1.9-2.1.aarch64.rpm"
RPM_HASH = "9dc4bada8f70a2eb50efbca2d94b4f762cae180178a6bf55019ec88e7a50be72924c4d3a7954eec6c3e26694dee6d6ca962cb9927cc8e8d49d5496334fb59b54"

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
