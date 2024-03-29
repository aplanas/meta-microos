SUMMARY = "Config Module for the System Firewall"
DESCRIPTION = "Config Module for the System Firewall"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "5.27.7"

RPM_NAME = "plasma5-firewall-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "05e920bf0f86fdc64ac5c1586ea33e8bd7a4f2457be1a296e9e6fda727096d0e2463393608a9e1b4a5db3d4cc0420380307a78dd13b8c0c658758087b11c0a49"

RPROVIDES:${PN} += "libkcm-firewall-core.so \
plasma5-firewall"

RDEPENDS:${PN} += "firewalld \
kdeclarative-components \
kirigami2 \
kitemmodels-imports \
knewstuff-imports \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5QuickAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libqt5-qtquickcontrols \
libqt5-qtquickcontrols2 \
libstdc++.so.6 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kcm.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kitemmodels.1"

inherit rpm
