SUMMARY = "Library for managing clipboard history"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This package provides a library for managing clipboard history."
LICENSE = "BSD-2-Clause"

PV = "44.1"

RPM_NAME = "libgpaste-gtk-3-0-44.1-1.1.aarch64.rpm"
RPM_HASH = "a92543b07cc458a1dbd9da7347ad87dfbf2bb1cad343fd9d8fedf7652c02d4c74a35fb491d36a370f650e740069ec9ddcf142850ae1cb6b218bbfb5aee74b20e"

RPROVIDES:${PN} += "libgpaste-gtk-3-0 \
libgpaste-gtk-3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpaste-2.so.0 \
libgtk-3.so.0"

inherit rpm
