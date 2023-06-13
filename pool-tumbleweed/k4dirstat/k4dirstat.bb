SUMMARY = "Graphical Disk Usage Utility"
DESCRIPTION = "K4DirStat (KDE Directory Statistics) is a small utility program that sums up \
disk usage for directory trees, very much like the Unix 'du' command. It \
displays the disk space used up by a directory tree, both numerically and \
graphically."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.2"

RPM_NAME = "k4dirstat-3.4.2-1.3.aarch64.rpm"
RPM_HASH = "152566981a3707417bbeef115eae429566902ebb767b367d91f64dc6b5bd69f15d7e23a91428d2316c6393c6338fa1b3bd974cb4b99c7c6cd7c62f6559567224"

RPROVIDES:${PN} += "application() \
application(k4dirstat.desktop) \
k4dirstat \
k4dirstat(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.3.3)(64bit)"

inherit rpm
