SUMMARY = "File Browser for Cinnamon -- Introspection Bindings"
DESCRIPTION = "Nemo is the file manager for the Cinnamon desktop environment. \
 \
This package provides the GObject Introspection bindings for Nemo."
LICENSE = "GPL-2.0-or-later"

PV = "5.6.4"

RPM_NAME = "typelib-1_0-Nemo-3_0-5.6.4-1.2.aarch64.rpm"
RPM_HASH = "75782c07b9fce150cce5c56f305d03d470e4eee0887e2025c5377d8d8c735c4547d729d8a41feb41d2dd230c7a07107d8e7790a021ef270ebae85172e8f34730"

RPROVIDES:${PN} += "typelib-1-0-Nemo-3-0 \
typelib-Nemo"

RDEPENDS:${PN} += "libnemo-extension.so.1 \
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
