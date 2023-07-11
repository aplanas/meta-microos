SUMMARY = "Wacom input driver for the Xorg X server"
DESCRIPTION = "wacom is an X input driver and utilities for Wacom devices."
LICENSE = "GPL-2.0-or-later"

PV = "0.40.0"

RPM_NAME = "xf86-input-wacom-0.40.0-2.8.aarch64.rpm"
RPM_HASH = "66ac2f1f7db434951a455bb1edaf1155e16077cfecdb9eea8e42d81aec7a166fd4dd8078b711eb74b932143fac077a94a45aa264070c74ce9b53e021f3ea1082"

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
