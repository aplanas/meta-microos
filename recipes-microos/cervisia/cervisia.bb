SUMMARY = "CVS Frontend"
DESCRIPTION = "Cervisia is a tool to browse and work with CVS repositories."
LICENSE = "GPL-2.0-only & GFDL-1.2-only & LGPL-2.0-only"

PV = "23.04.0"

RPM_NAME = "cervisia-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "3b5f5a1a88f95cb305d2e6849deea9622966bd442a8503d8520272398377ed049329981091573a0ba8987a7f0ae4e425b56a6bb096589400145f3fed4a56243b"

RPROVIDES:${PN} += "application() application(org.kde.cervisia.desktop) cervisia cervisia(aarch-64) libkdeinit5_cervisia.so()(64bit) libkdeinit5_cvsaskpass.so()(64bit) libkdeinit5_cvsservice.so()(64bit) metainfo() metainfo(org.kde.cervisia.appdata.xml) mimehandler(inode/directory)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5ItemViews.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5Parts.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5Su.so.5()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
