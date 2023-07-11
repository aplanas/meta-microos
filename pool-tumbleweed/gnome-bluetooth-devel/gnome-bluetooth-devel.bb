SUMMARY = "Development files for the GNOME Bluetooth libraries"
DESCRIPTION = "A set of graphical utilities to setup, monitor and use Bluetooth devices. \
 \
This package provides the necessary files for development with GNOME Bluetooth."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "42.5"

RPM_NAME = "gnome-bluetooth-devel-42.5-1.4.aarch64.rpm"
RPM_HASH = "5347b6ac41ddb917763583b30363ba887ee2e1740a253aed25d1b8f48c22ef6a50500714eca395409d6f11566579123922f05053432e23e7153a8486b88f2eb9"

RPROVIDES:${PN} += "gnome-bluetooth-devel \
pkgconfig-gnome-bluetooth-3.0 \
pkgconfig-gnome-bluetooth-ui-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnome-bluetooth \
libgnome-bluetooth-3-0-13 \
libgnome-bluetooth-ui-3-0-13 \
pkgconfig-gio-2.0 \
pkgconfig-gtk4 \
pkgconfig-libadwaita-1 \
typelib-1-0-GnomeBluetooth-3-0"

inherit rpm
