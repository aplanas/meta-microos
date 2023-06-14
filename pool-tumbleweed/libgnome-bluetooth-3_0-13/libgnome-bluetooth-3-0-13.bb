SUMMARY = "GNOME Bluetooth's Shared Libraries"
DESCRIPTION = "A set of graphical utilities to setup, monitor and use Bluetooth devices. \
 \
This package provides the GNOME Bluetooth's shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "42.5"

RPM_NAME = "libgnome-bluetooth-3_0-13-42.5-1.3.aarch64.rpm"
RPM_HASH = "8c4ccadf69d083134bab340edc43dc6b64bbf2f7dbbb07e6c67681c5938db20672d1215b00e1c3f32599730d5e405eea5ccb50b7c2bd406f7b3ce5d0534dcae4"

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
