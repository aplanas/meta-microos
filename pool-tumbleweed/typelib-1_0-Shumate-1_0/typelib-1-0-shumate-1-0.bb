SUMMARY = "Introspection file for libshumate"
DESCRIPTION = "C library providing a GtkWidget to display maps. \
This package contains introspection file for libshumate."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "typelib-1_0-Shumate-1_0-1.0.5-1.1.aarch64.rpm"
RPM_HASH = "46d8b68f95c1b18402c18df6fa24340cbccffc8bacf0d82534faf37cdec56b97f74e21371c33919058d915f93cd3d15faf3447f934a65c23bff6a27957c4da0f"

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
