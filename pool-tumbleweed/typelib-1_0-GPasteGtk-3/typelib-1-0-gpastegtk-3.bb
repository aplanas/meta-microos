SUMMARY = "Introspection bindings for the gpaste clipboard history manager"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This package provides the GObject Introspection bindings for the library \
managing clipboard history."
LICENSE = "BSD-2-Clause"

PV = "43.2+6"

RPM_NAME = "typelib-1_0-GPasteGtk-3-43.2+6-2.2.aarch64.rpm"
RPM_HASH = "d9bc5a674bbf517268ab81ab3df02414c1a8a908701d326323fd1c2dd13d434fe7f156b7ccfd690fc8a3e5f42c1119fcdbcfa6c248b48a99d2d90686566d64bf"

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
