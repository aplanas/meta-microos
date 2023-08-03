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

PV = "3.3.2"

RPM_NAME = "UltimateDailyWallpaper-3.3.2-1.1.aarch64.rpm"
RPM_HASH = "547a2062dfe74f65de2dd2cfde711663ff426aec6376cf6f2f518aef68cb48df38aeb28ab18f3d17fed547faee64b5f756eec9c966fe6ff7e0d00a91315817ba"

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
