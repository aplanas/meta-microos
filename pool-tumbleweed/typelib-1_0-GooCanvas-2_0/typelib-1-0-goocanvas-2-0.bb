SUMMARY = "Introspection bindings for GooCanvas"
DESCRIPTION = "GooCanvas is a canvas widget for GTK+ that uses the Cairo 2D library \
for drawing. \
 \
This package provides the GObject Introspection bindings for GooCanvas."
LICENSE = "LGPL-2.0-only"

PV = "2.0.4"

RPM_NAME = "typelib-1_0-GooCanvas-2_0-2.0.4-2.9.aarch64.rpm"
RPM_HASH = "14749b8f3d989f07cae4bb54cc65c4bd14a5365c59a138915464172df1f654844df18ab337815dd53fabe85c55d1c373058d390b2bf4aaf0d4fd0f73763d6dbb"

RPROVIDES:${PN} += "typelib(GooCanvas) \
typelib-1_0-GooCanvas-2_0 \
typelib-1_0-GooCanvas-2_0(aarch-64)"

RDEPENDS:${PN} += "libgoocanvas-2.0.so.9()(64bit) \
typelib(Atk) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib)"

inherit rpm
