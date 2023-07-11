SUMMARY = "Media Player Classic Qute Theater"
DESCRIPTION = "A clone of Media Player Classic reimplemented in Qt."
LICENSE = "GPL-2.0-only"

PV = "23.02"

RPM_NAME = "mpc-qt-23.02-1.4.aarch64.rpm"
RPM_HASH = "4de14b358382d501ac314bd9be7679b887d670cd705a4707fe6bd30e2bdac38ef0771f0d935c50fd800af88c4490ce30ea0f76fd3067481f7a29910012bec5d2"

RPROVIDES:${PN} += "Classic \
Player \
Qute \
Theater.desktop) \
mpc-qt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmpv.so.2 \
libstdc++.so.6"

inherit rpm
