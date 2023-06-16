SUMMARY = "RGB driver for Corsair keyboard and mice"
DESCRIPTION = "ckb is a driver for Corsair keyboards and mice. It brings the \
features of their proprietary CUE software to the Linux operating \
system. This project supports much of the same functionality, \
including full RGB animations."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "0.5.0"

RPM_NAME = "ckb-next-0.5.0-2.1.aarch64.rpm"
RPM_HASH = "684f96a48b3a40eab876720079f8c4fcc9c379c58a0034457489837fa15b0cf4decc18af4bf298acc60cf22865037d8f33660535790c1126300d696e0b9ee0df"

RPROVIDES:${PN} += "ckb \
ckb-next"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
bash \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libdbusmenu-qt5.so.2 \
libgcc-s.so.1 \
libm.so.6 \
libpulse-simple.so.0 \
libpulse.so.0 \
libquazip1-qt5.so.1.4.0 \
libstdc++.so.6 \
libudev.so.1 \
libxcb-ewmh.so.2 \
libxcb-screensaver.so.0 \
libxcb.so.1 \
systemd"

inherit rpm
