SUMMARY = "KIO slave components for Baloo Framework"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains KIO slave components."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.105.0"

RPM_NAME = "baloo5-kioslaves-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "9e8b8833e22b6acad0786ec5203952d942e3d1f09b04f071a299e4a0d9cec8623c18a21ee96249f4784eba54cea8cf843cc19fd1542307d09ed465d31f864dce"

RPROVIDES:${PN} += "baloo5-kioslaves baloo5-kioslaves(aarch-64)"
RDEPENDS:${PN} += "kded ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Baloo.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5FileMetaData.so.3()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.33)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
