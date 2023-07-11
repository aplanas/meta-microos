SUMMARY = "Introspections files for libportal"
DESCRIPTION = "A GIO-style async APIs for most Flatpak portals. \
This package contains the introspection files of libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "typelib-1_0-XdpGtk3-1_0-0.6-1.8.aarch64.rpm"
RPM_HASH = "a81d8532403628a5e64a9b1719fbab96a008d96537fa4d106d8c05bc084d3ac78ba138525cab240085ea99d023214f1cbcee0878b987e96a93370de8b36e2b5d"

RPROVIDES:${PN} += "typelib-1-0-XdpGtk3-1-0 \
typelib-XdpGtk3"

RDEPENDS:${PN} += "libportal-gtk3.so.1 \
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
typelib-Xdp \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
