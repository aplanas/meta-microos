SUMMARY = "Kirigami based gallery application"
DESCRIPTION = "Koko is a simple image gallery application that is designed to view, edit and \
share images."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "koko-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "e9fe320e5c60478827fd3cfa82293a7ddb0ba9b9527970f7581bdfeefb3bb843282789559f556363aa7e656701bb4b1fb6a306bb48448ffaa8bd9839d51081d2"

RPROVIDES:${PN} += "application() \
application(org.kde.koko.desktop) \
koko \
koko(aarch-64) \
libkokocommon.so.0.0.1()(64bit) \
libkokoqmlplugin.so()(64bit) \
metainfo() \
metainfo(org.kde.koko.appdata.xml) \
mimehandler(image/bmp) \
mimehandler(image/gif) \
mimehandler(image/jpeg) \
mimehandler(image/png) \
mimehandler(image/svg+xml) \
mimehandler(image/tiff) \
mimehandler(image/webp) \
mimehandler(image/x-eps) \
mimehandler(image/x-ico) \
mimehandler(image/x-portable-bitmap) \
mimehandler(image/x-portable-graymap) \
mimehandler(image/x-portable-pixmap) \
mimehandler(image/x-psd) \
mimehandler(image/x-webp) \
mimehandler(image/x-xbitmap) \
mimehandler(image/x-xpixmap) \
mimehandler(video/3gpp) \
mimehandler(video/flv) \
mimehandler(video/mp4) \
mimehandler(video/mpeg) \
mimehandler(video/mpegts) \
mimehandler(video/ogg) \
mimehandler(video/quicktime) \
mimehandler(video/webm) \
mimehandler(video/x-3ivx) \
mimehandler(video/x-av1) \
mimehandler(video/x-cinepak) \
mimehandler(video/x-dirac) \
mimehandler(video/x-divx) \
mimehandler(video/x-dv) \
mimehandler(video/x-ffv) \
mimehandler(video/x-flash-video) \
mimehandler(video/x-fli) \
mimehandler(video/x-flv) \
mimehandler(video/x-h263) \
mimehandler(video/x-h264) \
mimehandler(video/x-huffyuv) \
mimehandler(video/x-indeo) \
mimehandler(video/x-jpeg) \
mimehandler(video/x-m4v) \
mimehandler(video/x-matroska) \
mimehandler(video/x-mkv) \
mimehandler(video/x-ms-asf) \
mimehandler(video/x-msmpeg) \
mimehandler(video/x-msvideo) \
mimehandler(video/x-msvideocodec) \
mimehandler(video/x-pn-realvideo) \
mimehandler(video/x-png) \
mimehandler(video/x-svq) \
mimehandler(video/x-tarkin) \
mimehandler(video/x-theora) \
mimehandler(video/x-vp10) \
mimehandler(video/x-vp3) \
mimehandler(video/x-vp8) \
mimehandler(video/x-vp9) \
mimehandler(video/x-wmv) \
mimehandler(video/x-xvid) \
qt5qmlimport(org.kde.koko.0)"

RDEPENDS:${PN} += "/sbin/ldconfig \
kirigami2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5FileMetaData.so.3()(64bit) \
libKF5GuiAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Positioning.so.5()(64bit) \
libQt5Positioning.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libexiv2.so.27()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
