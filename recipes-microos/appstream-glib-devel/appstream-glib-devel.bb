SUMMARY = "Development files for the AppStream abstraction library"
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

RPM_NAME = "appstream-glib-devel-0.8.2-1.3.aarch64.rpm"
RPM_HASH = "dc5b50f9c6e5e05a22a87a1b84baf03d277a13fe2726456d2c20d8ad9cff6ac57f24ac30b0937bc9a2418149b22f8d2025554f621f656c2a8b1726ed535b6c6c"

RPROVIDES:${PN} += "appdata-tools \
appstream-glib-devel \
appstream-glib-devel(aarch-64) \
pkgconfig(appstream-glib)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
appstream-glib \
libappstream-glib8 \
pkgconfig(gdk-pixbuf-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(libarchive) \
pkgconfig(uuid) \
typelib-1_0-AppStreamGlib-1_0"

inherit rpm
