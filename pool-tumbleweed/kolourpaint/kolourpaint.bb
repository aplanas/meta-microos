SUMMARY = "Paint Program"
DESCRIPTION = "Paint program by KDE"
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later & GFDL-1.2-or-later & GPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "kolourpaint-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "e2f992d1db8351b80ed7a2c8a44325c6c1a89d5d8691e860e8a6ad80129ef30949754a73c1b314083532b998cfa3d28c892866fce0440940019c8ac1dc786824"

RPROVIDES:${PN} += "application() \
application(org.kde.kolourpaint.desktop) \
kolourpaint \
kolourpaint(aarch-64) \
kolourpaint5 \
libkolourpaint_lgpl.so.5()(64bit) \
metainfo() \
metainfo(org.kde.kolourpaint.appdata.xml) \
mimehandler(application/x-krita) \
mimehandler(application/x-navi-animation) \
mimehandler(image/avif) \
mimehandler(image/bmp) \
mimehandler(image/gif) \
mimehandler(image/heif) \
mimehandler(image/jpeg) \
mimehandler(image/jxl) \
mimehandler(image/openraster) \
mimehandler(image/png) \
mimehandler(image/svg+xml) \
mimehandler(image/svg+xml-compressed) \
mimehandler(image/tiff) \
mimehandler(image/vnd.adobe.photoshop) \
mimehandler(image/vnd.microsoft.icon) \
mimehandler(image/vnd.wap.wbmp) \
mimehandler(image/webp) \
mimehandler(image/x-eps) \
mimehandler(image/x-exr) \
mimehandler(image/x-hdr) \
mimehandler(image/x-icns) \
mimehandler(image/x-mng) \
mimehandler(image/x-pcx) \
mimehandler(image/x-pic) \
mimehandler(image/x-portable-bitmap) \
mimehandler(image/x-portable-graymap) \
mimehandler(image/x-portable-pixmap) \
mimehandler(image/x-rgb) \
mimehandler(image/x-sun-raster) \
mimehandler(image/x-tga) \
mimehandler(image/x-xbitmap) \
mimehandler(image/x-xcf) \
mimehandler(image/x-xpixmap)"
RDEPENDS:${PN} += "/sbin/ldconfig \
kdelibs4support \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5GuiAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5Sane.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
