SUMMARY = "Introspections files for libportal"
DESCRIPTION = "A GIO-style async APIs for most Flatpak portals. \
This package contains the introspection files of libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7"

RPM_NAME = "typelib-1_0-XdpGtk4-1_0-0.7-1.1.aarch64.rpm"
RPM_HASH = "17b521ab0c601687d94e45ee7b685755a9a686d48683b27767fb486fa366577e5a5cbfc30b0498e532a5fefaa4a8d6d673a62afcab9025a03ce114c5941616d9"

RPROVIDES:${PN} += "typelib-1-0-XdpGtk4-1-0 \
typelib-XdpGtk4"

RDEPENDS:${PN} += "libportal-gtk4.so.1 \
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
typelib-Xdp \
typelib-cairo \
typelib-freetype2"

inherit rpm
