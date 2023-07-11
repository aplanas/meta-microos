SUMMARY = "Software Update Manager for Plasma"
DESCRIPTION = "Plasma applet for software updates using PackageKit."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.2+git70"

RPM_NAME = "plasma5-pk-updates-0.3.2+git70-2.7.aarch64.rpm"
RPM_HASH = "ea700485294eacd457cacaf117ce4c74b45d3fab2be35892e062e8a380124866b31ad0faedb33114d66e567bb8161cdbdeb7fd51f04bf5078ace29a50336bd78"

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
