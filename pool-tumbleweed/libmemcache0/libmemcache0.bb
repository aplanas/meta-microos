SUMMARY = "A client library for memcached"
DESCRIPTION = "libmemcache implements a client for the superior memcached from Danga \
Interactive. \
 \
This package holds the shared libraries from libmemcache."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.4.0.rc2"

RPM_NAME = "libmemcache0-1.4.0.rc2-152.25.aarch64.rpm"
RPM_HASH = "d38740afc53d008ae9d87cfa6039e970421827ba2022692f492f67e7e300022b6ed1a5d9e2eb4a7a3c6db5c9f051aed886a6721948e587da85022a6c9d8105d4"

RPROVIDES:${PN} += "libmemcache.so.0()(64bit) \
libmemcache0 \
libmemcache0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
