SUMMARY = "Introspection bindings for libnma"
DESCRIPTION = "Introspection bindings for libnma."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.6"

RPM_NAME = "typelib-1_0-NMA4-1_0-1.10.6-1.4.aarch64.rpm"
RPM_HASH = "ae6d9f088f7db7d2b0da4f62220f94f076ddd16a050141381384b00f714607c6d73fa3087bed0f83d888a6d72936227c18b9178cdf17e8ab7435b0b9bb4f4c96"

RPROVIDES:${PN} += "typelib-1-0-NMA4-1-0 \
typelib-NMA4"

RDEPENDS:${PN} += "libnma-gtk4.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk \
typelib-HarfBuzz \
typelib-NM \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm
