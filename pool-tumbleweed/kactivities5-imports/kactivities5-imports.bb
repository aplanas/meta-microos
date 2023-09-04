SUMMARY = "KDE Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager. \
QML imports."
LICENSE = "GPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "kactivities5-imports-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "7e22fb30d8f100d669809f7ce68dc6997515c71f915790484c9a00d210d5410646e67f424f9d25a63ba5a97674b7172b7f02eb04bbd318ac974b175c828ed1bd"

RPROVIDES:${PN} += "kactivities5-imports \
libkactivitiesextensionplugin.so \
qt5qmlimport-org.kde.activities.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Activities.so.5 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
