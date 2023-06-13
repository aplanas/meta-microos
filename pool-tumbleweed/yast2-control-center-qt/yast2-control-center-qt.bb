SUMMARY = "YaST2 - Control Center (Qt Version)"
DESCRIPTION = "This package contains the menu selection component for YaST2 using the \
Qt toolkit."
LICENSE = "GPL-2.0-only"

PV = "4.6.1"

RPM_NAME = "yast2-control-center-qt-4.6.1-1.1.aarch64.rpm"
RPM_HASH = "62bac94035e3ff6c08ee3f35286848e01b3a25f09ed30aa9a9614af3d19775de0c8a7d9c2c01207f63cccbaf06230dc566d553f01f7706ed474e3659a9d5b239"

RPROVIDES:${PN} += "yast2-control-center-binary \
yast2-control-center-qt \
yast2-control-center-qt(aarch-64) \
yast2-control-center:/usr/lib/YaST2/bin/y2controlcenter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Svg5 \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libyui-qt \
xdg-utils \
yast2-control-center"

inherit rpm
