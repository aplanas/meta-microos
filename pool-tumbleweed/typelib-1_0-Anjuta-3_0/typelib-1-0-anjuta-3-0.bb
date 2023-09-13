SUMMARY = "Introspection bindings for the Anjuta plugin library"
DESCRIPTION = "Anjuta is a versatile Integrated Development Environment (IDE) for the \
GNOME desktop. \
 \
This package provides the GObject Introspection bindings for the Anjuta \
library to develop plugins."
LICENSE = "GPL-2.0-or-later"

PV = "3.34.0"

RPM_NAME = "typelib-1_0-Anjuta-3_0-3.34.0-5.8.aarch64.rpm"
RPM_HASH = "16ed65a85e93aeb463d6395cd3d467b8c9cba84855f4acc303b2d8383959fe83035a57c896d21b941050db4240899bbb6e880ce8ec4773f4f12979176a2398ba"

RPROVIDES:${PN} += "typelib-1-0-Anjuta-3-0 \
typelib-Anjuta \
typelib-IAnjuta"

RDEPENDS:${PN} += "libanjuta-3.so.0 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gdl \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
