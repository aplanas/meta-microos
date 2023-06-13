SUMMARY = "Mastodon client by KDE"
DESCRIPTION = "Tokodon is a Mastodon client. It allows you to interact with the Fediverse \
community."
LICENSE = "GPL-3.0-only"

PV = "23.04.1"

RPM_NAME = "tokodon-23.04.1-2.1.aarch64.rpm"
RPM_HASH = "8ccc2572f3eb7d6087619899fe0ecbbfe1e534d7c3273a8bfa214075be251074e1ab071e4d6955615e86357d10a295a4ace38c01ec5226001b7b03dee97bb6fc"

RPROVIDES:${PN} += "application() \
application(org.kde.tokodon.desktop) \
metainfo() \
metainfo(org.kde.tokodon.appdata.xml) \
mimehandler(x-scheme-handler/web+ap) \
tokodon \
tokodon(aarch-64)"

RDEPENDS:${PN} += "kirigami-addons \
kirigami2 \
kitemmodels-imports \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5Kirigami2.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickControls2.so.5()(64bit) \
libQt5QuickControls2.so.5(Qt_5)(64bit) \
libQt5WebSockets.so.5()(64bit) \
libQt5WebSockets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libqt5-qtgraphicaleffects \
libqt5-qtquickcontrols \
libqt5-qtquickcontrols2 \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
sonnet-imports"

inherit rpm
