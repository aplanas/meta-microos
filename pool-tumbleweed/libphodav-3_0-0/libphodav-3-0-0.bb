SUMMARY = "A library for file sharing with WebDAV"
DESCRIPTION = "phodav is a WebDav server implementation using libsoup (RFC 4918). \
 \
This package provides the shared library for phodav."
LICENSE = "LGPL-2.0-or-later"

PV = "3.0"

RPM_NAME = "libphodav-3_0-0-3.0-1.4.aarch64.rpm"
RPM_HASH = "7bc73e61976f0dd2f95c4bd95b13631a3d61d261e6ee968c0663fbf2155453c8d51c0a0852ff0b8f0abdd918fa6e64fc524744a87fa56a49d9b00a72071436c8"

RPROVIDES:${PN} += "libphodav-3-0-0 \
libphodav-3.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsoup-3.0.so.0 \
libxml2.so.2"

inherit rpm
