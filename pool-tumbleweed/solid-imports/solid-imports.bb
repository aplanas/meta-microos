SUMMARY = "KDE Desktop hardware abstraction"
DESCRIPTION = "Solid is a device integration framework.  It provides a way of querying and \
interacting with hardware independently of the underlying operating system. \
QML imports."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "solid-imports-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "05dcce564debdd462e8b22f7551840af088bec5bd32025db50c0aea9d3ef99399205dd40e700e946f368821085c3663dce86ea5586f1bbf019187d852a9e70d3"

RPROVIDES:${PN} += "libsolidextensionplugin.so \
qt5qmlimport-org.kde.solid.1 \
solid-imports"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Solid.so.5 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
