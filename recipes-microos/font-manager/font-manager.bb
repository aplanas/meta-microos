SUMMARY = "A simple font management application for Gtk+ Desktop Environments"
DESCRIPTION = "Font Manager is intended to provide a way for average users to easily \
 manage desktop fonts, without having to resort to command line tools \
 or editing configuration files by hand. While designed primarily with \
 the Gnome Desktop Environment in mind, it should work well with other \
 Gtk+ desktop environments. \
 \
Font Manager is NOT a professional-grade font management solution."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.8"

RPM_NAME = "font-manager-0.8.8-2.3.aarch64.rpm"
RPM_HASH = "805f45efccdd0a5da92321c4a2f5a9dc98ae20ac2f39e8ddc0c4a4fa092f0d273a60bf78c6aca170079d57cda617bde23876ef5a4fee6b59621caadf6fb1424d"

RPROVIDES:${PN} += "application() application(org.gnome.FontManager.desktop) font-manager font-manager(aarch-64) metainfo() metainfo(org.gnome.FontManager.appdata.xml) mimehandler(application/x-font-otf) mimehandler(application/x-font-ttf) mimehandler(font/otf) mimehandler(font/ttc) mimehandler(font/ttf)"
RDEPENDS:${PN} += "/bin/sh font-manager-common font-viewer fontconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfontmanager.so.0()(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) libpango-1.0.so.0()(64bit) libsoup-2.4.so.1()(64bit) libsqlite3.so.0()(64bit) libwebkit2gtk-4.0.so.37()(64bit) webkit2gtk-4_0-injected-bundles"

inherit rpm
