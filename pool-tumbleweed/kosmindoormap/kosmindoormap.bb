SUMMARY = "OSM indoor map QML component"
DESCRIPTION = "QML components for KDE Itinerary."
LICENSE = "LGPL-2.0-or-later & CC0-1.0"

PV = "23.08.0"

RPM_NAME = "kosmindoormap-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "47ef789aed6be369901ae6da24dac0c2a903eaf9a61b36b5d04747d40696765c6e3a74c4b12836d2aebff625d2e8a01dfa7d636b0fb103fb99757857736c93a3"

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
