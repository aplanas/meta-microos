SUMMARY = "Weather application for Plasma"
DESCRIPTION = "A convergent weather application for Plasma. Has flat and dynamic/animated \
views for showing forecasts and other information."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kweather-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "b6a82e129cf9d3b8c640cc4b6289f091793785f42e444ab887c3aeefa63ab0e23a81761bdfdd69b7f54266a3e48c2352c3859cb65711d0352fe96bf8b78c6686"

RPROVIDES:${PN} += "kweather"

RDEPENDS:${PN} += "kirigami-addons \
kirigami2 \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KWeatherCore.so.5 \
libKF5Plasma.so.5 \
libQt5Charts.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.plasma.plasmoid.2"

inherit rpm
