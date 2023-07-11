SUMMARY = "Introspection bindings for libhandy"
DESCRIPTION = "This package provides the GObject Introspection bindings for \
libhandy, a library to help with developing mobile UI using \
GTK+/GNOME."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.2"

RPM_NAME = "typelib-1_0-Handy-1_0-1.8.2-1.4.aarch64.rpm"
RPM_HASH = "d7ae86127552b0b523aa9b30f3400be66c6d2139517fea9c421a84295a7218da87d101fd0b65fb370f05db3fe14d182689a051965cb20cdbacdc1e60a3ecfadd"

RPROVIDES:${PN} += "typelib-1-0-Handy-1-0 \
typelib-Handy"

RDEPENDS:${PN} += "libhandy-1.so.0 \
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
