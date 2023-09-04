SUMMARY = "GNOME Bluetooth graphical utilities"
DESCRIPTION = "A set of graphical utilities to setup, monitor and use Bluetooth devices. \
 \
This package provides the utilities, data files and manuals for GNOME Bluetooth."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "42.6"

RPM_NAME = "gnome-bluetooth-42.6-1.1.aarch64.rpm"
RPM_HASH = "0f1d92fae4d3ecd16de2385d42106ea1c6653dc4606b9c1bd628d2579b1baa37f37032abd253933f1c73cacc4865298b3f0c5d69996bba98ebe8bfeddb5df078"

RPROVIDES:${PN} += "gnome-bluetooth"

RDEPENDS:${PN} += "bluez \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-bluetooth-3.0.so.13 \
libgobject-2.0.so.0 \
libgtk-4.so.1"

inherit rpm
