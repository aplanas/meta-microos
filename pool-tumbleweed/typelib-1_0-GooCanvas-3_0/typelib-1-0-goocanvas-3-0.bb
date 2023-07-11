SUMMARY = "Introspection bindings for GooCanvas"
DESCRIPTION = "GooCanvas is a canvas widget for GTK+ that uses the Cairo 2D library \
for drawing. \
 \
This package provides the GObject Introspection bindings for GooCanvas."
LICENSE = "LGPL-2.0-only"

PV = "3.0.0"

RPM_NAME = "typelib-1_0-GooCanvas-3_0-3.0.0-2.10.aarch64.rpm"
RPM_HASH = "c994bd49896025b9f8aba1fc7117c44ee1d3053358e6ed05aa49365d586b9e1a882915329089fd98be94f24144205b41a7b56398c3ededcd0ae102780c03b2d4"

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
