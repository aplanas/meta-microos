SUMMARY = "Helper for the KDE Plasma Browser Integration"
DESCRIPTION = "This package contains a helper binary necessary for the WebExtension to \
work."
LICENSE = "GPL-3.0-or-later"

PV = "5.27.5"

RPM_NAME = "plasma-browser-integration-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "340a4f54b2bf55867027765440418e082942200227ecc6c4286639d092ebdfa81bc8a8cadcf75a856225efb5bbe0342338b0010377ed577f964efc14a6b904fb"

RPROVIDES:${PN} += "application() \
application(org.kde.plasma.browser_integration.host.desktop) \
plasma-browser-integration \
plasma-browser-integration(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5Activities.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5FileMetaData.so.3()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5Purpose.so.5()(64bit) \
libKF5PurposeWidgets.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libtaskmanager.so.6()(64bit)"

inherit rpm
