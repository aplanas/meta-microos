SUMMARY = "Developer package for D-Bus/GLib bindings"
DESCRIPTION = "D-Bus add-on library to integrate the standard D-Bus library with the \
GLib thread abstraction and main loop. \
 \
This package contains the devel and header files."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "0.112"

RPM_NAME = "dbus-1-glib-devel-0.112-3.4.aarch64.rpm"
RPM_HASH = "308355a126172bac9686b3dfb5a3a827db7d7b42975ca8ecd57bf27e09314b467df9d34a430a2e173bc2e86d4b5a81ae66a4d11a6ef07b54b7de33b171e3221e"

RPROVIDES:${PN} += "dbus-1-glib-devel \
pkgconfig-dbus-glib-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-1-glib-tool \
libdbus-glib-1-2 \
pkgconfig-dbus-1 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
