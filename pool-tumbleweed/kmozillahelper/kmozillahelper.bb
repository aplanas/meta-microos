SUMMARY = "Helper for KDE Firefox Integration"
DESCRIPTION = "Package providing integration of Mozilla applications with KDE."
LICENSE = "MIT"

PV = "5.0.6"

RPM_NAME = "kmozillahelper-5.0.6-1.14.aarch64.rpm"
RPM_HASH = "f39f2d89aef4f880d47e2b14e062b18eb4c3796e686469cfc301cfa0ddf55dfc3d2917b27895c9fb1951932d00cf670e203203581874de3e56046cc1192cbc2b"

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
