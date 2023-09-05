SUMMARY = "Library to Handle EXR Pictures in 16-Bit Floating-Point Format"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains shared library libOpenEXRCore"
LICENSE = "BSD-3-Clause"

PV = "3.1.11"

RPM_NAME = "libOpenEXRCore-3_1-30-3.1.11-1.1.aarch64.rpm"
RPM_HASH = "f62e080630f42f5773a15db76860f4dd93e6d3b7f383ca465dac222b34101b321b5dbae90b2153f64aeef41b50ebd1a9a17496c4180e3f85c594977dfbc78401"

RPROVIDES:${PN} += "libOpenEXRCore-3-1-30 \
libOpenEXRCore-3-1.so.30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
