SUMMARY = "Development files for the GNOME Bluetooth libraries"
DESCRIPTION = "A set of graphical utilities to setup, monitor and use Bluetooth devices. \
 \
This package provides the necessary files for development with GNOME Bluetooth."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.34.5"

RPM_NAME = "gnome-bluetooth-1-devel-3.34.5-2.8.aarch64.rpm"
RPM_HASH = "f832d9f36615be4a7d84ab4651a64095a954336372ab9fa46dd6dd1d86a04f499d90c44707d36e5d744044088a25fbb4cffdf622b80a3640f2ca5ca39c796f73"

RPROVIDES:${PN} += "gnome-bluetooth-1-devel \
pkgconfig-gnome-bluetooth-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnome-bluetooth-1 \
libgnome-bluetooth13 \
pkgconfig-gio-2.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-GnomeBluetooth-1-0"

inherit rpm
