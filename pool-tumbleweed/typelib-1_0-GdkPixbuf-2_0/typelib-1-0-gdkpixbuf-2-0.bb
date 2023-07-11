SUMMARY = "Introspection bindings for gdk-pixbuf"
DESCRIPTION = "gdk-pixbuf is an image loading library that can be extended by loadable \
modules for new image formats. It is used by toolkits such as GTK+ or \
Clutter. \
 \
This package provides the GObject Introspection bindings for gdk-pixbuf."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.10"

RPM_NAME = "typelib-1_0-GdkPixbuf-2_0-2.42.10-1.5.aarch64.rpm"
RPM_HASH = "f4ec5c838d2da94354292fe0359fb789f73533cd22a61518d14139d15d1a08f5c81a7792b65278992b012ae5e723b7987271b8854ac490e308936afd5f672547"

RPROVIDES:${PN} += "typelib-1-0-GdkPixbuf-2-0 \
typelib-GdkPixbuf"

RDEPENDS:${PN} += "libgdk-pixbuf-2.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
