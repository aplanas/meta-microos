SUMMARY = "Breeze Style for Qt Quick Controls 2"
DESCRIPTION = "A Qt Quick Controls 2 style engine that uses the desktop style \
to draw controls with QStyle."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "5.27.7"

RPM_NAME = "qqc2-breeze-style-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "8654a2062d468600db4fed124c93f81a7655a940063ba924ab96d78484a454a24896dbd95fb33a7616e301a78a6f806ee8aea6d1cf158b4becb9d2ed10324719"

RPROVIDES:${PN} += "libqqc2breezestyleplugin.so \
qqc2-breeze-style \
qt5qmlimport-org.kde.breeze.1 \
qt5qmlimport-org.kde.breeze.2 \
qt5qmlimport-org.kde.breeze.impl.1"

RDEPENDS:${PN} += "kirigami2 \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5GuiAddons.so.5 \
libKF5IconThemes.so.5 \
libKF5Kirigami2.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libm.so.6 \
libqt5-qtquickcontrols2 \
libstdc++.so.6 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Templates.2 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-org.kde.breeze.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.quickcharts.1"

inherit rpm
