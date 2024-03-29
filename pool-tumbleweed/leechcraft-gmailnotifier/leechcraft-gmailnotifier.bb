SUMMARY = "LeechCraft GMail notifier Module"
DESCRIPTION = "This package provides a GMail notifications plugin for Leechcraft \
which allows to show notifications about new mail in your GMail account. \
 \
It has a configurable frequency for updates and the number of last unread \
messages shown."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-gmailnotifier-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "522cfe221478f6b4591382eb383d67c52ba457d1a77c791efdc4eb49add0404a2c198c6d19dbf996f1ea9bd45df3207b1f9100833ac9182bd567c25ff88070d1"

RPROVIDES:${PN} += "leechcraft-gmailnotifier \
libleechcraft-gmailnotifier.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-http \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt5.so.0.6.75.1 \
libleechcraft-util-qml-qt5.so.0.6.75.2 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-sys-qt5.so.0.6.75.1 \
libleechcraft-util-xpc-qt5.so.0.6.75.2 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2"

inherit rpm
