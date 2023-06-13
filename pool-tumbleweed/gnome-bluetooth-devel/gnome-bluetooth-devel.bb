SUMMARY = "Development files for the GNOME Bluetooth libraries"
DESCRIPTION = "A set of graphical utilities to setup, monitor and use Bluetooth devices. \
 \
This package provides the necessary files for development with GNOME Bluetooth."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "42.5"

RPM_NAME = "gnome-bluetooth-devel-42.5-1.3.aarch64.rpm"
RPM_HASH = "3284c1e309c2c3089ad863deefbfd4ee4be922c781bfe2fb36d48c4127bc3b0cc839b0040544d95df570f8ff9a7bfd72e1d95e668429e741e49f0465f5f393c0"

RPROVIDES:${PN} += "gnome-bluetooth-devel \
gnome-bluetooth-devel(aarch-64) \
pkgconfig(gnome-bluetooth-3.0) \
pkgconfig(gnome-bluetooth-ui-3.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnome-bluetooth \
libgnome-bluetooth-3_0-13 \
libgnome-bluetooth-ui-3_0-13 \
pkgconfig(gio-2.0) \
pkgconfig(gtk4) \
pkgconfig(libadwaita-1) \
typelib-1_0-GnomeBluetooth-3_0"

inherit rpm
