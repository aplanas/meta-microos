SUMMARY = "Introspection bindings for ghex"
DESCRIPTION = "This package provides introspection bindings for ghex."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "typelib-1_0-Hex-4-44.1-1.1.aarch64.rpm"
RPM_HASH = "697c367e0160e6b8eaf59d8c7fec2fcc7b1217b6130c866c42a62077f2a6d597792e9123d089622e236158debe70b5708b63b258ee616f79c9389a47b360913d"

RPROVIDES:${PN} += "typelib(Hex) \
typelib-1_0-Hex-4 \
typelib-1_0-Hex-4(aarch-64)"

RDEPENDS:${PN} += "libgtkhex-4.so.1()(64bit) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Graphene) \
typelib(Gsk) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(PangoCairo) \
typelib(cairo) \
typelib(freetype2)"

inherit rpm
