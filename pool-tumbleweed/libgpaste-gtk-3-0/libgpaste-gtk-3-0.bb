SUMMARY = "Library for managing clipboard history"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This package provides a library for managing clipboard history."
LICENSE = "BSD-2-Clause"

PV = "43.2+6"

RPM_NAME = "libgpaste-gtk-3-0-43.2+6-2.2.aarch64.rpm"
RPM_HASH = "583f4f80048f6e26eb85b34cfb4bff299323044516efcedcf2535ffe4a1ca9015e7817bdb090e403d54f40916980e8e66f54f1d8c8980dee12f6733797ccdac3"

RPROVIDES:${PN} += "libgpaste-gtk-3-0 \
libgpaste-gtk-3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpaste-2.so.0 \
libgtk-3.so.0"

inherit rpm
