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

PV = "3.2.4"

RPM_NAME = "UltimateDailyWallpaper-3.2.4-1.1.aarch64.rpm"
RPM_HASH = "bf158de56b5ebdb2f9bc8d3fe9d0d3382210536f2b01bdff317b53e8b8f7a920d36835d2f59e39ab3afe07f5e12d444ee161ab29d2102fa7b792cfcee154c1bd"

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
