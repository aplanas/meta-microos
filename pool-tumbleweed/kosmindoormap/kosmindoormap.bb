SUMMARY = "OSM indoor map QML component"
DESCRIPTION = "QML components for KDE Itinerary."
LICENSE = "LGPL-2.0-or-later & CC0-1.0"

PV = "23.04.3"

RPM_NAME = "kosmindoormap-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "8dbe893ff2fa39dff91ff38e2d6ac7162446a16c9887eb5f9ed646dde783e99ff3ca76c2bf0293b01746665548e35ae280314d81e8f6d4af724834627373ea1b"

RPROVIDES:${PN} += "kosmindoormap \
libkosmindoormap-kpublictransport-integration-plugin.so \
libkosmindoormapquickplugin.so \
qt5qmlimport-org.kde.kosmindoormap.1 \
qt5qmlimport-org.kde.kosmindoormap.kpublictransport.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libKF5I18nLocaleData.so.5 \
libKOSM.so.1 \
libKOSM1 \
libKOSMIndoorMap.so.1 \
libKPublicTransport.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kosmindoormap.1"

inherit rpm
