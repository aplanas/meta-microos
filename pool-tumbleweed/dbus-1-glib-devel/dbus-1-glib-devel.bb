SUMMARY = "Developer package for D-Bus/GLib bindings"
DESCRIPTION = "D-Bus add-on library to integrate the standard D-Bus library with the \
GLib thread abstraction and main loop. \
 \
This package contains the devel and header files."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "0.112"

RPM_NAME = "dbus-1-glib-devel-0.112-3.3.aarch64.rpm"
RPM_HASH = "09f3ddc5629559e1318fc42ccdea8d955be882f57a7e92bcdf11ab12c421fda778301d23b1fbb158ecf74bfeb979402e6e394e5bb701e44af69b66f82f0ca9f6"

RPROVIDES:${PN} += "dbus-1-glib-devel \
pkgconfig-dbus-glib-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-1-glib-tool \
libdbus-glib-1-2 \
pkgconfig-dbus-1 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
