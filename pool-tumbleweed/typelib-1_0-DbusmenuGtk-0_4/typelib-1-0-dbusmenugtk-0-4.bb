SUMMARY = "Introspection bindings for libdbusmenu-gtk4"
DESCRIPTION = "This package contains the GObject Introspection bindings for the GTK+ 2 version \
of the dbusmenu-gtk library."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "typelib-1_0-DbusmenuGtk-0_4-16.04.0-9.4.aarch64.rpm"
RPM_HASH = "290f01eb3d9c73fcd9ca4785dd5f5c33f0d486e4f9e6f0a1ab063962d2cbde7b5d79c24b14d0cc06b5c171b9202e6c6791af71bdce2b3b78e3570a07184e3f22"

RPROVIDES:${PN} += "typelib-1-0-DbusmenuGtk-0-4 \
typelib-DbusmenuGtk"

RDEPENDS:${PN} += "libdbusmenu-glib.so.4 \
libdbusmenu-gtk.so.4 \
typelib-Atk \
typelib-Dbusmenu \
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
typelib-freetype2"

inherit rpm
