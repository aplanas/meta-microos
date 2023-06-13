SUMMARY = "Library for managing clipboard history"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This package provides a library for managing clipboard history."
LICENSE = "BSD-2-Clause"

PV = "43.2+6"

RPM_NAME = "libgpaste2-0-43.2+6-2.1.aarch64.rpm"
RPM_HASH = "db7b2e8bfe5a57f37c3b17d7a527645dba1d6f354ee9e22b0044e88ab5deb8be66fd6ded2d6f3adcbcc1eaea2e6ee73e6884f5c7db3fa81355b7ec39bc58d179"

RPROVIDES:${PN} += "libgpaste-2.so.0()(64bit) \
libgpaste-2.so.0(LIBGPASTE_42)(64bit) \
libgpaste2-0 \
libgpaste2-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
