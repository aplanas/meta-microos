SUMMARY = "KDE Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager. \
QML imports."
LICENSE = "GPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "kactivities5-imports-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "9f810f8a28d0a516a34356b2fb6f2e44d6725ced933e459a1746159d5508cc480d5ae97096e26227a9f3a6ea10a77d13ce3c72e60ff26df3fe8e7a3e7920d389"

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
