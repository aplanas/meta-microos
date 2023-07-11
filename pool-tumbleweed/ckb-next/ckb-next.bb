SUMMARY = "RGB driver for Corsair keyboard and mice"
DESCRIPTION = "ckb is a driver for Corsair keyboards and mice. It brings the \
features of their proprietary CUE software to the Linux operating \
system. This project supports much of the same functionality, \
including full RGB animations."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "0.6.0"

RPM_NAME = "ckb-next-0.6.0-1.1.aarch64.rpm"
RPM_HASH = "8aa2a9e856c9c13e3b32b28c6cf842b78e74b93e0e9ed60b4320f44944f465d268a31d2c5e62ad4a98345cfa899e2675553c36508f0f80be2c7d585712a26b11"

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
libpulse.so.0 \
libquazip1-qt5.so.1.4.0 \
libstdc++.so.6 \
libudev.so.1 \
libxcb-ewmh.so.2 \
libxcb-screensaver.so.0 \
libxcb.so.1 \
systemd"

inherit rpm
