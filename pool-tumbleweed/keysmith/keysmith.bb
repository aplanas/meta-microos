SUMMARY = "OTP client"
DESCRIPTION = "OTP client for Plasma Mobile and Desktop"
LICENSE = "GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "keysmith-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "56d1d9fb8b0423d64357638975cb130876b933c12a5ac49f70736db72c6bfbfecd5a080ede13846b4f214a7fea4e29a773155be470d8885227a7d26043c3f7a7"

RPROVIDES:${PN} += "application() \
application(org.kde.keysmith.desktop) \
keysmith \
keysmith(aarch-64) \
metainfo() \
metainfo(org.kde.keysmith.appdata.xml) \
mimehandler(x-scheme-handler/otpauth)"

RDEPENDS:${PN} += "kirigami2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5QuickControls2.so.5()(64bit) \
libQt5QuickControls2.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libsodium.so.23()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
