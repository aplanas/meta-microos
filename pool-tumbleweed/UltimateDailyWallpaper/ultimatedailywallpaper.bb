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

PV = "3.3.3"

RPM_NAME = "UltimateDailyWallpaper-3.3.3-1.1.aarch64.rpm"
RPM_HASH = "0ec8898acf55aa81166f738272a7c085658fb9aca575a08a77ff224e5b412d7653462c878232b87ff8e4c93100e958d73225c3e637ec0ccfd7b78262745b53e1"

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
