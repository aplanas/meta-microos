SUMMARY = "GLib integration of PackageKit"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.5"

RPM_NAME = "libpackagekit-glib2-devel-1.2.5-9.3.aarch64.rpm"
RPM_HASH = "705d73ecc23f8c53c2386a23cd16cfe1349eefc5409d124a2435af040ad8e7ba417885c52abcd4291f9742a784579e8d1b59d15fb8719985c46e89a80abc6a22"

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
