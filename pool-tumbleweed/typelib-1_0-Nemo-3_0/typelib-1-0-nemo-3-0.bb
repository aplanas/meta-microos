SUMMARY = "File Browser for Cinnamon -- Introspection Bindings"
DESCRIPTION = "Nemo is the file manager for the Cinnamon desktop environment. \
 \
This package provides the GObject Introspection bindings for Nemo."
LICENSE = "GPL-2.0-or-later"

PV = "5.6.4"

RPM_NAME = "typelib-1_0-Nemo-3_0-5.6.4-1.3.aarch64.rpm"
RPM_HASH = "d04fc6298ad8742d660b0ccde891ee0fc9ed6ecbbac01fb451e936b54aa61f5879367a43de3688da18bdb80e85ed91947ecdf79fc2ef6440897a1fa020e4024c"

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
