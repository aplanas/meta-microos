SUMMARY = "Introspection bindings for the Granite development library"
DESCRIPTION = "Granite is an extension of GTK+. \
 \
This package provides the GObject Introspection bindings for libgranite."
LICENSE = "LGPL-3.0-or-later & LGPL-3.0-or-later"

PV = "6.2.0"

RPM_NAME = "typelib-1_0-Granite-1_0-6.2.0-1.8.aarch64.rpm"
RPM_HASH = "2508fe42205df304ea0addd7cc8f5de0b53f72391da9a1549949517dd282a2fee66baa1a10efe6ada8907e61a3edb3fa97fc53a230f876b2109a0edea8c28d8d"

RPROVIDES:${PN} += "typelib-1-0-Granite-1-0 \
typelib-Granite"

RDEPENDS:${PN} += "libgranite.so.6 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gee \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
