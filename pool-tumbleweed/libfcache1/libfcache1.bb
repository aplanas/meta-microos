SUMMARY = "Library to provide generic file data cache functions"
DESCRIPTION = "Library to provide generic file data cache functions for the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20230115"

RPM_NAME = "libfcache1-20230115-1.3.aarch64.rpm"
RPM_HASH = "1e406c34b9658d361433b74e1d1858f1d9e18e2026025d93e5bc2b5a4056317cc170740187ce64befecb11a4bad82fb3ec238eaba8d3e2f5850378db657e5aa9"

RPROVIDES:${PN} += "libfcache.so.1 \
libfcache1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1"

inherit rpm
