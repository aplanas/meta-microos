SUMMARY = "Wacom input driver for the Xorg X server"
DESCRIPTION = "wacom is an X input driver and utilities for Wacom devices."
LICENSE = "GPL-2.0-or-later"

PV = "0.40.0"

RPM_NAME = "xf86-input-wacom-0.40.0-2.7.aarch64.rpm"
RPM_HASH = "75c15dea3fcd2353eeab9b4d1e3461e2043ff7b8c47bbcd476249bd834608117b27c74538f9fa16136162c6330a4b870e328eebb45ef7dd44e2c202930173d61"

RPROVIDES:${PN} += "x11-input-wacom \
x11-input-wacom-tools \
xf86-input-wacom"

RDEPENDS:${PN} += "/usr/bin/sh \
X11-ABI-XINPUT \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libc.so.6 \
libm.so.6 \
libudev.so.1 \
pkgconfig-udev"

inherit rpm
