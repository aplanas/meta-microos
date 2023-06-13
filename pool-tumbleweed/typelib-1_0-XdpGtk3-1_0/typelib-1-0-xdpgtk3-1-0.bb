SUMMARY = "Introspections files for libportal"
DESCRIPTION = "A GIO-style async APIs for most Flatpak portals. \
This package contains the introspection files of libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "typelib-1_0-XdpGtk3-1_0-0.6-1.7.aarch64.rpm"
RPM_HASH = "a2cc46cb4d1a754e4b19686231d4772cc1a683231656867eed3cd0a8a0eea7268a10e09c844c631a0c830a9d75863825d06f33454661b0d267485f659da68ec3"

RPROVIDES:${PN} += "typelib(XdpGtk3) \
typelib-1_0-XdpGtk3-1_0 \
typelib-1_0-XdpGtk3-1_0(aarch-64)"

RDEPENDS:${PN} += "libportal-gtk3.so.1()(64bit) \
typelib(Atk) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(Xdp) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib)"

inherit rpm
