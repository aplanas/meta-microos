SUMMARY = "PackageKit Backend for Discover"
DESCRIPTION = "A plugin for Discover to support management of system packages and repositories \
using PackageKit."
LICENSE = "GPL-2.0-only & GPL-3.0-only & GPL-3.0-or-later"

PV = "5.27.4"

RPM_NAME = "discover-backend-packagekit-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "1a1677f3b22c973fa09f0ba72e16e9b4febeda25fafdf2734e4b8622dbdf03ba38addfbd85afa7597acf9a12ecb77ad8b9ce550abac3d2ac8e366b0cc01e0914"

RPROVIDES:${PN} += "discover-backend-packagekit discover-backend-packagekit(aarch-64) metainfo() metainfo(org.kde.discover.packagekit.appdata.xml)"
RDEPENDS:${PN} += "AppStream PackageKit appstream-provider discover ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libAppStreamQt.so.2()(64bit) libDiscoverCommon.so()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5Service.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpackagekitqt5.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
