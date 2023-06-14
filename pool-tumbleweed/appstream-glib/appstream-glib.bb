SUMMARY = "AppStream Abstraction Library"
DESCRIPTION = "This library provides GObjects and helper methods to read and write \
AppStream metadata. It also provides a DOM implementation to edit \
nodes and convert to and from the standardized XML representation. \
 \
This library allows to: \
 \
* Read and write compressed AppStream XML files \
* Add and search for applications in an application store \
* Get screenshot image data and release announcements \
* Easily retrieve the best application data for the current locale \
* Efficiently interface with more heavy-weight parsers like expat"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "appstream-glib-0.8.2-1.3.aarch64.rpm"
RPM_HASH = "72346c11f9031bb27fbd8de1dcc214a82227aec750afc012082d628469098e0e8c12683f750497b6b72becd9fecfb4911a76ea148bf96faadc459011174d19f6"

RPROVIDES:${PN} += "appstream-glib \
libasb-plugin-appdata.so \
libasb-plugin-desktop.so \
libasb-plugin-gettext.so \
libasb-plugin-hardcoded.so \
libasb-plugin-icon.so \
libasb-plugin-shell-extension.so"

RDEPENDS:${PN} += "gcab \
gdk-pixbuf-loader-rsvg \
ld-linux-aarch64.so.1 \
libappstream-glib.so.8 \
libarchive.so.13 \
libc.so.6 \
libcurl.so.4 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
librpm.so.9 \
librpmio.so.9 \
pngquant"

inherit rpm
