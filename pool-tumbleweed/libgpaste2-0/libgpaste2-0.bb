SUMMARY = "Library for managing clipboard history"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This package provides a library for managing clipboard history."
LICENSE = "BSD-2-Clause"

PV = "44.1"

RPM_NAME = "libgpaste2-0-44.1-1.1.aarch64.rpm"
RPM_HASH = "6af43e5e3866e3651a4573b3e6ca2044087dce91878fe9eec9e4a8d2eb80455e5820d5f2287b5c80316c0c2405a583bf0a7afc2b288fd7e8ba8aa8200cfdbbca"

RPROVIDES:${PN} += "libgpaste-2.so.0 \
libgpaste2-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
