SUMMARY = "Action & Puzzle Solving Game"
DESCRIPTION = "KGoldrunner is a game of action and puzzle solving"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kgoldrunner-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "cc6dcb7b304df81bb30890b562bbc3fb56e273e84a40be6b457c3ef8313a5637edd8457a260092ba39e36c13803a4866b8f40d7534acf366e46c8e36e1c9bef9"

RPROVIDES:${PN} += "application() \
application(org.kde.kgoldrunner.desktop) \
kgoldrunner \
kgoldrunner(aarch-64) \
metainfo() \
metainfo(org.kde.kgoldrunner.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KDEGames.so.7()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm