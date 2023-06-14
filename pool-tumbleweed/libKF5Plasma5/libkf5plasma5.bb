SUMMARY = "Plasma framework - core libraries"
DESCRIPTION = "This package contains the core libraries needed by the Plasma framework."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5Plasma5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "c67c78f0cf209864d1be8e7ec1fd131f618ec87e3248318faf882db1ff8f9b7b3b1f4f1832db054a35af6cf8b071aef74cf453b8c0a091501e4e75dc7394b75c"

RPROVIDES:${PN} += "libKF5Plasma.so.5 \
libKF5Plasma5 \
libKF5PlasmaQuick.so.5 \
qt5qmlimport-org.kde.plasma.configuration.2 \
qt5qmlimport-org.kde.plasma.plasmoid.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Declarative.so.5 \
libKF5GlobalAccel.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5Notifications.so.5 \
libKF5Package.so.5 \
libKF5QuickAddons.so.5 \
libKF5Service.so.5 \
libKF5WaylandClient.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Sql.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libstdc++.so.6 \
libxcb-shape.so.0 \
libxcb.so.1"

inherit rpm
