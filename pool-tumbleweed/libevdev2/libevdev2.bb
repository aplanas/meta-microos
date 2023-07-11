SUMMARY = "Library for handling evdev kernel devices"
DESCRIPTION = "Library for handling evdev kernel devices. It abstracts the ioctls \
through type-safe interfaces and provides functions to change \
the appearance of the device."
LICENSE = "MIT"

PV = "1.13.1"

RPM_NAME = "libevdev2-1.13.1-1.1.aarch64.rpm"
RPM_HASH = "fa3edf1a5067d96d3c4159228f5d71b28c486d8426a983d468eec0a0e6e03ee62cd8a49aa68e1239355e39c2a2f843b4bda6a417ad8a995169a33ca397e1d4c1"

RPROVIDES:${PN} += "libevdev.so.2 \
libevdev2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
