SUMMARY = "A client library for memcached"
DESCRIPTION = "libmemcache implements a client for the superior memcached from Danga \
Interactive. \
 \
This package holds the shared libraries from libmemcache."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.4.0.rc2"

RPM_NAME = "libmemcache0-1.4.0.rc2-152.26.aarch64.rpm"
RPM_HASH = "5fbc27a31c781b094a1f562fecf619ded813cfa6041209e3c4328a80e46aa27441d320e5d8c7f7835481769acca1506ac4af6c3eb24d08cbe31169c8d2c362d0"

RPROVIDES:${PN} += "libmemcache.so.0 \
libmemcache0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
