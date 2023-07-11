SUMMARY = "Introspection file for libshumate"
DESCRIPTION = "C library providing a GtkWidget to display maps. \
This package contains introspection file for libshumate."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.3"

RPM_NAME = "typelib-1_0-Shumate-1_0-1.0.3-1.4.aarch64.rpm"
RPM_HASH = "5f88e18657d11a4b4fab26a6f45dc73f6871c844dd4d5a861b7ea1d72b7eb95da1b6f9c7b027ba1d2549e5d8cd194d423ea717af42389d6406b7d1757a0b0944"

RPROVIDES:${PN} += "typelib-1-0-Shumate-1-0 \
typelib-Shumate"

RDEPENDS:${PN} += "libshumate-1.0.so.1 \
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
