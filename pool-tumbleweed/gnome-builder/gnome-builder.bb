SUMMARY = "A toolsmith for GNOME-based applications"
DESCRIPTION = "Builder is an IDE for GNOME and a tool to help writing GNOME-based \
applications."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later & GPL-3.0-or-later & LGPL-3.0-or-later & LGPL-2.1-or-later"

PV = "44.1"

RPM_NAME = "gnome-builder-44.1-1.5.aarch64.rpm"
RPM_HASH = "6ba3f1e987b8a3d71a1d7aa3ad97dc7eae42838019650066d31d833421c74575d6f7b428af13af900424d084b8a37f2f587646201d42832271a4bd1f224b15b7"

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
libgit2.so.1.7 \
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
