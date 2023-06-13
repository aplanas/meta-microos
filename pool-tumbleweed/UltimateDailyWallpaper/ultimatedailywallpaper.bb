SUMMARY = "A wallpaper changer and downloader"
DESCRIPTION = "UltimateDailyWallpaper is a utility to set the daily \
picture as wallpaper of a selected provider. It saves \
images in a high quality. Further information about \
each picture can be obtained from the Internet with a \
single click. It integrates with most desktop \
environments to provide automatically changing wallpaper. \
It allows a simple integration of external plugins, which \
allows downloading a daily wallpaper from any one provider."
LICENSE = "GPL-3.0+"

PV = "3.2.3"

RPM_NAME = "UltimateDailyWallpaper-3.2.3-1.1.aarch64.rpm"
RPM_HASH = "92a2eca1ee891d97be18d4cea23935ae1289e6906dd31dad3463e6657e77457e5f4607bfa71cd75761f835b1c6318972b6759b648af0251ff4d5b8c346d60156"

RPROVIDES:${PN} += "UltimateDailyWallpaper \
UltimateDailyWallpaper(aarch-64) \
application() \
application(UltimateDailyWallpaper.desktop) \
libbing-wallpaper-downloader-0.0.4.so()(64bit) \
libwikimedia-commons-potd-0.0.6.so()(64bit)"

RDEPENDS:${PN} += "curl \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
