SUMMARY = "Perf GUI for performance analysis"
DESCRIPTION = "Hotspot is a standalone GUI for performance data with an UI like KCachegrind \
around Linux perf."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "hotspot-1.4.1-1.4.aarch64.rpm"
RPM_HASH = "83b6a3563204cc2d135e54e4811a8b7b9eede9dbb9b1a8fcd9f3d0bc0e8983191a0930a034be2c9060621c26fbd442a5ca0dc3303936160a74afde4661dc8251"

RPROVIDES:${PN} += "application() \
application(com.kdab.hotspot.desktop) \
hotspot \
hotspot(aarch-64) \
metainfo() \
metainfo(com.kdab.Hotspot.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5Parts.so.5()(64bit) \
libKF5Solid.so.5()(64bit) \
libKF5SyntaxHighlighting.so.5()(64bit) \
libKF5ThreadWeaver.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdebuginfod.so.1()(64bit) \
libdebuginfod.so.1(ELFUTILS_0.178)(64bit) \
libdebuginfod.so.1(ELFUTILS_0.179)(64bit) \
libdw.so.1()(64bit) \
libdw.so.1(ELFUTILS_0.122)(64bit) \
libdw.so.1(ELFUTILS_0.127)(64bit) \
libdw.so.1(ELFUTILS_0.130)(64bit) \
libdw.so.1(ELFUTILS_0.143)(64bit) \
libdw.so.1(ELFUTILS_0.156)(64bit) \
libdw.so.1(ELFUTILS_0.158)(64bit) \
libdw.so.1(ELFUTILS_0.188)(64bit) \
libelf.so.1()(64bit) \
libelf.so.1(ELFUTILS_1.0)(64bit) \
libelf.so.1(ELFUTILS_1.5)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libkddockwidgets.so.1.7()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libqcustomplot.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libzstd.so.1()(64bit) \
perf"

inherit rpm
