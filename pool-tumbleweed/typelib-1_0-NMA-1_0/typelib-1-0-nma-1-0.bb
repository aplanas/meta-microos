SUMMARY = "Introspection bindings for libnma"
DESCRIPTION = "Introspection bindings for libnma."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.6"

RPM_NAME = "typelib-1_0-NMA-1_0-1.10.6-1.4.aarch64.rpm"
RPM_HASH = "cdcf97b3089955805ac8c44e2d98d4db560a96bad02f15c0abba7b3448f74cafd95482b5a37b88c973730c04cc7d07c8d9d3e8e985173c2f684844f5a8376ba7"

RPROVIDES:${PN} += "typelib-1-0-NMA-1-0 \
typelib-NMA"

RDEPENDS:${PN} += "libnma.so.0 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-NM \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
