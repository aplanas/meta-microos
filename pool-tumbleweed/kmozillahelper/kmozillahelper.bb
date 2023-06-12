SUMMARY = "Helper for KDE Firefox Integration"
DESCRIPTION = "Package providing integration of Mozilla applications with KDE."
LICENSE = "MIT"

PV = "5.0.6"

RPM_NAME = "kmozillahelper-5.0.6-1.14.aarch64.rpm"
RPM_HASH = "f39f2d89aef4f880d47e2b14e062b18eb4c3796e686469cfc301cfa0ddf55dfc3d2917b27895c9fb1951932d00cf670e203203581874de3e56046cc1192cbc2b"

RPROVIDES:${PN} += "MozillaFirefox-kde4-addon \
kmozillahelper \
kmozillahelper(aarch-64) \
mozilla-kde4-integration \
mozilla-xulrunner191-kde4"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
mozilla-kde4-version"

inherit rpm
