SUMMARY = "Introspections files for libportal"
DESCRIPTION = "A GIO-style async APIs for most Flatpak portals. \
This package contains the introspection files of libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "typelib-1_0-XdpGtk4-1_0-0.6-1.7.aarch64.rpm"
RPM_HASH = "e3c8ff7004c9afd329191950c841ccafc41b5a0b77d7f5a27f21bb21619bacc1dc09c2335de1154cc0a05c262857bff432a1a7a60f535fd5cf4a799c26b2e902"

RPROVIDES:${PN} += "typelib(XdpGtk4) \
typelib-1_0-XdpGtk4-1_0 \
typelib-1_0-XdpGtk4-1_0(aarch-64)"

RDEPENDS:${PN} += "libportal-gtk4.so.1()(64bit) \
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
typelib(Xdp) \
typelib(cairo) \
typelib(freetype2)"

inherit rpm
