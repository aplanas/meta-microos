SUMMARY = "A toolsmith for GNOME-based applications"
DESCRIPTION = "Builder is an IDE for GNOME and a tool to help writing GNOME-based \
applications."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later & GPL-3.0-or-later & LGPL-3.0-or-later & LGPL-2.1-or-later"

PV = "44.1"

RPM_NAME = "gnome-builder-44.1-1.3.aarch64.rpm"
RPM_HASH = "471ee3a50e62a263ee6f0cc07120dbbf6c0c3fa3d8b0a242fe4c3cd7d0e83e75e9cc1b789ff53e8271e26dac2ce5c12f1a3807df5772badad682e25e59fb87da"

RPROVIDES:${PN} += "application() \
application(org.gnome.Builder.desktop) \
gnome-builder \
gnome-builder(aarch-64) \
metainfo() \
metainfo(org.gnome.Builder.appdata.xml) \
mimehandler(application/javascript) \
mimehandler(application/json) \
mimehandler(application/x-desktop) \
mimehandler(application/x-gnome-app-info) \
mimehandler(application/x-javascript) \
mimehandler(application/x-m4) \
mimehandler(application/x-perl) \
mimehandler(application/x-php) \
mimehandler(application/x-php-source) \
mimehandler(application/x-python) \
mimehandler(application/x-ruby) \
mimehandler(application/x-shellscript) \
mimehandler(application/x-yaml) \
mimehandler(application/xml) \
mimehandler(text/css) \
mimehandler(text/html) \
mimehandler(text/javascript) \
mimehandler(text/x-c) \
mimehandler(text/x-c++) \
mimehandler(text/x-c++hdr) \
mimehandler(text/x-c++src) \
mimehandler(text/x-changelog) \
mimehandler(text/x-chdr) \
mimehandler(text/x-cpp) \
mimehandler(text/x-csrc) \
mimehandler(text/x-go) \
mimehandler(text/x-javascript) \
mimehandler(text/x-js) \
mimehandler(text/x-lua) \
mimehandler(text/x-makefile) \
mimehandler(text/x-markdown) \
mimehandler(text/x-perl) \
mimehandler(text/x-php) \
mimehandler(text/x-php-source) \
mimehandler(text/x-pkg-config) \
mimehandler(text/x-python) \
mimehandler(text/x-ruby) \
mimehandler(text/x-sh) \
mimehandler(text/x-shellscript) \
mimehandler(text/x-sql) \
mimehandler(text/x-vala) \
mimehandler(text/xml) \
pkgconfig(gnome-builder-44.1) \
typelib(Ide)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
autoconf \
automake \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libadwaita-1.so.0()(64bit) \
libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libclang.so.13()(64bit) \
libclang.so.13(LLVM_13)(64bit) \
libcmark.so.0.30.3()(64bit) \
libdex-1.so.1()(64bit) \
libdspy-1.so.1()(64bit) \
libeditorconfig.so.0()(64bit) \
libenchant-2.so.2()(64bit) \
libflatpak.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libgirepository-1.0.so.1()(64bit) \
libgit2-glib-1.0.so.0()(64bit) \
libgit2.so.1.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libgtksourceview-5.so.0()(64bit) \
libicuuc.so.73()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libjsonrpc-glib-1.0.so.1()(64bit) \
libpanel-1.so.1()(64bit) \
libpango-1.0.so.0()(64bit) \
libpeas-1.0.so.0()(64bit) \
libportal-gtk4.so.1()(64bit) \
libportal.so.1()(64bit) \
libsoup-3.0.so.0()(64bit) \
libsysprof-4.so()(64bit) \
libsysprof-ui-5.so()(64bit) \
libtemplate_glib-1.0.so.0()(64bit) \
libtool \
libvte-2.91-gtk4.so.0()(64bit) \
libwebkitgtk-6.0.so.4()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.0)(64bit) \
libxml2.so.2(LIBXML2_2.5.2)(64bit) \
libxml2.so.2(LIBXML2_2.5.7)(64bit) \
libxml2.so.2(LIBXML2_2.5.8)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
pkgconfig(gio-2.0) \
pkgconfig(gio-unix-2.0) \
pkgconfig(gtk4) \
pkgconfig(gtksourceview-5) \
pkgconfig(libpeas-1.0) \
pkgconfig(template-glib-1.0) \
pkgconfig(vte-2.91-gtk4) \
pkgconfig(webkitgtk-6.0) \
python(abi) \
python3-gobject-Gdk \
typelib(Adw) \
typelib(Dex) \
typelib(GIRepository) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Graphene) \
typelib(Gsk) \
typelib(Gtk) \
typelib(GtkSource) \
typelib(HarfBuzz) \
typelib(JavaScriptCore) \
typelib(Jsonrpc) \
typelib(Panel) \
typelib(Pango) \
typelib(PangoCairo) \
typelib(Peas) \
typelib(Soup) \
typelib(Template) \
typelib(Vte) \
typelib(WebKit) \
typelib(cairo) \
typelib(freetype2)"

inherit rpm
