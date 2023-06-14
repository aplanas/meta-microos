SUMMARY = "An IRC Client for GNOME"
DESCRIPTION = "Polari is an IRC client that is designed to integrate seamlessly \
with GNOME 3."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "43.0"

RPM_NAME = "polari-43.0-1.3.aarch64.rpm"
RPM_HASH = "de9ae98a4412ce2f69f13943618d44ec22231ec3c8973b1ff3cfada0487ce264659f885b082398f206baf70a06d7c530d7a05398e2a22d429d5dfc29aa294c30"

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
