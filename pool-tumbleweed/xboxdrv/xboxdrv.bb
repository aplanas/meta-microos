SUMMARY = "Xbox/Xbox360 USB Gamepad Driver for Userspace"
DESCRIPTION = "Xboxdrv is a Xbox/Xbox360 gamepad driver for Linux that works in \
userspace. It is an alternative to the xpad kernel driver and has \
support for Xbox1 gamepads, Xbox360 USB gamepads and Xbox360 \
wireless gamepads. The Xbox360 guitar and some Xbox1 dancemats \
might work too. The Xbox 360 racing wheel is not supported, but \
shouldn't be to hard to add if somebody is interested."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.8"

RPM_NAME = "xboxdrv-0.8.8-11.4.aarch64.rpm"
RPM_HASH = "8ebed550e92e922def42c402e756fc6d16fd9dc7c752b1852706b584ecfd714e2ae1ecf8505d264d962e1b97fab3fd648b6901e3a92e3a745da27fc5fbe276a6"

RPROVIDES:${PN} += "config-xboxdrv \
xboxdrv"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libstdc++.so.6 \
libudev.so.1 \
libusb-1.0.so.0"

inherit rpm
