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

PV = "3.3.6"

RPM_NAME = "UltimateDailyWallpaper-3.3.6-1.1.aarch64.rpm"
RPM_HASH = "0581537f91830398adf74a253c69efbb93328f896f6d02538e6d4db78fe810e163068677d9124c4b0787b2e0b6587000f15aed62c97fc8f57a53f19e2d0876aa"

RPROVIDES:${PN} += "UltimateDailyWallpaper \
libbing-wallpaper-downloader-0.0.4.so \
libwikimedia-commons-potd-0.0.6.so"

RDEPENDS:${PN} += "curl \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
