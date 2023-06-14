SUMMARY = "A Qt Quick Controls 2 Style for Desktop UIs"
DESCRIPTION = "A Qt Quick Controls 2 style engine that uses the desktop style \
to draw controls with QStyle."
LICENSE = "GPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "qqc2-desktop-style-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "f2c65a5932f1496b29762607a7122f572c196a81cc78034fc90305556d3ea6dd4451b5a67a674fa51091ed0d69a676c4b009f0dbec2d3fd1eb0c3248f4a1076d"

RPROVIDES:${PN} += "libqqc2desktopstyleplugin.so \
plasma5-qqc2-style \
qqc2-desktop-style \
qt5qmlimport-org.kde.qqc2desktopstyle.private.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5IconThemes.so.5 \
libKF5Kirigami2.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libqt5-qtquickcontrols2 \
libstdc++.so.6 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQml.Models.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Templates.2 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.qqc2desktopstyle.private.1 \
qt5qmlimport-org.kde.sonnet.1"

inherit rpm
