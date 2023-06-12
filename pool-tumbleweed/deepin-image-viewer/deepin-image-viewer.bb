SUMMARY = "Deepin Image Viewer"
DESCRIPTION = "Deepin Image Viewer is the Image Viewer for Deepin Desktop Environment(DDE)"
LICENSE = "GPL-3.0-or-later"

PV = "5.9.9"

RPM_NAME = "deepin-image-viewer-5.9.9-1.3.aarch64.rpm"
RPM_HASH = "8fb6a7425baf88c615ee09fd0b9f797a71f5d8919e9e7d5635c9e469a3816a8cd027c88f102f5675c3dff5f9efc5ecc4c044a489f0798c4b07e8ac8fe9643f40"

RPROVIDES:${PN} += "application() \
application(deepin-image-viewer.desktop) \
deepin-image-viewer \
deepin-image-viewer(aarch-64) \
libxraw.so.1()(64bit) \
metainfo() \
metainfo(deepin-image-viewer.appdata.xml) \
mimehandler(image/arw) \
mimehandler(image/bmp) \
mimehandler(image/bmp24) \
mimehandler(image/dds) \
mimehandler(image/dng) \
mimehandler(image/fax-g3) \
mimehandler(image/gif) \
mimehandler(image/icb) \
mimehandler(image/j2k) \
mimehandler(image/jng) \
mimehandler(image/jp2) \
mimehandler(image/jpe) \
mimehandler(image/jpeg) \
mimehandler(image/jpeg24) \
mimehandler(image/jpg) \
mimehandler(image/mef) \
mimehandler(image/pcd) \
mimehandler(image/pct) \
mimehandler(image/pcx) \
mimehandler(image/png) \
mimehandler(image/ptif) \
mimehandler(image/sgi) \
mimehandler(image/svg) \
mimehandler(image/svg+xml) \
mimehandler(image/tif) \
mimehandler(image/tiff) \
mimehandler(image/tiff24) \
mimehandler(image/vda) \
mimehandler(image/vnd.adobe.photoshop) \
mimehandler(image/vnd.microsoft.icon) \
mimehandler(image/vnd.wap.wbmp) \
mimehandler(image/vnd.zbrush.pcx) \
mimehandler(image/vst) \
mimehandler(image/wdp) \
mimehandler(image/webp) \
mimehandler(image/wmf) \
mimehandler(image/x-canon-crw) \
mimehandler(image/x-dds) \
mimehandler(image/x-fuji-raf) \
mimehandler(image/x-hdr) \
mimehandler(image/x-icns) \
mimehandler(image/x-ilbm) \
mimehandler(image/x-jp2-codestream) \
mimehandler(image/x-minolta-mrw) \
mimehandler(image/x-olympus-orf) \
mimehandler(image/x-panasonic-rw) \
mimehandler(image/x-photo-cd) \
mimehandler(image/x-portable-anymap) \
mimehandler(image/x-portable-bitmap) \
mimehandler(image/x-portable-graymap) \
mimehandler(image/x-sgi) \
mimehandler(image/x-sigma-x3) \
mimehandler(image/x-tga) \
mimehandler(image/x-xbitmap) \
mimehandler(image/x-xpixmap) \
mimehandler(image/xbm) \
mimehandler(video/x-mng)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdtkcore.so.5()(64bit) \
libdtkgui.so.5()(64bit) \
libdtkwidget.so.5()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libimageviewer.so.0.1()(64bit) \
libraw.so.23()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
