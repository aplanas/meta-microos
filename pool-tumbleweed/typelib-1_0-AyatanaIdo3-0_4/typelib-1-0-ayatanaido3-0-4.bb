SUMMARY = "Ayatana Indicator Display Objects typelib"
DESCRIPTION = "Shared library providing extra GTK menu items for display in \
system indicators. \
 \
This package provides the GObject Introspection bindings for \
Ayatana Ido."
LICENSE = "GPL-3.0-only & LGPL-3.0-only & LGPL-2.1-only"

PV = "0.9.2"

RPM_NAME = "typelib-1_0-AyatanaIdo3-0_4-0.9.2-1.5.aarch64.rpm"
RPM_HASH = "f34b24e4c882fd5b87a175a43f26b1d493e6cfdbe137ce36c7368796e8712f7ca9e072e66ce2ac44e0c3f98bb140ed6b8a16945d72d36e85ed7766689a3e68a3"

RPROVIDES:${PN} += "typelib-1-0-AyatanaIdo3-0-4 \
typelib-AyatanaIdo3"

RDEPENDS:${PN} += "libayatana-ido3-0.4.so.0 \
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
