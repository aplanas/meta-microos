SUMMARY = "Library to simplify development of OpenEXR utilities"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains shared library libOpenEXRUtil"
LICENSE = "BSD-3-Clause"

PV = "3.1.7"

RPM_NAME = "libOpenEXRUtil-3_1-30-3.1.7-1.1.aarch64.rpm"
RPM_HASH = "80b75f81142ced0e471bda456101566cbb47b7c011f4ebdec0af0c726570fab39d64581bb5976e3e985d6e05eb14240f146aaed196843f8597150b2f81487afb"

RPROVIDES:${PN} += "libOpenEXRUtil-3_1-30 \
libOpenEXRUtil-3_1-30(aarch-64) \
libOpenEXRUtil-3_1.so.30()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libIex-3_1.so.30()(64bit) \
libOpenEXR-3_1.so.30()(64bit) \
libOpenEXRCore-3_1.so.30()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
