SUMMARY = "Video downloader"
DESCRIPTION = "A program which downloads and converts online videos from YouTube, Vimeo, \
DailyMotion, MyVideo and many other platforms."
LICENSE = "GPL-3.0-or-later"

PV = "3.9.7"

RPM_NAME = "clipgrab-3.9.7-1.11.aarch64.rpm"
RPM_HASH = "1e1077620684a8a6531a06e224a0aa4f1a2fce325ba0bd4015df599aafc58d2387eefebce1dc7176ff618b0f6f08a9d936df7a2191e27a58d24540cc882c2b40"

RPROVIDES:${PN} += "application() application(clipgrab.desktop) clipgrab clipgrab(aarch-64)"
RDEPENDS:${PN} += "ffmpeg ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5WebEngineCore.so.5()(64bit) libQt5WebEngineCore.so.5(Qt_5)(64bit) libQt5WebEngineWidgets.so.5()(64bit) libQt5WebEngineWidgets.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
