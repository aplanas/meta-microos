SUMMARY = "Update notifier for KDE Software Manager"
DESCRIPTION = "This is a notifier for Discover to inform the user that updates are available and allows the \
user to install them using Discover."
LICENSE = "GPL-2.0-only & GPL-3.0-only & GPL-3.0-or-later"

PV = "5.27.5"

RPM_NAME = "discover-notifier-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "d18dd490d7d4276eff522e2ece608dc56218b86e75f7902caa32fe4ab67297a8837dcc55a2858080e90c04f22fad52c34f1263ec108a2dafef6071834edc9ebf"

RPROVIDES:${PN} += "application() \
application(kcm_updates.desktop) \
application(org.kde.discover.notifier.desktop) \
discover-notifier \
discover-notifier(aarch-64)"

RDEPENDS:${PN} += "discover \
ld-linux-aarch64.so.1()(64bit) \
libDiscoverNotifiers.so()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IdleTime.so.5()(64bit) \
libKF5KCMUtils.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5QuickAddons.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libflatpak.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpackagekitqt5.so.1()(64bit) \
libstdc++.so.6()(64bit) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(org.kde.kcm.1) \
qt5qmlimport(org.kde.kirigami.2)"

inherit rpm
