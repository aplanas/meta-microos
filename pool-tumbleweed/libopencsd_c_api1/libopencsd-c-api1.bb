SUMMARY = "C API for the CoreSight Trace Decode library"
DESCRIPTION = "C API for the OpenCSD library."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "libopencsd_c_api1-1.4.0-1.2.aarch64.rpm"
RPM_HASH = "175a1199f37779f26d029e5512098828dc070908c36eec648bed40bb63a3474cfe23eaac209b5d00c7fd228a914afaa1c801dbe2eb09053c3af698e32b089618"

RPROVIDES:${PN} += "libopencsd-c-api.so.1 \
libopencsd-c-api1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libopencsd.so.1 \
libstdc++.so.6"

inherit rpm
