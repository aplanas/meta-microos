SUMMARY = "Library to manipulate F2 filesystems"
DESCRIPTION = "This package contains a shared library used for manipulation of F2 \
filesystems."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.15.0"

RPM_NAME = "libf2fs9-1.15.0-2.4.aarch64.rpm"
RPM_HASH = "b3ea20ff9527d4e33e0f2ce0956d29c4c14fa56756770c56994fc623d3fa824c20de85a961f504f713c2d9e309e6b0792cb59408ebbb8898302fc0cd1aa4f287"

RPROVIDES:${PN} += "libf2fs.so.9 \
libf2fs9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
