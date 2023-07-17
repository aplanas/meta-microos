SUMMARY = "KDE Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager. \
QML imports."
LICENSE = "GPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "kactivities5-imports-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "14bdf8a783338ff0f254e5db65c2690694a1dd8fcd9aef7219ff78859a3c8446d4c44691fe02f5a09d6c192b3dd87fdf9959ffb0b7bcd3d0a836f804c401c5ad"

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
