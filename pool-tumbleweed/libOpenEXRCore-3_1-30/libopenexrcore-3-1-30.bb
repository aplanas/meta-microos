SUMMARY = "Library to Handle EXR Pictures in 16-Bit Floating-Point Format"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains shared library libOpenEXRCore"
LICENSE = "BSD-3-Clause"

PV = "3.1.7"

RPM_NAME = "libOpenEXRCore-3_1-30-3.1.7-1.1.aarch64.rpm"
RPM_HASH = "8788cf5757cc74551c3f43715cf2fa4f2ecde4136adb5313cda57aeddf026f758913cba9a23d70ec05dc6f70767852c0d95c2775d7b494a32c8ea77678c87abf"

RPROVIDES:${PN} += "libOpenEXRCore-3_1-30 \
libOpenEXRCore-3_1-30(aarch-64) \
libOpenEXRCore-3_1.so.30()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
