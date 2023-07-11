SUMMARY = "Character Map"
DESCRIPTION = "A simple utility application to find and insert unusual characters."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-characters-44.0-2.2.aarch64.rpm"
RPM_HASH = "693faf315bef613dc3c516674bedc950a3968ccb080f3dd31554225b353f9ccb2397c6249e46ef72a1ecf941e34cde2f0972224c4364b077ddc4a796d06cc19c"

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
