SUMMARY = "Introspection bindings for ghex"
DESCRIPTION = "This package provides introspection bindings for ghex."
LICENSE = "GPL-2.0-or-later"

PV = "44.2"

RPM_NAME = "typelib-1_0-Hex-4-44.2-1.1.aarch64.rpm"
RPM_HASH = "356abbb283fd29342721a03834a41f4dc1d1b277a953addc73520dfaab9118115b421904a3798f762e902ad0e8640d34acb97d3fc5a1069b079956bb9612fc62"

RPROVIDES:${PN} += "typelib-1-0-Hex-4 \
typelib-Hex"

RDEPENDS:${PN} += "libgtkhex-4.so.1 \
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
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm
