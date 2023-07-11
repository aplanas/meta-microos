SUMMARY = "LeechCraft Development Files"
DESCRIPTION = "This package provides files required for development of \
new LeechCraft modules."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-devel-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "65df87893921b4737ded2af91193255eafd5ea525aed47a1e5edf1f512fde122f99c2fe32ff7f91f240cdc634062d5502df24d90e21457cf3e0935df765cc16f"

RPROVIDES:${PN} += "leechcraft-devel"

RDEPENDS:${PN} += "cmake \
leechcraft \
libQt5Gui-private-headers-devel \
libleechcraft-util-db-qt5-0-6-75-1 \
libleechcraft-util-gui-qt5-0-6-75-1 \
libleechcraft-util-models-qt5-0-6-75-1 \
libleechcraft-util-network-qt5-0-6-75-1 \
libleechcraft-util-qml-qt5-0-6-75-2 \
libleechcraft-util-shortcuts-qt5-0-6-75 \
libleechcraft-util-sll-qt5-0-6-75-1 \
libleechcraft-util-svcauth-qt5-0-6-75 \
libleechcraft-util-sys-qt5-0-6-75-1 \
libleechcraft-util-tags-qt5-0-6-75-1 \
libleechcraft-util-x11-qt5-0-6-75 \
libleechcraft-util-xdg-qt5-0-6-75 \
libleechcraft-util-xpc-qt5-0-6-75-2 \
libleechcraft-util-xsd-qt5-0-6-75 \
libqt5-linguist-devel \
pkgconfig-Qt5Concurrent \
pkgconfig-Qt5DBus \
pkgconfig-Qt5OpenGL \
pkgconfig-Qt5PrintSupport \
pkgconfig-Qt5Script \
pkgconfig-Qt5Svg \
pkgconfig-Qt5X11Extras \
pkgconfig-Qt5XmlPatterns"

inherit rpm
