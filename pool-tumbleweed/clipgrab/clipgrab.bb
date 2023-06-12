SUMMARY = "Video downloader"
DESCRIPTION = "A program which downloads and converts online videos from YouTube, Vimeo, \
DailyMotion, MyVideo and many other platforms."
LICENSE = "GPL-3.0-or-later"

PV = "3.9.7"

RPM_NAME = "clipgrab-3.9.7-1.12.aarch64.rpm"
RPM_HASH = "9b81bbb7ccdbb02170152838eb5f4e8b6f4e59a4df97770e4d8f65cf59a0c2f92aa844452333d8e7fbf53d57bef00ff06b390e286d74de246eca8825bbe6400c"

RPROVIDES:${PN} += "application() \
application(clipgrab.desktop) \
clipgrab \
clipgrab(aarch-64)"
RDEPENDS:${PN} += "ffmpeg \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5WebEngineCore.so.5()(64bit) \
libQt5WebEngineCore.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
