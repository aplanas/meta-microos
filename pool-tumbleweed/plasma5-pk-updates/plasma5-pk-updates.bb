SUMMARY = "Software Update Manager for Plasma"
DESCRIPTION = "Plasma applet for software updates using PackageKit."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.2+git70"

RPM_NAME = "plasma5-pk-updates-0.3.2+git70-2.6.aarch64.rpm"
RPM_HASH = "f67f217f0a2cdff5d15f22141f96fc8e711bdc9fcea7fd46b821963d1ad512dfb35d62f599d5edfeb138839fcce5b5703266dce91e2cc87043ec4c7282601d39"

RPROVIDES:${PN} += "apper \
libplasmapk-qmlplugins.so \
plasma5-pk-updates \
qt5qmlimport-org.kde.plasma.PackageKit.1"

RDEPENDS:${PN} += "PackageKit \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5Notifications.so.5 \
libKF5Solid.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libpackagekitqt5.so.1 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.plasma.PackageKit.1 \
qt5qmlimport-org.kde.plasma.components.3 \
qt5qmlimport-org.kde.plasma.configuration.2 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.extras.2 \
qt5qmlimport-org.kde.plasma.plasmoid.2"

inherit rpm
