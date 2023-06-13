SUMMARY = "DigiKam: Showfoto"
DESCRIPTION = "Additional program to browse and view photos"
LICENSE = "GPL-2.0-or-later"

PV = "8.0.0"

RPM_NAME = "showfoto-8.0.0-3.2.aarch64.rpm"
RPM_HASH = "f01785e0429cd2578059bcea25368c7249f1c8a29e2868525eb0557de4253f6d2996ad6c005375dae72a9d3374a48acfba51bc5d71905431e3bb4b37fa2f5afc"

RPROVIDES:${PN} += "application() \
application(org.kde.showfoto.desktop) \
metainfo() \
metainfo(org.kde.showfoto.appdata.xml) \
mimehandler(image/gif) \
mimehandler(image/heic) \
mimehandler(image/heif) \
mimehandler(image/jpeg) \
mimehandler(image/png) \
mimehandler(image/tiff) \
mimehandler(image/x-bmp) \
mimehandler(image/x-dcraw) \
mimehandler(image/x-portable-bitmap) \
mimehandler(image/x-portable-graymap) \
mimehandler(image/x-portable-pixmap) \
mimehandler(image/x-psd) \
mimehandler(image/x-xbitmap) \
mimehandler(image/x-xpixmap) \
showfoto \
showfoto(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libMagick++-7.Q16HDRI.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdigikamcore.so.8.0.0()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
