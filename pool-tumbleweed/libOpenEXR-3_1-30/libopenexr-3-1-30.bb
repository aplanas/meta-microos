SUMMARY = "Library to Handle EXR Pictures in 16-Bit Floating-Point Format"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains shared library libOpenEXR"
LICENSE = "BSD-3-Clause"

PV = "3.1.7"

RPM_NAME = "libOpenEXR-3_1-30-3.1.7-1.1.aarch64.rpm"
RPM_HASH = "c1d0086a84684ac70943c89d7ae658bed4c24ebfcc7dacdd3c236fb6613d25baafd624e4b9d3d70f15110550901bec66e99ba68a2ab8d25e43d58855992d7499"

RPROVIDES:${PN} += "libOpenEXR-3_1-30 \
libOpenEXR-3_1-30(aarch-64) \
libOpenEXR-3_1.so.30()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libIex-3_1.so.30()(64bit) \
libIlmThread-3_1.so.30()(64bit) \
libImath-3_1.so.29()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
