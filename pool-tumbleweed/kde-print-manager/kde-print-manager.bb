SUMMARY = "Tools for managing print jobs and printers"
DESCRIPTION = "kde-print-manager provides tools for managing print jobs and printers."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kde-print-manager-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "1dcc5dfdca7176e247e8544339ef76d919e0ab3c84afbd26ac658d15668f2b94c2ab31972e1ffcd04253a7b860cd11f54a5780182f3c215ecf692962b33ebf1a"

RPROVIDES:${PN} += "dbus-com.redhat.NewPrinterNotification \
kde-print-manager \
libkcupslib.so \
libprintmanager.so \
print-manager5 \
qt5qmlimport-org.kde.plasma.printmanager.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcups.so.2 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-org.kde.kquickcontrolsaddons.2 \
qt5qmlimport-org.kde.plasma.components.3 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.extras.2 \
qt5qmlimport-org.kde.plasma.plasmoid.2 \
qt5qmlimport-org.kde.plasma.printmanager.0"

inherit rpm
