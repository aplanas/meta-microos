SUMMARY = "Introspection bindings for libhandy"
DESCRIPTION = "This package provides the GObject Introspection bindings for \
libhandy, a library to help with developing mobile UI using \
GTK+/GNOME."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.2"

RPM_NAME = "typelib-1_0-Handy-1_0-1.8.2-1.3.aarch64.rpm"
RPM_HASH = "faf2e80c0b14191bdfd28847a84a0b4c1bac17ee5dfb95683fb61a5789d2e690f9d0237829b256aace8219c8ca2ab8ba8dd79d85aba64dbb774c5844c78594a4"

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
