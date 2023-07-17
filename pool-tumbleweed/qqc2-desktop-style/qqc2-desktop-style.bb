SUMMARY = "A Qt Quick Controls 2 Style for Desktop UIs"
DESCRIPTION = "A Qt Quick Controls 2 style engine that uses the desktop style \
to draw controls with QStyle."
LICENSE = "GPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "qqc2-desktop-style-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "07ba54ea123c5d212e974c9efd29e60502d14f5531b4677e776fd093066b895a22ef9e26dcbf981a2cbdf48fcb76f7f863bbbf6015a04b2b58e527eb002a5209"

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
