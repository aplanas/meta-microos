SUMMARY = "Five-in-a-row Board Game"
DESCRIPTION = "Bovo is a Gomoku (Connect Five, Five in a row, X and O, etc) game by KDE."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "bovo-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "618605a77873443f1b836c2e66e20bc1f6f4804ee6f875283476d6e0bb3f222ff7c89e4a6814dc1e2c01757e2d8f323c1d3afd33658f4c49c14ee2d37baea09a"

RPROVIDES:${PN} += "application() \
application(org.kde.bovo.desktop) \
bovo \
bovo(aarch-64) \
bovo5 \
metainfo() \
metainfo(org.kde.bovo.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KDEGames.so.7()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit)"

inherit rpm
