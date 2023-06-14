SUMMARY = "Character Map"
DESCRIPTION = "A simple utility application to find and insert unusual characters."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-characters-44.0-2.1.aarch64.rpm"
RPM_HASH = "488481738273cb66a2a02f9580c0e3e46e1f4c7b478f652d193b6b2cf29e4173df4bb07e9d99a81bbf6defe97fe82ff9f889a4680767f599c0ffaaef01a13fb4"

RPROVIDES:${PN} += "gnome-characters \
libgc.so \
typelib-Gc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
typelib-Adw \
typelib-GLib \
typelib-GObject \
typelib-Gc \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-GnomeDesktop \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk \
typelib-HarfBuzz \
typelib-IBus \
typelib-Pango \
typelib-PangoCairo \
typelib-cairo \
typelib-freetype2"

inherit rpm
