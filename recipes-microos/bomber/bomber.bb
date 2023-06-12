SUMMARY = "Game involving the invasion of cities with a plane"
DESCRIPTION = "Bomber is a single player arcade game. The player is invading various cities in \
a plane that is decreasing in height. \
 \
The goal of the game is to destroy all the buildings and advance to the next \
level. Each level gets a harder by increasing the speed of the plane and the \
height of the buildings."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "bomber-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "e33baba1ab82256bf6390171787c4db3302d4158967e8549218cd35734779da2de9021918173de79503e1ccb84aa088ec265ed3f110c1b4e0db6d046f9badc49"

RPROVIDES:${PN} += "application() application(org.kde.bomber.desktop) bomber bomber(aarch-64) bomber5 metainfo() metainfo(org.kde.bomber.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
