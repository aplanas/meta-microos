SUMMARY = "Qt 6 QuickTimeline QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 QuickTimeline module"
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quicktimeline-imports-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "05c26483641723328e2b76509d3560f6a7a67ba2501c55a2af7810dd38466d69800f3e0d9ac86e706cb40e6c6e55ad082940c4c1eedf8cf78072a39c21c7db0e"

RPROVIDES:${PN} += "libqtquicktimelineplugin.so \
qt6-quicktimeline-imports \
qt6qmlimport-QtQuick.Timeline.1 \
qt6qmlimport-QtQuick.Timeline.2 \
qt6qmlimport-QtQuick.Timeline.6"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6QuickTimeline.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
