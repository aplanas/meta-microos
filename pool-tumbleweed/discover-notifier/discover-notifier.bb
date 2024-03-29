SUMMARY = "Update notifier for KDE Software Manager"
DESCRIPTION = "This is a notifier for Discover to inform the user that updates are available and allows the \
user to install them using Discover."
LICENSE = "GPL-2.0-only & GPL-3.0-only & GPL-3.0-or-later"

PV = "5.27.7"

RPM_NAME = "discover-notifier-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "77d36bb9f904a807a3a083f249095dc8d284443b80ae2f6f07de596f7aaecd2f70966d5be830763b6a56368deb6a2a739aa541df1bfd630a4e1cf4848e468d22"

RPROVIDES:${PN} += "discover-notifier"

RDEPENDS:${PN} += "discover \
ld-linux-aarch64.so.1 \
libDiscoverNotifiers.so \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5IdleTime.so.5 \
libKF5KCMUtils.so.5 \
libKF5KIOGui.so.5 \
libKF5Notifications.so.5 \
libKF5QuickAddons.so.5 \
libKF5Service.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libflatpak.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpackagekitqt5.so.1 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kcm.1 \
qt5qmlimport-org.kde.kirigami.2"

inherit rpm
