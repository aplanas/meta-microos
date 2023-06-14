SUMMARY = "The KDE optimized frontend for Marble and several Plasmoids/Wallpapers"
DESCRIPTION = "The KDE frontend for the Marble map viewer. It also includes several plasmoids and wallpapers for Plasma"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "marble-kde-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "3ec9fc93845a851eb0afb0296c5f7d87aec29370021ab04b2924a586c7c33f43044686bb46868436d8fbfbd3a258a4e4ffab5a1e342cc9d7915dc47452508210"

RPROVIDES:${PN} += "marble-frontend \
marble-kde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5Parts.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libmarblewidget-qt5.so.28 \
libstdc++.so.6 \
marble \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.marble.private.plasma.0 \
qt5qmlimport-org.kde.plasma.components.2 \
qt5qmlimport-org.kde.plasma.configuration.2 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.extras.2 \
qt5qmlimport-org.kde.plasma.plasmoid.2"

inherit rpm
