SUMMARY = "Introspection bindings for Adwaita"
DESCRIPTION = "Building blocks for modern GNOME applications. \
This package provides the GObject Introspection bindings for libadwaita."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.3"

RPM_NAME = "typelib-1_0-Adw-1-1.3.3-1.1.aarch64.rpm"
RPM_HASH = "a30068f380a821655246302ad8d422b222294a0d36bf619b15361bc3be4b49680d85d6387230391b2350088d9d44c44915ef3d1ab569b3d30e3ac7797a2a8ca2"

RPROVIDES:${PN} += "typelib-1-0-Adw-1 \
typelib-Adw"

RDEPENDS:${PN} += "libadwaita-1.so.0 \
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
