SUMMARY = "Integration of Android with Linux desktops"
DESCRIPTION = "A package for integration of Android with Linux desktops. \
 \
Current feature list: \
- Clipboard share: copy from or to your desktop \
- Notifications sync (4.3+): Read your Android notifications \
- Multimedia remote control: Use your phone as a remote control \
- WiFi connection: no USB wire or Bluetooth needed \
- RSA Encryption: your information is safe \
 \
Please note you will need to install KDE Connect on Android for this app to work: \
https://play.google.com/store/apps/details?id=org.kde.kdeconnect_tp or \
https://f-droid.org/en/packages/org.kde.kdeconnect_tp/"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdeconnect-kde-23.04.1-2.1.aarch64.rpm"
RPM_HASH = "e6bd5d1b56d82b692ffe48ad9d3771f39767aedb05f753f7141ee6860736d945e24a751a6889aaad519ac50f03b74044733c89d4c624796f34b6c330601d1a3f"

RPROVIDES:${PN} += "kdeconnect-kde \
libkdeconnectcore.so.23 \
libkdeconnectdeclarativeplugin.so \
libkdeconnectinterfaces.so.23 \
libkdeconnectpluginkcm.so.23 \
qt5qmlimport-org.kde.kdeconnect.1"

RDEPENDS:${PN} += "/usr/bin/sh \
kirigami2 \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KCMUtils.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5ModemManagerQt.so.6 \
libKF5Notifications.so.5 \
libKF5People.so.5 \
libKF5PulseAudioQt.so.3 \
libKF5Service.so.5 \
libKF5Solid.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5WaylandClient.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6 \
libfakekey.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libqca-qt5.so.2 \
libqt5-qtquickcontrols2 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxkbcommon.so.0 \
plasma-framework-components \
qt5qmlimport-Qt.labs.platform.1 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kdeconnect.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kquickcontrolsaddons.2 \
qt5qmlimport-org.kde.plasma.components.2 \
qt5qmlimport-org.kde.plasma.components.3 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.extras.2 \
qt5qmlimport-org.kde.plasma.plasmoid.2 \
sshfs"

inherit rpm
