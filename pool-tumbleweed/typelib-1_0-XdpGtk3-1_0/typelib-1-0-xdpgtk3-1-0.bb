SUMMARY = "Introspections files for libportal"
DESCRIPTION = "A GIO-style async APIs for most Flatpak portals. \
This package contains the introspection files of libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7"

RPM_NAME = "typelib-1_0-XdpGtk3-1_0-0.7-1.1.aarch64.rpm"
RPM_HASH = "7f2143e58c32ee7c233f0f86b7e3e6f44975585a2239ed6946206d679b4c5e5b90bbd9a984c7a188c3fccbed3d60c8828cd3ce3c6088f7465b0b2c1c40a5cbea"

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
