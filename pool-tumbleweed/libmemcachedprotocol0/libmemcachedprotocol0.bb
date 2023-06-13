SUMMARY = "Libmemcached is a C/C++ client library and tools for the memcached server"
DESCRIPTION = "Libmemcached is a C/C++ client library and tools for the memcached server \
(http://memcached.org/). It has been designed to be light on memory \
usage, thread safe, and provide full access to server side methods. \
 \
The libmemcachedprotocol library contains functions with interacting with \
the memcached server."
LICENSE = "BSD-3-Clause"

PV = "1.1.4"

RPM_NAME = "libmemcachedprotocol0-1.1.4-2.1.aarch64.rpm"
RPM_HASH = "c0d2bea17e9ce7fd1d8a5160cdab271f0a9ea1bea50a75d1d9263096fa3e029eb032751cb553fcf49484f08ccd8c401c36e6fe281a7c99a7cce4d998811bfba7"

RPROVIDES:${PN} += "libmemcachedprotocol.so.0()(64bit) \
libmemcachedprotocol0 \
libmemcachedprotocol0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
