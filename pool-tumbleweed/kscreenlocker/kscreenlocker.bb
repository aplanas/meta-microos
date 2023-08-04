SUMMARY = "Library and components for secure lock screen architecture"
DESCRIPTION = "Library and components for secure lock screen architecture."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "kscreenlocker-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "be2c73a6f04676b70db445b8c74d90705f368fc3316f07fe2b8c47c14c237abc0ce780ab2a167406e61d611c6f59b226994ccfff82e0b31bd87d92a2ab7a0f41"

RPROVIDES:${PN} += "kscreenlocker"

RDEPENDS:${PN} += "/usr/bin/killall \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigQml.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5Declarative.so.5 \
libKF5GlobalAccel.so.5 \
libKF5I18n.so.5 \
libKF5KCMUtils.so.5 \
libKF5KIOCore.so.5 \
libKF5Package.so.5 \
libKF5QuickAddons.so.5 \
libKF5ScreenDpms.so.8 \
libKF5WaylandClient.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libLayerShellQtInterface.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libpam.so.0 \
libstdc++.so.6 \
libwayland-client.so.0 \
pam-config \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kcm.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kquickcontrols.2"

inherit rpm
