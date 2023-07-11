SUMMARY = "KDE Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager. \
QML imports."
LICENSE = "GPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "kactivities5-imports-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "50d3fad307f12cbe8d5cd0b4632f2bc5a0c1097fb44684cc3c43d2d3160cb9341bd3b8d54a52a71adacc14d2143aecc180fc16d8d84b12a6e7dddf9a12887cb3"

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
