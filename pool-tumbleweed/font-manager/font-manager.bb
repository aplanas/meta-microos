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

RPM_NAME = "font-manager-0.8.8-2.4.aarch64.rpm"
RPM_HASH = "25aed85c358ca34b71f683a85791a6b5a0d350ee03bc7a1e63508ae0a5ac2700014618385be8bb4d4958a2fc8da4c400f8887944e725c4c429f6abf277ade941"

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
