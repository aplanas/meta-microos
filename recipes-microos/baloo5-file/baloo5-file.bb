SUMMARY = "Filesearch components for Baloo Framework"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains filesearch components."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.105.0"

RPM_NAME = "baloo5-file-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "196eb7fbb4c200de979c30dc182daf1e8f9d46f08dd0d8909aa50c80610361417da172d98d2f7069393e0ab998665190500d6aa15b2b21ef03ecd84048406550"

RPROVIDES:${PN} += "baloo-file baloo5-file baloo5-file(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Baloo.so.5()(64bit) libKF5BalooEngine.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5FileMetaData.so.3()(64bit) libKF5I18n.so.5()(64bit) libKF5IdleTime.so.5()(64bit) libKF5Solid.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Sql5-sqlite libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
