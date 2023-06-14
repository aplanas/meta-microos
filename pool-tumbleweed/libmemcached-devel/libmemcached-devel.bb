SUMMARY = "Libmemcached is a C/C++ client library and tools for the memcached server"
DESCRIPTION = "Libmemcached is a C/C++ client library and tools for the memcached server \
(http://memcached.org/). It has been designed to be light on memory \
usage, thread safe, and provide full access to server side methods."
LICENSE = "BSD-3-Clause"

PV = "1.1.4"

RPM_NAME = "libmemcached-devel-1.1.4-2.1.aarch64.rpm"
RPM_HASH = "f169c18e7caadf13ef74e1e5851f965c62da204637d81834899c5ceb174f74ed8907f1bd9332ca025abb2b41a685f3b5f253dce8486a354cdc2267f5220b2d5e"

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
