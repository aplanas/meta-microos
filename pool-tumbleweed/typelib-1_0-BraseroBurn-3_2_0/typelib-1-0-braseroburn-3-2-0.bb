SUMMARY = "Introspection bindings for libbrasero-burn"
DESCRIPTION = "Brasero is an application for the GNOME Desktop to write CD/DVDs. \
 \
This package provides the GObject Introspection bindings for the \
libbrasero-burn library."
LICENSE = "GPL-3.0-or-later"

PV = "3.12.3"

RPM_NAME = "typelib-1_0-BraseroBurn-3_2_0-3.12.3-2.8.aarch64.rpm"
RPM_HASH = "7bf017c02a7327212b33b22d75bcf8597500413c94c7d6ce056f3b354793cbdb1243f3dacc6cce890577c7638b57472d93aed718b90b8baeebfcd63efdfc5ea8"

RPROVIDES:${PN} += "typelib-1-0-BraseroBurn-3-2-0 \
typelib-BraseroBurn"

RDEPENDS:${PN} += "libbrasero-burn3.so.1 \
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
