SUMMARY = "Introspection bindings for the Gnome Devtool libraries"
DESCRIPTION = "Gnome Devtool Libraries contains components and libraries that are \
intended to be shared between GNOME development tools, including \
gnome-debug, gnome-build, and anjuta2. \
 \
This package provides the GObject Introspection bindings for GDL."
LICENSE = "LGPL-2.1-or-later"

PV = "3.40.0"

RPM_NAME = "typelib-1_0-Gdl-3-3.40.0-2.10.aarch64.rpm"
RPM_HASH = "1e968367228cba63a29314313decbed130ef50dcd80de67ca7b4d6da88b16a7c320f2c6dee38c686c87dbd68f4b1e92bd47d422c967015bcf222a279dd23a463"

RPROVIDES:${PN} += "typelib-1-0-Gdl-3 \
typelib-Gdl"

RDEPENDS:${PN} += "libgdl-3.so.5 \
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
