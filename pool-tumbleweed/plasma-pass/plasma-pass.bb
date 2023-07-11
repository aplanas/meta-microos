SUMMARY = "Plasma 5 widget for the pass password manager"
DESCRIPTION = "Plasma Pass is a Plasma 5 widget to access, display and copy passwords \
generated and stored by the 'pass' password manager."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0"

RPM_NAME = "plasma-pass-1.2.0-3.9.aarch64.rpm"
RPM_HASH = "ac5522675073d0172b555d72512a8aa47aecac5e1e9c48ac1bed07b3fb6fbe3639407f55d9e6a79227f1361078de12f357bb363cc0dba11472d15020cafe8727"

RPROVIDES:${PN} += "libplasmapassplugin.so \
plasma-pass \
qt5qmlimport-org.kde.plasma.private.plasmapass.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5ItemModels.so.5 \
libKF5Plasma.so.5 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
liboath.so.0 \
libstdc++.so.6 \
qt5qmlimport-QtQml.Models.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.plasma.components.2 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.extras.2 \
qt5qmlimport-org.kde.plasma.plasmoid.2 \
qt5qmlimport-org.kde.plasma.private.plasmapass.1"

inherit rpm
