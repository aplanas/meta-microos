SUMMARY = "Text grammar checking"
DESCRIPTION = "This package provides a library for automated grammar checking."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libKF5TextGrammarCheck1-1.1.0-1.1.aarch64.rpm"
RPM_HASH = "a69c47ed4bdfeb79441336f4cdf8bbb058a061592f957c6551c17ce71a844e8e15f286ed65b44d3790e1cd8a15c19b1ebcfbafba08b232ba2e1769b724f8e48c"

RPROVIDES:${PN} += "libKF5TextGrammarCheck.so.1()(64bit) \
libKF5TextGrammarCheck1 \
libKF5TextGrammarCheck1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ktextaddons \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
