SUMMARY = "The shot start plugin of deepin dock"
DESCRIPTION = "The shot start of deepin dock"
LICENSE = "GPL-3.0-or-later"

PV = "5.11.6"

RPM_NAME = "deepin-dock-plugin-shot-start-5.11.6-1.7.aarch64.rpm"
RPM_HASH = "a614fe1a9f0dee84c808024a49661de3981a272d2ef0af61721a6571d3de3a1947bc3895ee4672f9d4971b9a33199854fd1b3a78f4f6138c2a51f5b2c22c0f18"

RPROVIDES:${PN} += "deepin-dock-plugin-shot-start \
deepin-dock-plugin-shot-start(aarch-64) \
libshot-start-plugin.so()(64bit)"
RDEPENDS:${PN} += "deepin-dock \
deepin-screen-recorder \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdtkgui.so.5()(64bit) \
libdtkwidget.so.5()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit)"

inherit rpm
