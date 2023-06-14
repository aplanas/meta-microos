SUMMARY = "Plasma applet written in QML for managing network connections"
DESCRIPTION = "Plasma applet for controlling network connections on systems \
that use the NetworkManager service."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.5"

RPM_NAME = "plasma-nm5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "93f5dbd5ee3ee8fbbcff9780dfcf70f0b9148e1c4e2c40fb9df2faf44dd697508487f4dcf63f3903b23021259722808763a27ff4b270073e5b335df1e28a57df"

RPROVIDES:${PN} += "NetworkManager-client \
libplasmanm-editor.so \
libplasmanm-internal.so \
libplasmanm-qmlplugins.so \
plasma-nm \
plasma-nm-kf5 \
plasma-nm5 \
plasma-nm5-wireguard \
qt5qmlimport-org.kde.plasma.networkmanagement.0"

RDEPENDS:${PN} += "NetworkManager \
kded \
kirigami2 \
kwalletd5 \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5ModemManagerQt.so.6 \
libKF5NetworkManagerQt.so.6 \
libKF5Notifications.so.5 \
libKF5Solid.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnm.so.0 \
libqca-qt5.so.2 \
libstdc++.so.6 \
prison-qt5-imports \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-org.kde.kcoreaddons.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kquickcontrolsaddons.2 \
qt5qmlimport-org.kde.plasma.components.2 \
qt5qmlimport-org.kde.plasma.components.3 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.extras.2 \
qt5qmlimport-org.kde.plasma.networkmanagement.0 \
qt5qmlimport-org.kde.plasma.plasmoid.2 \
qt5qmlimport-org.kde.prison.1 \
qt5qmlimport-org.kde.quickcharts.1 \
qt5qmlimport-org.kde.quickcharts.controls.1"

inherit rpm
