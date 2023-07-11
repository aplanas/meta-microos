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

RPM_NAME = "appstream-glib-devel-0.8.2-1.4.aarch64.rpm"
RPM_HASH = "0b9e6b69cd75209bc238fa63fa22314b218d6606b1c9eef741affb8e8bf925feb20c89a0d89b06b49e288e0d91e56518587c91be51a0f62374c2e606c9dcc5c4"

RPROVIDES:${PN} += "appdata-tools \
appstream-glib-devel \
pkgconfig-appstream-glib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
appstream-glib \
libappstream-glib8 \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libarchive \
pkgconfig-uuid \
typelib-1-0-AppStreamGlib-1-0"

inherit rpm
