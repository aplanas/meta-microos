SUMMARY = "Qt-based Traybar Application for Syncthing"
DESCRIPTION = "A Traybar Application for Syncthing written in Qt. \
 \
Features: \
 * Show number of connections at a glance. \
 * Traffic statistics and graphs about throughput and connections. \
 * Launch Syncthing and Syncthing-Inotify if specified. \
 * Quickly pause Syncthing with one click. \
 * Last Synchronised Files - Quickly see the recently synchronised \
   files and open their directory. \
 * Quick Access to all shared directories. \
 * Present Syncthing UI in a separate view instead of using the \
   browser. \
 * Support authenticated HTTPS connections. \
 * Use System Notifications about current connection status. \
 * A toggle for monochrome icon."
LICENSE = "LGPL-3.0-or-later & GPL-3.0-or-later"

PV = "0.5.8"

RPM_NAME = "qsyncthingtray-0.5.8-2.26.aarch64.rpm"
RPM_HASH = "7d59f79706d314dc21c2029ac0f93fd17d47f3c163bc17936340b60dacc55fd110a4c9635434d1f219a1fc7c0821fc24ba9c7cb2d0a8ef46a7cb5ccb927ed03c"

RPROVIDES:${PN} += "application() \
application(qsyncthingtray.desktop) \
metainfo() \
metainfo(qsyncthingtray.appdata.xml) \
qsyncthingtray \
qsyncthingtray(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
syncthing"

inherit rpm
