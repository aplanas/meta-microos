SUMMARY = "LeechCraft GMail notifier Module"
DESCRIPTION = "This package provides a GMail notifications plugin for Leechcraft \
which allows to show notifications about new mail in your GMail account. \
 \
It has a configurable frequency for updates and the number of last unread \
messages shown."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-gmailnotifier-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "0c60110f4560e3e633e513b4da5dbc17409a9a77913d24e0836959674d2387b8ff5204ba35fb7df01e6ed6e990cec700ebb4d676dbe046fd5c437c52d6e5be3c"

RPROVIDES:${PN} += "leechcraft-gmailnotifier \
leechcraft-gmailnotifier(aarch-64) \
libleechcraft_gmailnotifier.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
leechcraft \
leechcraft-http \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5QuickWidgets.so.5()(64bit) \
libQt5QuickWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libleechcraft-util-gui-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-qml-qt5.so.0.6.75.2()(64bit) \
libleechcraft-util-qt5.so.0.6.75()(64bit) \
libleechcraft-util-sys-qt5.so.0.6.75.1()(64bit) \
libleechcraft-util-xpc-qt5.so.0.6.75.2()(64bit) \
libleechcraft-xsd-qt5.so.0.6.75.2()(64bit) \
libstdc++.so.6()(64bit) \
qt5qmlimport(QtQuick.2)"

inherit rpm
