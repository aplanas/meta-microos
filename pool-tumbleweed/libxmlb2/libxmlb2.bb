SUMMARY = "Library for querying compressed XML metadata"
DESCRIPTION = "This package provides the shared library for libxmlb."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.13"

RPM_NAME = "libxmlb2-0.3.13-1.1.aarch64.rpm"
RPM_HASH = "ebe504f4bb6506e696cbbe6ea6e73e538890b305dfb9c46157ff031a5a0b369459eb15aa4fcd9b30eca14d42ab7230ce6b614a8deb87c25c811eb1312258fa79"

RPROVIDES:${PN} += "libxmlb.so.2 \
libxmlb2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liblzma.so.5 \
libzstd.so.1"

inherit rpm
