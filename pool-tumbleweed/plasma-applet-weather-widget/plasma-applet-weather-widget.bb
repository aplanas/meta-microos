SUMMARY = "Plasma 5 widget for displaying weather information"
DESCRIPTION = "Plasma 5 widget for displaying weather information."
LICENSE = "GPL-2.0-only"

PV = "1.6.10"

RPM_NAME = "plasma-applet-weather-widget-1.6.10-5.7.aarch64.rpm"
RPM_HASH = "298e3cd54c1384708af60ef03acf1b162184e5e1b549f0ee91e7521cb84e864f2795b5c855b366b3001d4735f27be35c0becb69bc86d6b4b97705e2f5a8358e1"

RPROVIDES:${PN} += "libplasmoidplugin.so()(64bit) \
metainfo() \
metainfo(org.kde.weatherWidget.appdata.xml) \
plasma-applet-weather-widget \
plasma-applet-weather-widget(aarch-64) \
qt5qmlimport(org.kde.private.weatherWidget.1)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libqt5-qtgraphicaleffects \
libqt5-qtxmlpatterns-imports \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
qt5qmlimport(QtGraphicalEffects.1) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.1) \
qt5qmlimport(QtQuick.Dialogs.1) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(QtQuick.XmlListModel.2) \
qt5qmlimport(org.kde.plasma.components.2) \
qt5qmlimport(org.kde.plasma.configuration.2) \
qt5qmlimport(org.kde.plasma.core.2) \
qt5qmlimport(org.kde.plasma.plasmoid.2)"

inherit rpm
