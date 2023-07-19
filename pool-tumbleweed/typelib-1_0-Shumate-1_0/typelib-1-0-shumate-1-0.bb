SUMMARY = "Introspection file for libshumate"
DESCRIPTION = "C library providing a GtkWidget to display maps. \
This package contains introspection file for libshumate."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.4"

RPM_NAME = "typelib-1_0-Shumate-1_0-1.0.4-1.1.aarch64.rpm"
RPM_HASH = "a18bb09f9cc0f0d9e879f481f571e4053c4491089ceacaa8b89d01c612cbbd88272684e49f61256b082908ef0d7ef5c2b165f4b7a9aed1c626acb13e61c716fb"

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
