SUMMARY = "Introspection bindings for the gpaste clipboard history manager"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This package provides the GObject Introspection bindings for the library \
managing clipboard history."
LICENSE = "BSD-2-Clause"

PV = "44.1"

RPM_NAME = "typelib-1_0-GPasteGtk-3-44.1-1.1.aarch64.rpm"
RPM_HASH = "044a3fd01350290b5d7cecf3de902a65101585be025aa7a068ad38872d11ebf7f2336810f01d86328a0cd53f6cd310ad9c3c0e09dbdbafb3be47fa6868d8bb1e"

RPROVIDES:${PN} += "typelib-1-0-GPasteGtk-3 \
typelib-GPasteGtk"

RDEPENDS:${PN} += "libgpaste-gtk-3.so.0 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GPaste \
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
