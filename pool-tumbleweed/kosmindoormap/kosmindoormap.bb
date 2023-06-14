SUMMARY = "OSM indoor map QML component"
DESCRIPTION = "QML components for KDE Itinerary."
LICENSE = "LGPL-2.0-or-later & CC0-1.0"

PV = "23.04.1"

RPM_NAME = "kosmindoormap-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "72159adc6857d5d8db08ea5c3b004530d01ab0248618d36cc6eb06f243144d796065bc60903ca7b6554a105602d170007baaa1bbdaf8883d14f4ec74d1347d35"

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
