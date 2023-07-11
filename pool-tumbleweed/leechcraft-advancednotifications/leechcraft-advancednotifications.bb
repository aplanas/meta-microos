SUMMARY = "LeechCraft Notifications framework Module"
DESCRIPTION = "This package provides an advanced notifications plugin for Leechcraft \
which allows to customize notifications better."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-advancednotifications-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "ba15a04ba12e397e29df3ec100bffdcea5ae24ebb6a5d6a989745ea56b85ba705eb45c1c94e1365adf1a0dedac4b4f09cbda3d13c838a1bbe917aa8fd7fa6365"

RPROVIDES:${PN} += "leechcraft-advancednotifications \
libleechcraft-advancednotifications.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-visualnotifications \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-qml-qt5.so.0.6.75.2 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sll-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1"

inherit rpm
