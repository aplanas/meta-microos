SUMMARY = "A Qt Quick Controls 2 Style for Desktop UIs"
DESCRIPTION = "A Qt Quick Controls 2 style engine that uses the desktop style \
to draw controls with QStyle."
LICENSE = "GPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "qqc2-desktop-style-5.107.0-1.2.aarch64.rpm"
RPM_HASH = "385da4eb614bb845914bce1f38a4d3d7204ac54b7855f647ba24c3814303295a1c77ab0fd5a3e8741253fc2c2da1ad2f7f07fab77418a12f09335048dfa523e7"

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
