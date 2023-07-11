SUMMARY = "Helper for KDE Firefox Integration"
DESCRIPTION = "Package providing integration of Mozilla applications with KDE."
LICENSE = "MIT"

PV = "5.0.6"

RPM_NAME = "kmozillahelper-5.0.6-1.15.aarch64.rpm"
RPM_HASH = "6beecb0f937649689254b5a65dc1fde378b0ca377863acc8ec1bbe3af707da6f65bf328469070b8b81fd0e793e2c3ae14685178cec1c15b460dc8de7b675f739"

RPROVIDES:${PN} += "MozillaFirefox-kde4-addon \
kmozillahelper \
mozilla-kde4-integration \
mozilla-xulrunner191-kde4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5Service.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
mozilla-kde4-version"

inherit rpm
