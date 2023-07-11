SUMMARY = "C API for the CoreSight Trace Decode library"
DESCRIPTION = "C API for the OpenCSD library."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "libopencsd_c_api1-1.4.0-1.3.aarch64.rpm"
RPM_HASH = "21b7deb8352d6409cb882921a6da41cc1c141a55a34b356604b919791dbb225897912f8e77f4507fe6eb363bb53f21625b4cfe116e3eef6f967a847b716ca70c"

RPROVIDES:${PN} += "libopencsd-c-api.so.1 \
libopencsd-c-api1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libopencsd.so.1 \
libstdc++.so.6"

inherit rpm
