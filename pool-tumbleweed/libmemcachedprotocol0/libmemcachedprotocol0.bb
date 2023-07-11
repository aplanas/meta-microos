SUMMARY = "Libmemcached is a C/C++ client library and tools for the memcached server"
DESCRIPTION = "Libmemcached is a C/C++ client library and tools for the memcached server \
(http://memcached.org/). It has been designed to be light on memory \
usage, thread safe, and provide full access to server side methods. \
 \
The libmemcachedprotocol library contains functions with interacting with \
the memcached server."
LICENSE = "BSD-3-Clause"

PV = "1.1.4"

RPM_NAME = "libmemcachedprotocol0-1.1.4-2.2.aarch64.rpm"
RPM_HASH = "1438ef5e95b1fbe6eda16795046cdd6f44661a5f674957a44b4540ec2692d64dba523040ab7e59e00a4a3001a0f5d8390fa3928a7724d735798d96f5eec85c96"

RPROVIDES:${PN} += "libmemcachedprotocol.so.0 \
libmemcachedprotocol0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
