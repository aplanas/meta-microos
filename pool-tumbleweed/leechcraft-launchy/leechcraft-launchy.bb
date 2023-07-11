SUMMARY = "LeechCraft Launcher Module"
DESCRIPTION = "This package provides a third-party application launcher plugin for Leechcraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-launchy-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "f8a8a0578fa66207928f5fb4c46dbd4a40ff4910fcfd1fabb723f75af63f97ba32655e382f0d2d71dd4f75395b377726df028da133fce65cabacc1eedbc21965"

RPROVIDES:${PN} += "leechcraft-launchy \
libleechcraft-launchy.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-sb \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-qml-qt5.so.0.6.75.2 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-shortcuts-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-xdg-qt5.so.0.6.75 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2"

inherit rpm
