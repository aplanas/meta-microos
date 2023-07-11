SUMMARY = "Libmemcached is a C/C++ client library and tools for the memcached server"
DESCRIPTION = "Libmemcached is a C/C++ client library and tools for the memcached server \
(http://memcached.org/). It has been designed to be light on memory \
usage, thread safe, and provide full access to server side methods. \
 \
The libmemcachedutil library contains utility functions used by \
libmemcached."
LICENSE = "BSD-3-Clause"

PV = "1.1.4"

RPM_NAME = "libmemcachedutil2-1.1.4-2.2.aarch64.rpm"
RPM_HASH = "8b90f1a66a4f6d8348251ede905992ff7818d21747400a98f65e2bb18b47cf60d76b6c858498206497d9eee43d63db3c300999d385f74f371d8858b8bfa2e24c"

RPROVIDES:${PN} += "libhashkit.so.2 \
libmemcachedutil.so.2 \
libmemcachedutil2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmemcached.so.11 \
libstdc++.so.6"

inherit rpm
