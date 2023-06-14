SUMMARY = "Introspection bindings for gdk-pixbuf"
DESCRIPTION = "gdk-pixbuf is an image loading library that can be extended by loadable \
modules for new image formats. It is used by toolkits such as GTK+ or \
Clutter. \
 \
This package provides the GObject Introspection bindings for gdk-pixbuf."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.10"

RPM_NAME = "typelib-1_0-GdkPixbuf-2_0-2.42.10-1.4.aarch64.rpm"
RPM_HASH = "aa991def8472dc52ca63ba2e5b7060ca7e48f956584c99ee8cd0f9da39d5a2ae307c74212a5b9526d6456853c3d39b5e50e781d2738456ef8857675c6f2c2e19"

RPROVIDES:${PN} += "typelib-1-0-GdkPixbuf-2-0 \
typelib-GdkPixbuf"

RDEPENDS:${PN} += "libgdk-pixbuf-2.0.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
