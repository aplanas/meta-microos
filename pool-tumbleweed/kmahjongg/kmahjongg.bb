SUMMARY = "Mahjongg game"
DESCRIPTION = "KMahjongg is a clone of the well known tile based patience game of the \
same name. In the game you have to empty a game board filled with piece \
by removing pieces of the same type."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kmahjongg-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "581fe2a2757fbbad05811d578ce24db114a79758938732574e18a2f6d509309ccef1554c034ab11217af7c0d7547454fe347c61a2e6713496c0b1b8dd1db3e29"

RPROVIDES:${PN} += "application() \
application(org.kde.kmahjongg.desktop) \
kmahjongg \
kmahjongg(aarch-64) \
kmahjongg5 \
metainfo() \
metainfo(org.kde.kmahjongg.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KDEGames.so.7()(64bit) \
libKF5KMahjongglib.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
