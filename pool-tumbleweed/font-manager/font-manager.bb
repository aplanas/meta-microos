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

RPROVIDES:${PN} += "font-manager"

RDEPENDS:${PN} += "/usr/bin/sh \
font-manager-common \
font-viewer \
fontconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontmanager.so.0 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libpango-1.0.so.0 \
libsoup-2.4.so.1 \
libsqlite3.so.0 \
libwebkit2gtk-4.0.so.37 \
webkit2gtk-4-0-injected-bundles"

inherit rpm
