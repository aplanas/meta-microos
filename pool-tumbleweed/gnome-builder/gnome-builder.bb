SUMMARY = "A toolsmith for GNOME-based applications"
DESCRIPTION = "Builder is an IDE for GNOME and a tool to help writing GNOME-based \
applications."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later & GPL-3.0-or-later & LGPL-3.0-or-later & LGPL-2.1-or-later"

PV = "44.1"

RPM_NAME = "gnome-builder-44.1-1.3.aarch64.rpm"
RPM_HASH = "471ee3a50e62a263ee6f0cc07120dbbf6c0c3fa3d8b0a242fe4c3cd7d0e83e75e9cc1b789ff53e8271e26dac2ce5c12f1a3807df5772badad682e25e59fb87da"

RPROVIDES:${PN} += "gnome-builder \
pkgconfig-gnome-builder-44.1 \
typelib-Ide"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
autoconf \
automake \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libclang.so.13 \
libcmark.so.0.30.3 \
libdex-1.so.1 \
libdspy-1.so.1 \
libeditorconfig.so.0 \
libenchant-2.so.2 \
libflatpak.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgirepository-1.0.so.1 \
libgit2-glib-1.0.so.0 \
libgit2.so.1.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libgtksourceview-5.so.0 \
libicuuc.so.73 \
libjson-glib-1.0.so.0 \
libjsonrpc-glib-1.0.so.1 \
libpanel-1.so.1 \
libpango-1.0.so.0 \
libpeas-1.0.so.0 \
libportal-gtk4.so.1 \
libportal.so.1 \
libsoup-3.0.so.0 \
libsysprof-4.so \
libsysprof-ui-5.so \
libtemplate-glib-1.0.so.0 \
libtool \
libvte-2.91-gtk4.so.0 \
libwebkitgtk-6.0.so.4 \
libxml2.so.2 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-gtk4 \
pkgconfig-gtksourceview-5 \
pkgconfig-libpeas-1.0 \
pkgconfig-template-glib-1.0 \
pkgconfig-vte-2.91-gtk4 \
pkgconfig-webkitgtk-6.0 \
python-abi \
python3-gobject-Gdk \
typelib-Adw \
typelib-Dex \
typelib-GIRepository \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk \
typelib-GtkSource \
typelib-HarfBuzz \
typelib-JavaScriptCore \
typelib-Jsonrpc \
typelib-Panel \
typelib-Pango \
typelib-PangoCairo \
typelib-Peas \
typelib-Soup \
typelib-Template \
typelib-Vte \
typelib-WebKit \
typelib-cairo \
typelib-freetype2"

inherit rpm
