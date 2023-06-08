SUMMARY = "Calamares webview module"
DESCRIPTION = "Optional webview module for the Calamares installer."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.36"

RPM_NAME = "calamares-webview-3.2.36-1.20.aarch64.rpm"
RPM_HASH = "bae29aaaac0a044f37a5ab72323e09d0520adbedd175808233eb2d2d9a2d2a9c5891fee525918aec4000abd4181d6b69a3924b724b8b8a87c31a86eccf4de883"

RPROVIDES:${PN} += "calamares-webview calamares-webview(aarch-64) libcalamares_viewmodule_webview.so()(64bit)"
RDEPENDS:${PN} += "calamares(aarch-64) ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5WebEngine.so.5()(64bit) libQt5WebEngine.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcalamares.so.3.2.36()(64bit) libcalamaresui.so.3.2.36()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
