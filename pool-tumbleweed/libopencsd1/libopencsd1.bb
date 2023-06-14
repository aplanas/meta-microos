SUMMARY = "C++ API for the CoreSight Trace Decode library"
DESCRIPTION = "C++ API for the OpenCSD library."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "libopencsd1-1.4.0-1.2.aarch64.rpm"
RPM_HASH = "4d2ba60a67b48d590b331db6a56397684f05c2db830191fd88d26e2b8fe04c6e7bd0bb9ed4f57cf551a771b49cebc16a0e4cbde4e6377999c5a7569d436983a3"

RPROVIDES:${PN} += "libopencsd.so.1 \
libopencsd1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
