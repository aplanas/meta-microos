SUMMARY = "Weather application for Plasma"
DESCRIPTION = "A convergent weather application for Plasma. Has flat and dynamic/animated \
views for showing forecasts and other information."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kweather-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "b6a82e129cf9d3b8c640cc4b6289f091793785f42e444ab887c3aeefa63ab0e23a81761bdfdd69b7f54266a3e48c2352c3859cb65711d0352fe96bf8b78c6686"

RPROVIDES:${PN} += "application() \
application(org.kde.kweather.desktop) \
kweather \
kweather(aarch-64) \
metainfo() \
metainfo(org.kde.kweather.appdata.xml) \
metainfo(org.kde.plasma.kweather_1x4.appdata.xml)"

RDEPENDS:${PN} += "kirigami-addons \
kirigami2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KWeatherCore.so.5()(64bit) \
libKF5Plasma.so.5()(64bit) \
libQt5Charts.so.5()(64bit) \
libQt5Charts.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Quick.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5QuickControls2.so.5()(64bit) \
libQt5QuickControls2.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(org.kde.kirigami.2) \
qt5qmlimport(org.kde.plasma.plasmoid.2)"

inherit rpm
