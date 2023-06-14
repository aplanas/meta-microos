SUMMARY = "Kirigami based gallery application"
DESCRIPTION = "Koko is a simple image gallery application that is designed to view, edit and \
share images."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "koko-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "e9fe320e5c60478827fd3cfa82293a7ddb0ba9b9527970f7581bdfeefb3bb843282789559f556363aa7e656701bb4b1fb6a306bb48448ffaa8bd9839d51081d2"

RPROVIDES:${PN} += "koko \
libkokocommon.so.0.0.1 \
libkokoqmlplugin.so \
qt5qmlimport-org.kde.koko.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
kirigami2 \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5FileMetaData.so.3 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Positioning.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Sql.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libexiv2.so.27 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxcb.so.1"

inherit rpm
