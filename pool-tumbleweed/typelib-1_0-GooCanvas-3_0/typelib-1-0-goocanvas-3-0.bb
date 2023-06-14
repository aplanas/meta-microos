SUMMARY = "Introspection bindings for GooCanvas"
DESCRIPTION = "GooCanvas is a canvas widget for GTK+ that uses the Cairo 2D library \
for drawing. \
 \
This package provides the GObject Introspection bindings for GooCanvas."
LICENSE = "LGPL-2.0-only"

PV = "3.0.0"

RPM_NAME = "typelib-1_0-GooCanvas-3_0-3.0.0-2.9.aarch64.rpm"
RPM_HASH = "ff5d0d27f0f3bf11e734d50a3e76f54999216239f839c2c42d9cec64417249cf9c05fea14f49d3b75f07f8853dfd2fb6407953124e65a5b16c73749027cc3c24"

RPROVIDES:${PN} += "typelib-1-0-GooCanvas-3-0 \
typelib-GooCanvas"

RDEPENDS:${PN} += "libgoocanvas-3.0.so.9 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
