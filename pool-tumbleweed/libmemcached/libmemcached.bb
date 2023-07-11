SUMMARY = "A C/C++ client library and tools for the memcached server"
DESCRIPTION = "Libmemcached is a C/C++ client library and tools for the memcached server \
(http://memcached.org/). It has been designed to be light on memory \
usage, thread safe, and provide full access to server side methods."
LICENSE = "BSD-3-Clause"

PV = "1.1.4"

RPM_NAME = "libmemcached-1.1.4-2.2.aarch64.rpm"
RPM_HASH = "e7b4b40f4fa759ec5be8dafe11fd54a95532e3442dd190aba43f3f75c4548e86f8b2af3f8fe2af77bac8ee399d1253c40aaa880b48cb2e25a8540d37e55dc5e2"

RPROVIDES:${PN} += "libmemcached"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libevent-2.1.so.7 \
libgcc-s.so.1 \
libm.so.6 \
libmemcached.so.11 \
libmemcachedutil.so.2 \
libstdc++.so.6"

inherit rpm
