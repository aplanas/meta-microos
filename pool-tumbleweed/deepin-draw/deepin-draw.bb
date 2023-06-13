SUMMARY = "A calendar application for Deepin Desktop"
DESCRIPTION = "Draw is a lightweight drawing tool for users to freely draw and simply edit \
images developed by Deepin Technology."
LICENSE = "GPL-3.0-or-later"

PV = "5.11.4"

RPM_NAME = "deepin-draw-5.11.4-1.3.aarch64.rpm"
RPM_HASH = "132c6dcbb498a9f680fbf840decd19db11537cff2eb1b567d92487e19636f21d2dc451cca443156aa4043ed0069bc538f61ee80cc49992dc6403de51f44880ff"

RPROVIDES:${PN} += "application() \
application(deepin-draw.desktop) \
deepin-draw \
deepin-draw(aarch-64) \
mimehandler(application/x-ddf) \
mimehandler(image/bmp) \
mimehandler(image/bmp24) \
mimehandler(image/jng) \
mimehandler(image/jpe) \
mimehandler(image/jpeg) \
mimehandler(image/jpeg24) \
mimehandler(image/jpg) \
mimehandler(image/pbm) \
mimehandler(image/pgm) \
mimehandler(image/png) \
mimehandler(image/ppm) \
mimehandler(image/tif) \
mimehandler(image/tiff) \
mimehandler(image/tiff24) \
mimehandler(image/x-portable-graymap) \
mimehandler(image/x-portable-pixmap) \
mimehandler(image/x-xbitmap) \
mimehandler(image/x-xpixmap) \
mimehandler(image/xbm) \
mimehandler(image/xpm)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdtkcore.so.5()(64bit) \
libdtkgui.so.5()(64bit) \
libdtkwidget.so.5()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
