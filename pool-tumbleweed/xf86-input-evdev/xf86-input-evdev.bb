SUMMARY = "Generic Linux input driver for the Xorg X server"
DESCRIPTION = "evdev is an Xorg input driver for Linux's generic event devices. It \
therefore supports all input devices that the kernel knows about, \
including most mice, keyboards, tablets and touchscreens."
LICENSE = "MIT"

PV = "2.10.6"

RPM_NAME = "xf86-input-evdev-2.10.6-3.11.aarch64.rpm"
RPM_HASH = "0a374a7fad7fa14a086c2e4ae9987aacf401ab70aee4d243f2871fc49477210641e93f9e6dd749908d49d9208029b4fe55e274262c7e65bf49959795d6e592b1"

RPROVIDES:${PN} += "x11-input-mtrack \
xf86-input-evdev"

RDEPENDS:${PN} += "/usr/bin/sh \
X11-ABI-XINPUT \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2 \
libmtdev.so.1 \
libudev.so.1 \
udev"

inherit rpm
