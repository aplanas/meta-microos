SUMMARY = "LeechCraft Tray Area Module"
DESCRIPTION = "This package provides a tray area quark for third-party apps \
for LeechCraft SB2."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-mellonetray-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "c7d3b0064a2f5fd9f8b8ddcb73a01e8fd68273e50745f1ba8222e2c336acdb72b586653d15b9e8e0604d8b20208e39644ac5a6ff43b8ddf45ef1b6b8d5c323d7"

RPROVIDES:${PN} += "leechcraft-mellonetray \
libleechcraft-mellonetray.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-sb2 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libXdamage.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-x11-qt5.so.0.6.75 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2"

inherit rpm
