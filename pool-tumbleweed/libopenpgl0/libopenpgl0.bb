SUMMARY = "Open Path Guiding Library"
DESCRIPTION = "Open Path Guiding Library (Intel® Open PGL) implements a set of representations \
and training algorithms needed to integrate path guiding into a renderer. Open \
PGL offers implementations of current state-of-the-art path guiding methods, \
which increase the sampling quality and, therefore, the efficiency of a \
renderer."
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "libopenpgl0-0.4.1-1.4.aarch64.rpm"
RPM_HASH = "ac760216427d34e5f2cf18abe77b06f811b9a6127d187f0b226cb58ee1e189963fbd363726576208bd7ad6d3dea5f2b2b8dcd3bf295494a0b8e78e16963f4fd7"

RPROVIDES:${PN} += "libopenpgl.so.0 \
libopenpgl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtbb.so.12"

inherit rpm
