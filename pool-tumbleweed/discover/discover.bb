SUMMARY = "Software store for the KDE Plasma desktop"
DESCRIPTION = "Discover is a graphical software manager for the KDE Plasma desktop. It helps users to find software they might want easily and quickly. \
 \
By allowing to navigate a software library by search, categories, top lists along with detailed application information including screenshots and reviews, users can more quickly find applications that suit their needs."
LICENSE = "GPL-2.0-only & GPL-3.0-only & GPL-3.0-or-later"

PV = "5.27.7"

RPM_NAME = "discover-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "2ae9600ed7f20038310febf19cc22922bb63ba82caa496eaa4fcaf411a6ea78365928e53d2fe132a56c720fe46170769013c2a8a24faaa23ea8b87e679d24876"

RPROVIDES:${PN} += "discover \
libDiscoverCommon.so \
libDiscoverNotifiers.so"

RDEPENDS:${PN} += "kdeclarative-components \
kirigami2 \
kuserfeedback-imports \
ld-linux-aarch64.so.1 \
libAppStreamQt.so.2 \
libKF5Attica.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5NewStuffCore.so.5 \
libKF5Notifications.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5WebView.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libqt5-qtquickcontrols2 \
libstdc++.so.6"

inherit rpm
