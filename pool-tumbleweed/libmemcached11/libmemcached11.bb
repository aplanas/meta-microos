SUMMARY = "Libmemcached is a C/C++ client library and tools for the memcached server"
DESCRIPTION = "Libmemcached is a C/C++ client library and tools for the memcached server \
(http://memcached.org/). It has been designed to be light on memory \
usage, thread safe, and provide full access to server side methods."
LICENSE = "BSD-3-Clause"

PV = "1.1.4"

RPM_NAME = "libmemcached11-1.1.4-2.2.aarch64.rpm"
RPM_HASH = "a1e4f0d8f84c4f6ca27ee9b308dc55483905e257840269dd1259bf90b65faabb70c95abd55378e9fdcdc21fc626131b501d24e7796150c35f62a1f60cbebb8de"

RPROVIDES:${PN} += "libmemcached.so.11 \
libmemcached11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhashkit.so.2 \
libsasl2.so.3 \
libstdc++.so.6"

inherit rpm
