SUMMARY = "The screen recorder plugin of deepin dock"
DESCRIPTION = "The deepin screen recorder plugin of deepin dock"
LICENSE = "GPL-3.0-or-later"

PV = "5.11.6"

RPM_NAME = "deepin-dock-plugin-screen-recorder-5.11.6-1.6.aarch64.rpm"
RPM_HASH = "ebf28914eedf60c136d50c81cf09d749736bb7cfd6e90d3ae38f75cf042140d4d73cc72d4d3596b79beec123feaa803504d68e3985ca5d86efc50c7ecb4d7006"

RPROVIDES:${PN} += "deepin-dock-plugin-screen-recorder deepin-dock-plugin-screen-recorder(aarch-64) libdeepin-screen-recorder-plugin.so()(64bit)"
RDEPENDS:${PN} += "deepin-dock deepin-screen-recorder ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libdframeworkdbus.so.2()(64bit) libdtkgui.so.5()(64bit) libdtkwidget.so.5()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
