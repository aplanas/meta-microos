SUMMARY = "Introspection bindings for the Clutter library"
DESCRIPTION = "Clutter is a library for creating fast, visually rich and animated \
graphical user interfaces. It uses OpenGL (or GLES) for rendering. \
 \
This package provides the GObject Introspection bindings for Clutter."
LICENSE = "LGPL-2.1-or-later"

PV = "1.26.4"

RPM_NAME = "typelib-1_0-Clutter-1_0-1.26.4-4.10.aarch64.rpm"
RPM_HASH = "bee5d63ef4a7a9b5a3970ef1c6374feed1eca6c00a1c70cc7213dbafc5573e0a7b3e892898d394851078159ba7d5612df1470f52836ff83700383d961d1fac37"

RPROVIDES:${PN} += "typelib(Cally) \
typelib(Clutter) \
typelib(ClutterGdk) \
typelib(ClutterX11) \
typelib-1_0-Clutter-1_0 \
typelib-1_0-Clutter-1_0(aarch-64)"

RDEPENDS:${PN} += "libclutter-1.0.so.0()(64bit) \
typelib(Atk) \
typelib(Cogl) \
typelib(CoglPango) \
typelib(GL) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(HarfBuzz) \
typelib(Json) \
typelib(Pango) \
typelib(PangoCairo) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib)"

inherit rpm
