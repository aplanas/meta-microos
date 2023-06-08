SUMMARY = "Screenshot software"
DESCRIPTION = "A program to capture screenshots. \
 \
Features: \
 \
 * Customizable appearance \
 * Annotation and drawing tools \
 * DBus interface \
 * Export to file, web"
LICENSE = "GPL-3.0-only"

PV = "12.1.0"

RPM_NAME = "flameshot-12.1.0-1.4.aarch64.rpm"
RPM_HASH = "60b51ad3e3b0a65ef7705e3f06a92aeeb6bb5a481e0b65b8fe7e33441d16cf475e5f23209bed998ef8b63d3ed7dcc43974f92f52e73e8f8945b0321499547a4d"

RPROVIDES:${PN} += "application() application(org.flameshot.Flameshot.desktop) flameshot flameshot(aarch-64) metainfo() metainfo(org.flameshot.Flameshot.metainfo.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5GuiAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
