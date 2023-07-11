SUMMARY = "Library for managing clipboard history"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This package provides a library for managing clipboard history."
LICENSE = "BSD-2-Clause"

PV = "43.2+6"

RPM_NAME = "libgpaste2-0-43.2+6-2.2.aarch64.rpm"
RPM_HASH = "69e50abf24d7ff68b440c433051541047c438f1f73a8bdb68110691fbf58644754c58b5661f7ef8cc01ed57edf3198bd6921e9031c4abfb7fbcc96b2d1e6200b"

RPROVIDES:${PN} += "libgpaste-2.so.0 \
libgpaste2-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
