SUMMARY = "LeechCraft SideBar2 Module"
DESCRIPTION = "This package provides another side bar plugin for Leechcraft. \
 \
It is a sidebar with quick launch, tabs and tray areas."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-sb2-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "84b5440e09d558fc2d0fc264a497a0c64e8936224df0b2f920701eb711ee21644861de37b9b647d98be2697005d205f5bc023a5f946a93bca2f4c37ae2a03ad3"

RPROVIDES:${PN} += "leechcraft-sb \
leechcraft-sb2 \
libleechcraft-sb2.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
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
libleechcraft-util-x11-qt5.so.0.6.75 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libqt5-qtquickcontrols \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Layouts.1"

inherit rpm
