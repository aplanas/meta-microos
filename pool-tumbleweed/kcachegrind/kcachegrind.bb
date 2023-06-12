SUMMARY = "Frontend for Cachegrind"
DESCRIPTION = "KCachegrind is a frontend for cachegrind."
LICENSE = "GPL-2.0-only & BSD-4-Clause & GFDL-1.2-only"

PV = "23.04.1"

RPM_NAME = "kcachegrind-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "cd2b0e1addcd3564545cfd33b7967a5a5fd6ba56aaa5269826a45f695604d86311f02ff3da42257b6b582ffb30045a0e8f67da3dd5c200d56af6f502801f96e9"

RPROVIDES:${PN} += "application() \
application(org.kde.kcachegrind.desktop) \
kcachegrind \
kcachegrind(aarch-64) \
metainfo() \
metainfo(org.kde.kcachegrind.appdata.xml) \
mimehandler(application/x-kcachegrind)"
RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
