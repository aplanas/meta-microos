SUMMARY = "Introspection bindings for the GTK+ spell checker library"
DESCRIPTION = "gspell provides a flexible API to implement the spell checking in a GTK+ \
application. \
 \
This package provides the GObject Introspection bindings for gspell."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.2"

RPM_NAME = "typelib-1_0-Gspell-1-1.12.2-1.1.aarch64.rpm"
RPM_HASH = "b0cdff8b0280340633deca8b5369d35e72b660e5eeb6111496440c92330620380afbbdffee75f11b4d33f1c156f6002d8b0625408f8a2dfdd5075902299e72e8"

RPROVIDES:${PN} += "typelib-1-0-Gspell-1 \
typelib-Gspell"

RDEPENDS:${PN} += "libgspell-1.so.2 \
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
