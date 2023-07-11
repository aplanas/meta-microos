SUMMARY = "Library to Handle EXR Pictures in 16-Bit Floating-Point Format"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains shared library libOpenEXR"
LICENSE = "BSD-3-Clause"

PV = "3.1.7"

RPM_NAME = "libOpenEXR-3_1-30-3.1.7-1.2.aarch64.rpm"
RPM_HASH = "7a34bbcf49dda1bc6091c9280c2e9422310627b0494fddc2846ac6c9b469996dbaf426c824717d6a3cf58bbecd7db56609d6ba2f756f3663113fe12138806b9b"

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
