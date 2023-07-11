SUMMARY = "Libmemcached is a C/C++ client library and tools for the memcached server"
DESCRIPTION = "Libmemcached is a C/C++ client library and tools for the memcached server \
(http://memcached.org/). It has been designed to be light on memory \
usage, thread safe, and provide full access to server side methods."
LICENSE = "BSD-3-Clause"

PV = "1.1.4"

RPM_NAME = "libmemcached-devel-1.1.4-2.2.aarch64.rpm"
RPM_HASH = "f4a32b0dc3ba6d56f5dc55b2bbc277200b9b5ffeb05067bb72d06842df399b504dc5320382a179cf575e2fd20fa87cb687d90066fb924efd3c19f1e5450c18ff"

RPROVIDES:${PN} += "cmake-libmemcached \
libmemcached-devel \
pkgconfig-libmemcached"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cyrus-sasl-devel \
glibc-devel \
libmemcached \
libmemcached11 \
libmemcachedprotocol0 \
libmemcachedutil2 \
pkgconfig-libsasl2"

inherit rpm
