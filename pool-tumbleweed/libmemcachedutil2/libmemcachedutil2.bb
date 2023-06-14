SUMMARY = "Libmemcached is a C/C++ client library and tools for the memcached server"
DESCRIPTION = "Libmemcached is a C/C++ client library and tools for the memcached server \
(http://memcached.org/). It has been designed to be light on memory \
usage, thread safe, and provide full access to server side methods. \
 \
The libmemcachedutil library contains utility functions used by \
libmemcached."
LICENSE = "BSD-3-Clause"

PV = "1.1.4"

RPM_NAME = "libmemcachedutil2-1.1.4-2.1.aarch64.rpm"
RPM_HASH = "9a12bc7389906b147f4d5cfa537af035cee13b8bd85de1dd9779bf5809ea6d96d964ca306f4b201a2c33c6996aa07ff58110a57b39edbc2fdafd0ac5571d160a"

RPROVIDES:${PN} += "libhashkit.so.2 \
libmemcachedutil.so.2 \
libmemcachedutil2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmemcached.so.11 \
libstdc++.so.6"

inherit rpm
