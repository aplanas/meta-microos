SUMMARY = "Bluetooth Manager for KDE Plasma"
DESCRIPTION = "Bluetooth daemon for KDE Plasma, handling connections."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "bluedevil5-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "49d68b52603c9664c8704a0a3c335db07bcf01f30392ae0a31446769924da91060e0a8d83286de6276533ab5f1c0b72f0b9642fa7428b7035f538e3cbb95b3a2"

RPROVIDES:${PN} += "bluedevil5 \
libbluetoothplugin.so \
qt5qmlimport-org.kde.plasma.private.bluetooth.1"

RDEPENDS:${PN} += "bluez \
bluez-qt-imports \
bluez-qt-udev \
ld-linux-aarch64.so.1 \
libKF5BluezQt.so.6 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5Notifications.so.5 \
libKF5QuickAddons.so.5 \
libKF5Service.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.bluezqt.1 \
qt5qmlimport-org.kde.kcm.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kquickcontrolsaddons.2 \
qt5qmlimport-org.kde.plasma.components.2 \
qt5qmlimport-org.kde.plasma.components.3 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.extras.2 \
qt5qmlimport-org.kde.plasma.plasmoid.2 \
qt5qmlimport-org.kde.plasma.private.bluetooth.1"

inherit rpm
