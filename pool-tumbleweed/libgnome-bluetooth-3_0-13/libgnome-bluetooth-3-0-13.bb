SUMMARY = "GNOME Bluetooth's Shared Libraries"
DESCRIPTION = "A set of graphical utilities to setup, monitor and use Bluetooth devices. \
 \
This package provides the GNOME Bluetooth's shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "42.6"

RPM_NAME = "libgnome-bluetooth-3_0-13-42.6-1.1.aarch64.rpm"
RPM_HASH = "c43f3fde7bdd611433215e4e6777e3886cc5c45f3e7d33ae1fe3c631d323038f3ec992a7ffca938ab1e814cc0aafeb82b0ab8febece3a96cb915c3e9a8834be9"

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
