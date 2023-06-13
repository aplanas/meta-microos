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
appstream-glib(aarch-64) \
libasb_plugin_appdata.so()(64bit) \
libasb_plugin_desktop.so()(64bit) \
libasb_plugin_gettext.so()(64bit) \
libasb_plugin_hardcoded.so()(64bit) \
libasb_plugin_icon.so()(64bit) \
libasb_plugin_shell_extension.so()(64bit)"

RDEPENDS:${PN} += "gcab \
gdk-pixbuf-loader-rsvg \
ld-linux-aarch64.so.1()(64bit) \
libappstream-glib.so.8()(64bit) \
libarchive.so.13()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
librpm.so.9()(64bit) \
librpmio.so.9()(64bit) \
pngquant"

inherit rpm
