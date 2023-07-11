SUMMARY = "Kirigami based gallery application"
DESCRIPTION = "Koko is a simple image gallery application that is designed to view, edit and \
share images."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "koko-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "08d7d2e599b450bb3f1f6078257c206b3eedf7a895376cc4ae00e27aca4dbdc6381216fb251226b0c1ad85455e72278a6ca7106ff98f68143c02eea9af69cdae"

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
libexiv2.so.28 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxcb.so.1"

inherit rpm
