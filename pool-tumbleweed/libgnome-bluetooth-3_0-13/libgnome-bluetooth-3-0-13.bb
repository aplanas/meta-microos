SUMMARY = "GNOME Bluetooth's Shared Libraries"
DESCRIPTION = "A set of graphical utilities to setup, monitor and use Bluetooth devices. \
 \
This package provides the GNOME Bluetooth's shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "42.5"

RPM_NAME = "libgnome-bluetooth-3_0-13-42.5-1.4.aarch64.rpm"
RPM_HASH = "670d728236c57540a5a03e47dbdab90c32ab8d7465e2fdb5c2dcb405b87a26b218037c911a414f197eab312193f2c5f341cf3a93cec6191d9e87a7aee84a247f"

RPROVIDES:${PN} += "libgnome-bluetooth-3-0-13 \
libgnome-bluetooth-3.0.so.13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libudev.so.1 \
libupower-glib.so.3"

inherit rpm
