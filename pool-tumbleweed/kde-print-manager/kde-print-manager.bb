SUMMARY = "Tools for managing print jobs and printers"
DESCRIPTION = "kde-print-manager provides tools for managing print jobs and printers."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kde-print-manager-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "95acbecd0669c24ecf56c9214666fd64f86d428131509122f1d9b677d204b764545a484d9f26dddf9b1ea46428a8a0329b31694607dac0095069d3b6e82a33e8"

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
