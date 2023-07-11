SUMMARY = "Breeze Style for Qt Quick Controls 2"
DESCRIPTION = "A Qt Quick Controls 2 style engine that uses the desktop style \
to draw controls with QStyle."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "5.27.6"

RPM_NAME = "qqc2-breeze-style-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "bac917d22609c6d6caa74f0e2359ed293ba7eec621d2761d8bdd38242719686857acc50d05a2d52dba398f0dfac5b457711a29a9335f82fa4cb390c92178783d"

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
