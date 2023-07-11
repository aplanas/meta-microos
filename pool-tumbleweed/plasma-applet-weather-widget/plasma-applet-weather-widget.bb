SUMMARY = "Plasma 5 widget for displaying weather information"
DESCRIPTION = "Plasma 5 widget for displaying weather information."
LICENSE = "GPL-2.0-only"

PV = "1.6.10"

RPM_NAME = "plasma-applet-weather-widget-1.6.10-5.8.aarch64.rpm"
RPM_HASH = "98a45adfbf3e5ca7570c6a67a99b698b2565ad123e237ecf6f79dde82ac4b92df48fbc0ad279ed5d8fda30ee1a7af64a63292b5d37ad2b5f6dfc200824c88504"

RPROVIDES:${PN} += "libplasmoidplugin.so \
plasma-applet-weather-widget \
qt5qmlimport-org.kde.private.weatherWidget.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libqt5-qtgraphicaleffects \
libqt5-qtxmlpatterns-imports \
libstdc++.so.6 \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.XmlListModel.2 \
qt5qmlimport-org.kde.plasma.components.2 \
qt5qmlimport-org.kde.plasma.configuration.2 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.plasmoid.2"

inherit rpm
