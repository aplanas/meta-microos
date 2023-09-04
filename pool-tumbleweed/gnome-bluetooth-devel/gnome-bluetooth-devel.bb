SUMMARY = "Development files for the GNOME Bluetooth libraries"
DESCRIPTION = "A set of graphical utilities to setup, monitor and use Bluetooth devices. \
 \
This package provides the necessary files for development with GNOME Bluetooth."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "42.6"

RPM_NAME = "gnome-bluetooth-devel-42.6-1.1.aarch64.rpm"
RPM_HASH = "9d6602ea557acb2777c3ea291dbfb9ee63e57cc2ad2d393dacfd4ea556db0f35b0a760e445910f1aeb49f79e615911c75893af9c18924d39930078d744796b33"

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
