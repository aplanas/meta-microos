SUMMARY = "GLib integration of PackageKit"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.5"

RPM_NAME = "libpackagekit-glib2-devel-1.2.5-9.4.aarch64.rpm"
RPM_HASH = "926bad23e5bab49e990e09b86041aeab2b7a0ccc47140b4484975d29f0ed9874d9e6f8624d89fb019863be6ea89df523e68397487de43fe5be793c8bc971da24"

RPROVIDES:${PN} += "libpackagekit-glib12-devel \
libpackagekit-glib2-devel \
pkgconfig-packagekit-glib2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpackagekit-glib2-18 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
typelib-1-0-PackageKitGlib-1-0"

inherit rpm
