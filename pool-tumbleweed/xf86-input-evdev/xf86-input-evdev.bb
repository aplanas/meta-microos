SUMMARY = "Generic Linux input driver for the Xorg X server"
DESCRIPTION = "evdev is an Xorg input driver for Linux's generic event devices. It \
therefore supports all input devices that the kernel knows about, \
including most mice, keyboards, tablets and touchscreens."
LICENSE = "MIT"

PV = "2.10.6"

RPM_NAME = "xf86-input-evdev-2.10.6-3.10.aarch64.rpm"
RPM_HASH = "737e57830c831ec47ab3f30110fc720ab2aa18755b0578bd9c8df90c0059753dd047c66c99d861622c5168d70a750b690517a3911fe4c95823af10fd633b7998"

RPROVIDES:${PN} += "x11-input-mtrack \
xf86-input-evdev \
xf86-input-evdev(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
X11_ABI_XINPUT \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libevdev.so.2()(64bit) \
libevdev.so.2(LIBEVDEV_1)(64bit) \
libmtdev.so.1()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
udev"

inherit rpm
