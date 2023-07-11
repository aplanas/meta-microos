SUMMARY = "GNOME Bluetooth's Shared Libraries"
DESCRIPTION = "A set of graphical utilities to setup, monitor and use Bluetooth devices. \
 \
This package provides the GNOME Bluetooth's shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.34.5"

RPM_NAME = "libgnome-bluetooth13-3.34.5-2.8.aarch64.rpm"
RPM_HASH = "a6ce5f94e8ba7b4f99951b2f4ab2ebdc40a3bf695d6712c48c7802b1dab3ab1c0a4cfce074296e6c08f1d87053e4fa242f212ee7eb764e91603e418b94cb75c3"

RPROVIDES:${PN} += "libgnome-bluetooth.so.13 \
libgnome-bluetooth13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libnotify.so.4 \
libudev.so.1"

inherit rpm
