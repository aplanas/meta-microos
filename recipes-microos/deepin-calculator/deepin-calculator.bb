SUMMARY = "The Deepin Calculator Application"
DESCRIPTION = "Deepin calculator is an easy to use calculator for ordinary users."
LICENSE = "GPL-3.0-or-later"

PV = "5.7.21"

RPM_NAME = "deepin-calculator-5.7.21-1.3.aarch64.rpm"
RPM_HASH = "31b26fc986eece45a60a35962451cfeaf77a837cba759cb896ce098bf37e0d39dd7b23ce294b4fac6164aca0a4510f5fba0e252aab0f9be2c88a1d948aabd361"

RPROVIDES:${PN} += "application() application(deepin-calculator.desktop) deepin-calculator deepin-calculator(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdtkcore.so.5()(64bit) libdtkgui.so.5()(64bit) libdtkwidget.so.5()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
