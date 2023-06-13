SUMMARY = "A C/C++ client library and tools for the memcached server"
DESCRIPTION = "Libmemcached is a C/C++ client library and tools for the memcached server \
(http://memcached.org/). It has been designed to be light on memory \
usage, thread safe, and provide full access to server side methods."
LICENSE = "BSD-3-Clause"

PV = "1.1.4"

RPM_NAME = "libmemcached-1.1.4-2.1.aarch64.rpm"
RPM_HASH = "1bc5b12946af35186295dee39f77f410de8ec8261c41d6b445bc18c6ea322d6fb46d02c367a1e1a58c20ead307d0d9dd3157d1c5b32f0328c246564422e9abd3"

RPROVIDES:${PN} += "libmemcached \
libmemcached(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libevent-2.1.so.7()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libmemcached.so.11()(64bit) \
libmemcachedutil.so.2()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
