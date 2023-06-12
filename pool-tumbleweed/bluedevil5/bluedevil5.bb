SUMMARY = "Bluetooth Manager for KDE Plasma"
DESCRIPTION = "Bluetooth daemon for KDE Plasma, handling connections."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "bluedevil5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "0ad313123d74555ec44c4d988910546b54fb235880d754e2d22ebbff957e6e5ff233f02a135de2276164c81dc1e99f0af68d2770334688103820811a25166c1f"

RPROVIDES:${PN} += "application() \
application(kcm_bluetooth.desktop) \
application(org.kde.bluedevilsendfile.desktop) \
application(org.kde.bluedevilwizard.desktop) \
bluedevil5 \
bluedevil5(aarch-64) \
libbluetoothplugin.so()(64bit) \
metainfo() \
metainfo(org.kde.plasma.bluetooth.appdata.xml) \
mimehandler(application/vnd.kde.bluedevil-sendfile) \
qt5qmlimport(org.kde.plasma.private.bluetooth.1)"
RDEPENDS:${PN} += "bluez \
bluez-qt-imports \
bluez-qt-udev \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5BluezQt.so.6()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5QuickAddons.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Dialogs.1) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(org.kde.bluezqt.1) \
qt5qmlimport(org.kde.kcm.1) \
qt5qmlimport(org.kde.kirigami.2) \
qt5qmlimport(org.kde.kquickcontrolsaddons.2) \
qt5qmlimport(org.kde.plasma.components.2) \
qt5qmlimport(org.kde.plasma.components.3) \
qt5qmlimport(org.kde.plasma.core.2) \
qt5qmlimport(org.kde.plasma.extras.2) \
qt5qmlimport(org.kde.plasma.plasmoid.2) \
qt5qmlimport(org.kde.plasma.private.bluetooth.1)"

inherit rpm
