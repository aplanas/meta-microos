SUMMARY = "Qt 6 Configuration Tool"
DESCRIPTION = "This program allows users to configure Qt6 settings (theme, font, icons, \
etc.) under DE/WM without Qt integration."
LICENSE = "BSD-2-Clause"

PV = "0.8"

RPM_NAME = "qt6ct-0.8-1.2.aarch64.rpm"
RPM_HASH = "047b6a8418c26cca74250caf034396253823800a7b8353883c8d87d84da57ddb27e3d61a85346ffa8fcd7587dc51201dd67688a496aafdf2e64241e19e577fcb"

RPROVIDES:${PN} += "application() \
application(qt6ct.desktop) \
libqt6ct-common.so.0.8()(64bit) \
libqt6ct-style.so()(64bit) \
libqt6ct.so()(64bit) \
qt6ct \
qt6ct(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Gui.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Svg6 \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.2)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
