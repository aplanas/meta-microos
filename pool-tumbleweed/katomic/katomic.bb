SUMMARY = "Sokoban-like logic game"
DESCRIPTION = "KAtomic is a thinking game where you have to form chemical molecules \
out of atoms. This is done with a nice graphical interface where you \
can move each atom in a labyrinth."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "katomic-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "ee396e0d59f4c1f87c468bc31e436682c49f9980b9447625e273ef8ec819438a713fc44969537374cb03bb4114d8da066571bb537f3a1e7f8b384e4be85b7996"

RPROVIDES:${PN} += "application() \
application(org.kde.katomic.desktop) \
katomic \
katomic(aarch-64) \
katomic5 \
metainfo() \
metainfo(org.kde.katomic.appdata.xml)"
RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KDEGames.so.7()(64bit) \
libKF5NewStuffCore.so.5()(64bit) \
libKF5NewStuffWidgets.so.5()(64bit) \
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
