SUMMARY = "Thrift Zlib API"
DESCRIPTION = "A shared library from the Thrift software framework."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "libthriftz-0_17_0-0.17.0-1.9.aarch64.rpm"
RPM_HASH = "88638d3a1295be4229a5438e43e84b9c627981d231eae3335f207c8efc8e67091736ef1fd3444824327e8174cab22fa400bc053fafdc3c52868137a75c219a25"

RPROVIDES:${PN} += "libthriftz-0-17-0 \
libthriftz-0.17.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
