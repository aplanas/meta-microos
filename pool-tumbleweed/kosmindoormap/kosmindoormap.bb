SUMMARY = "OSM indoor map QML component"
DESCRIPTION = "QML components for KDE Itinerary."
LICENSE = "LGPL-2.0-or-later & CC0-1.0"

PV = "23.04.1"

RPM_NAME = "kosmindoormap-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "72159adc6857d5d8db08ea5c3b004530d01ab0248618d36cc6eb06f243144d796065bc60903ca7b6554a105602d170007baaa1bbdaf8883d14f4ec74d1347d35"

RPROVIDES:${PN} += "kosmindoormap \
kosmindoormap(aarch-64) \
libkosmindoormap_kpublictransport_integration_plugin.so()(64bit) \
libkosmindoormapquickplugin.so()(64bit) \
qt5qmlimport(org.kde.kosmindoormap.1) \
qt5qmlimport(org.kde.kosmindoormap.kpublictransport.1)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5I18nLocaleData.so.5()(64bit) \
libKOSM.so.1()(64bit) \
libKOSM1 \
libKOSMIndoorMap.so.1()(64bit) \
libKPublicTransport.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(org.kde.kosmindoormap.1)"

inherit rpm
