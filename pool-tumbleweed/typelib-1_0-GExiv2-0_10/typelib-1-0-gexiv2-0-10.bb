SUMMARY = "A GObject-based Exiv2 wrapper - Introspection bindings"
DESCRIPTION = "gexiv2 is a GObject-based wrapper around the Exiv2 library. It makes the \
basic features of Exiv2 available to GNOME applications. \
 \
This package provides the GObject Introspection bindings for the \
libgexiv2 library."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.1"

RPM_NAME = "typelib-1_0-GExiv2-0_10-0.14.1-1.1.aarch64.rpm"
RPM_HASH = "22fe3dc243693361a8f558d8719cb5fd7b44949fdddc4d3ae0629af985117162cf0f40d42c57d35c3c0068c8392dbea76c4736843c8d2767555b04076172adb9"

RPROVIDES:${PN} += "typelib-1-0-GExiv2-0-10 \
typelib-GExiv2"

RDEPENDS:${PN} += "libgexiv2.so.2 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
