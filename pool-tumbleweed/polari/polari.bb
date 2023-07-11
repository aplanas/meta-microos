SUMMARY = "An IRC Client for GNOME"
DESCRIPTION = "Polari is an IRC client that is designed to integrate seamlessly \
with GNOME 3."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "43.0"

RPM_NAME = "polari-43.0-1.4.aarch64.rpm"
RPM_HASH = "3edace0bf9f86935a9fea6f13810e02e73ba394284bbb09944636276a914efd74580291f45f745ae0544aeceae1b534809e73861477c84d4b15a4a33b6280468"

RPROVIDES:${PN} += "libpolari-1.0.so \
polari \
typelib-Polari"

RDEPENDS:${PN} += "gjs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libgirepository-1.0.so.1 \
libgjs.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtelepathy-glib.so.0 \
telepathy-idle \
telepathy-logger \
telepathy-mission-control \
typelib-Adw \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gspell \
typelib-Gtk \
typelib-Pango \
typelib-PangoCairo \
typelib-Polari \
typelib-Secret \
typelib-TelepathyGLib \
typelib-TelepathyLogger"

inherit rpm
