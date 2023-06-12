SUMMARY = "Alternate Xfce Menu"
DESCRIPTION = "Whisker Menu is an alternate application launcher for Xfce. When \
opened, it shows a list of applications marked as favorites. \
Installed applications can be browsed by clicking on the category \
buttons on the side. Whisker Menu keeps a list of most recent used \
applications launched from it."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.3"

RPM_NAME = "xfce4-whiskermenu-plugin-2.7.3-1.1.aarch64.rpm"
RPM_HASH = "5b1f61866e41b896ed9338de785b6e9276d8baeaa618c667fdb43e5f46a15b59a9c961e11b5d1f5ba9cd47be2c34749c9e7f0f4d3a648b769a0e5e25126d6a09"

RPROVIDES:${PN} += "libwhiskermenu.so()(64bit) \
xfce4-panel-plugin-whiskermenu \
xfce4-whiskermenu-plugin \
xfce4-whiskermenu-plugin(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libexo-2.so.0()(64bit) \
libgarcon-1.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libxfce4panel-2.0.so.4()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit)"

inherit rpm
