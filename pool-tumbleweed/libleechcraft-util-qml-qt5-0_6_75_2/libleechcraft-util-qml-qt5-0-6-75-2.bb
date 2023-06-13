SUMMARY = "QML utility library for LeechCraft"
DESCRIPTION = "A library providing some commonly used QML items as well as \
QML-related classes and functions."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "libleechcraft-util-qml-qt5-0_6_75_2-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "2496bd8fd3a14cdf93928079ec820a66a58387cf47839b9ae4f6645d49855917be0821d20af7c030dd10296a2ebd0fe3f00e1ec9220ed074e58d013485ad6c75"

RPROVIDES:${PN} += "libleechcraft-util-qml-qt5-0_6_75_2 \
libleechcraft-util-qml-qt5-0_6_75_2(aarch-64) \
libleechcraft-util-qml-qt5.so.0.6.75.2()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickWidgets.so.5()(64bit) \
libQt5QuickWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQtQuick5 \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libleechcraft-util-gui-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-network-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-sys-qt5.so.0.6.75.1()(64bit) \
libqwt-qt5.so.6.2()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
