SUMMARY = "Plasma frontend for Thunderbolt 3 security levels"
DESCRIPTION = "This is a frontend for configuring security levels of Thunderbolt 3 devices."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "plasma5-thunderbolt-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "22720a81790c860d5d4e2a5c94fbdc4c6184e714e2eaa0259ff23867abc0c3a50186fba96d4afe31d58ad8584ab583c2a8474ced2222cbea3e34aba4ea7358f1"

RPROVIDES:${PN} += "libkbolt.so \
plasma5-thunderbolt"

RDEPENDS:${PN} += "bolt \
kdeclarative-components \
kded \
kirigami2 \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5Notifications.so.5 \
libKF5QuickAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libqt5-qtquickcontrols2 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kcm.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kquickcontrolsaddons.2"

inherit rpm
