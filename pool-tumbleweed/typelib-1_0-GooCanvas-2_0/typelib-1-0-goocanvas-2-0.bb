SUMMARY = "Introspection bindings for GooCanvas"
DESCRIPTION = "GooCanvas is a canvas widget for GTK+ that uses the Cairo 2D library \
for drawing. \
 \
This package provides the GObject Introspection bindings for GooCanvas."
LICENSE = "LGPL-2.0-only"

PV = "2.0.4"

RPM_NAME = "typelib-1_0-GooCanvas-2_0-2.0.4-2.10.aarch64.rpm"
RPM_HASH = "1bd0561aa3794f2589f798001af17148609368ab2b13de322331463e0338026763b8fa2f6314284baf88c1155c935dfca3bc3aba7cf7e77f52baa22d4317d2d6"

RPROVIDES:${PN} += "typelib-1-0-GooCanvas-2-0 \
typelib-GooCanvas"

RDEPENDS:${PN} += "libgoocanvas-2.0.so.9 \
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
