SUMMARY = "Helper for the KDE Plasma Browser Integration"
DESCRIPTION = "This package contains a helper binary necessary for the WebExtension to \
work."
LICENSE = "GPL-3.0-or-later"

PV = "5.27.5"

RPM_NAME = "plasma-browser-integration-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "340a4f54b2bf55867027765440418e082942200227ecc6c4286639d092ebdfa81bc8a8cadcf75a856225efb5bbe0342338b0010377ed577f964efc14a6b904fb"

RPROVIDES:${PN} += "plasma-browser-integration"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Activities.so.5 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5FileMetaData.so.3 \
libKF5I18n.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5Notifications.so.5 \
libKF5Purpose.so.5 \
libKF5PurposeWidgets.so.5 \
libKF5Service.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
libtaskmanager.so.6"

inherit rpm
