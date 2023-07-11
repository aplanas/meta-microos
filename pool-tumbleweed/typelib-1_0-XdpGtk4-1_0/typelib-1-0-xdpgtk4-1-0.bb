SUMMARY = "Introspections files for libportal"
DESCRIPTION = "A GIO-style async APIs for most Flatpak portals. \
This package contains the introspection files of libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "typelib-1_0-XdpGtk4-1_0-0.6-1.8.aarch64.rpm"
RPM_HASH = "8ae9b6e153681ab9df40868d05052e30af59b84ccd5c3004396992203b6b1e293193c5a31f1ef99cd6b6a294bcbe0aac61191f4d9f6fa97814dc72b550847af1"

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
