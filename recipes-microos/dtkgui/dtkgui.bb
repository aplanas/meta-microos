SUMMARY = "Deepin Toolkit GUI"
DESCRIPTION = "A GUI module for DDE look and feel for the Deepin Toolkit."
LICENSE = "LGPL-3.0"

PV = "5.5.25"

RPM_NAME = "dtkgui-5.5.25-1.7.aarch64.rpm"
RPM_HASH = "67d2866ebacaa2a2ca6ddb4d2c19f7326543b600228a3af580b71ba42ea660381c02ecf853cf23b266fb05004b279c455c22fd807680161a5b2e50feb4671fdc"

RPROVIDES:${PN} += "dtkgui dtkgui(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdtkcore.so.5()(64bit) libdtkgui.so.5()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
