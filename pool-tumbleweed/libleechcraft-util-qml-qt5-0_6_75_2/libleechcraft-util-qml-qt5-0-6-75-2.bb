SUMMARY = "QML utility library for LeechCraft"
DESCRIPTION = "A library providing some commonly used QML items as well as \
QML-related classes and functions."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-qml-qt5-0_6_75_2-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "b34539b850b500d2d646d1cd34376039a6b76dcb953f0c86e1b18cc8201dd21024a48571ff4b749a0ca96a27cb67e8f798c6e82bc14ed545a823afdc44cb955a"

RPROVIDES:${PN} += "libleechcraft-util-qml-qt5-0-6-75-2 \
libleechcraft-util-qml-qt5.so.0.6.75.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Widgets.so.5 \
libQtQuick5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-network-qt5.so.0.6.75.1 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libqwt-qt5.so.6.2 \
libstdc++.so.6"

inherit rpm
