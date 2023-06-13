SUMMARY = "Xbox/Xbox360 USB Gamepad Driver for Userspace"
DESCRIPTION = "Xboxdrv is a Xbox/Xbox360 gamepad driver for Linux that works in \
userspace. It is an alternative to the xpad kernel driver and has \
support for Xbox1 gamepads, Xbox360 USB gamepads and Xbox360 \
wireless gamepads. The Xbox360 guitar and some Xbox1 dancemats \
might work too. The Xbox 360 racing wheel is not supported, but \
shouldn't be to hard to add if somebody is interested."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.8"

RPM_NAME = "xboxdrv-0.8.8-11.3.aarch64.rpm"
RPM_HASH = "5e19a4ad9980f280e4cc4c4afde2558a8ee57397659f5f0bdf040d862b5522c8117ba626e8b1017cb48d506b47843b99e7bb68785d2e685aaa890cb4719a8500"

RPROVIDES:${PN} += "config(xboxdrv) \
xboxdrv \
xboxdrv(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libdbus-glib-1.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libusb-1.0.so.0()(64bit)"

inherit rpm
