SUMMARY = "Introspection bindings for the Anjuta plugin library"
DESCRIPTION = "Anjuta is a versatile Integrated Development Environment (IDE) for the \
GNOME desktop. \
 \
This package provides the GObject Introspection bindings for the Anjuta \
library to develop plugins."
LICENSE = "GPL-2.0-or-later"

PV = "3.34.0"

RPM_NAME = "typelib-1_0-Anjuta-3_0-3.34.0-5.7.aarch64.rpm"
RPM_HASH = "8448c2d4951e9543af4b25f06001c3ebef2585321410c6bdfb920e0c47bad49e961893c27c5591cfa22f90ba32f70961ed4948b22c1f407acb11e0f37cd3112c"

RPROVIDES:${PN} += "typelib(Anjuta) \
typelib(IAnjuta) \
typelib-1_0-Anjuta-3_0 \
typelib-1_0-Anjuta-3_0(aarch-64)"

RDEPENDS:${PN} += "libanjuta-3.so.0()(64bit) \
typelib(Atk) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gdl) \
typelib(Gio) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib)"

inherit rpm
