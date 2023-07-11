SUMMARY = "Introspection bindings for the gpaste clipboard history manager"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This package provides the GObject Introspection bindings for the library \
managing clipboard history."
LICENSE = "BSD-2-Clause"

PV = "43.2+6"

RPM_NAME = "typelib-1_0-GPasteGtk-4-43.2+6-2.2.aarch64.rpm"
RPM_HASH = "588317305abfc71d4a7a6c1a9284e8ec592184e312e7885e04063d8033e862abfdd071e89ff92fdf010f21f666d55679e7ba45c8f145fa6ab8fc2115bdbb4e09"

RPROVIDES:${PN} += "typelib-1-0-GPasteGtk-4 \
typelib-GPasteGtk"

RDEPENDS:${PN} += "libgpaste-gtk4.so.0 \
typelib-Adw \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GPaste \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm
