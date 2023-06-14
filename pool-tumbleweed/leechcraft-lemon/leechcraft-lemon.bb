SUMMARY = "LeechCraft Network Monitor Module"
DESCRIPTION = "This package provides another Network Monitor plugin for Leechcraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-lemon-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "d6ba0f44071cc03bbdc96fe0fc61bc3cfaa170b633ca3c2eff40ab8254fbc5ed60d2a1c081a2cc0b5ada086f14c0a965750aaeade7f656267b59649203f926f1"

RPROVIDES:${PN} += "leechcraft-lemon \
libleechcraft-lemon.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-sb \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libnl-3.so.200 \
libnl-route-3.so.200 \
libqwt-qt5.so.6.2 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
