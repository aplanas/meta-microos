SUMMARY = "Plasma frontend for Thunderbolt 3 security levels"
DESCRIPTION = "This is a frontend for configuring security levels of Thunderbolt 3 devices."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "plasma5-thunderbolt-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "f3b83882582958300bcc063d3698f82b6e3833265fc8dfa3c82aaaee0935b4ea9351c33a14ccd4b2821e2e3913b7672420fa84bb811b8b02653edc3c02071831"

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
