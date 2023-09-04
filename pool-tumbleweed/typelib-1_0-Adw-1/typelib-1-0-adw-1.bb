SUMMARY = "Introspection bindings for Adwaita"
DESCRIPTION = "Building blocks for modern GNOME applications. \
This package provides the GObject Introspection bindings for libadwaita."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.4"

RPM_NAME = "typelib-1_0-Adw-1-1.3.4-1.1.aarch64.rpm"
RPM_HASH = "60d24f5787805d03c0f2b11f776e6bb3ec30e6c3a621731ce45c2fabfdc3c6143fa734337aa5ac1a5e9156f8dec086ca514f900907bafcc173cc93ff1b26013d"

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
