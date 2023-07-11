SUMMARY = "Library files for fipscheck"
DESCRIPTION = "This package contains the FIPSCheck library."
LICENSE = "BSD-2-Clause"

PV = "1.7.0"

RPM_NAME = "libfipscheck1-1.7.0-1.6.aarch64.rpm"
RPM_HASH = "f95a40fc0cbbe42d27384fcdf8d26ef4755798faf584cad03a83bdfadebb971ee5604f8f78fa9ef3d204c06652762e4aa2d0908b602afdd093a2e21ce3d9f78d"

RPROVIDES:${PN} += "libfipscheck.so.1 \
libfipscheck1"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/fipscheck \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
