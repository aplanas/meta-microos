SUMMARY = "Practical and minimal image viewer"
DESCRIPTION = "qView is a Qt image viewer designed with minimalism and usability in mind. \
No cluttered interface, just your image and a titlebar."
LICENSE = "GPL-3.0-only"

PV = "5.0"

RPM_NAME = "qview-5.0-1.7.aarch64.rpm"
RPM_HASH = "3e7f2eeee7bec6ae359c01cd7b28799a910ea920026bef6af7543fc1c9c628da38fe88f999f0d8b5366e4ae0abc7beb99465c4bcb8755ddc90e8a509648dec63"

RPROVIDES:${PN} += "application() \
application(com.interversehq.qView.desktop) \
metainfo() \
metainfo(com.interversehq.qView.appdata.xml) \
mimehandler(application/photoshop) \
mimehandler(application/psd) \
mimehandler(application/x-krita) \
mimehandler(application/x-navi-animation) \
mimehandler(application/x-photoshop) \
mimehandler(image/aces) \
mimehandler(image/apng) \
mimehandler(image/avif) \
mimehandler(image/avif-sequence) \
mimehandler(image/bmp) \
mimehandler(image/gif) \
mimehandler(image/heic) \
mimehandler(image/heif) \
mimehandler(image/icns) \
mimehandler(image/jpeg) \
mimehandler(image/jpg) \
mimehandler(image/jxl) \
mimehandler(image/openraster) \
mimehandler(image/png) \
mimehandler(image/psd) \
mimehandler(image/sgi) \
mimehandler(image/svg+xml) \
mimehandler(image/tiff) \
mimehandler(image/vnd.adobe.photoshop) \
mimehandler(image/vnd.radiance) \
mimehandler(image/vnd.wap.wbmp) \
mimehandler(image/vnd.zbrush.pcx) \
mimehandler(image/webp) \
mimehandler(image/x-exr) \
mimehandler(image/x-icon) \
mimehandler(image/x-pcx) \
mimehandler(image/x-pic) \
mimehandler(image/x-portable-bitmap) \
mimehandler(image/x-portable-graymap) \
mimehandler(image/x-portable-pixmap) \
mimehandler(image/x-rgb) \
mimehandler(image/x-sgi-bw) \
mimehandler(image/x-sgi-rgba) \
mimehandler(image/x-sun-raster) \
mimehandler(image/x-tga) \
mimehandler(image/x-win-bitmap) \
mimehandler(image/x-xbitmap) \
mimehandler(image/x-xcf) \
mimehandler(image/x-xpixmap) \
qview \
qview(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
