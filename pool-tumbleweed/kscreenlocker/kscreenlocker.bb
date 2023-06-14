SUMMARY = "Library and components for secure lock screen architecture"
DESCRIPTION = "Library and components for secure lock screen architecture."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "kscreenlocker-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "c549fe30ec61ffd4850292f71f1468698151211472d119e70f70651a08710887b5128e58b880f91d09ef43b83415a80b43f1af0a45db6466ad86a7f1aea317af"

RPROVIDES:${PN} += "kscreenlocker"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/killall \
/usr/bin/perl \
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
