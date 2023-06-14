SUMMARY = "Devel package for libgudev"
DESCRIPTION = "This is the devel package for the GObject library libgudev, which \
provides GObject access to udev device information."
LICENSE = "LGPL-2.1-or-later"

PV = "237"

RPM_NAME = "libgudev-1_0-devel-237-3.1.aarch64.rpm"
RPM_HASH = "5efdc96496675faea144ae73e39a21bbbd31cf70f0766ac12c64c1187e5f53661499e1979d61721063314e83a12583847a1157377479cdab211fab0af3eff696"

RPROVIDES:${PN} += "libgudev-1-0-devel \
pkgconfig-gudev-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgudev-1-0-0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libudev \
typelib-1-0-GUdev-1-0"

inherit rpm
