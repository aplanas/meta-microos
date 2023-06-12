SUMMARY = "Deepin Video Players"
DESCRIPTION = "The default media player for Deepin. QML is used to build its \
graphical interface, combined with QtAV as its multimedia backend."
LICENSE = "GPL-3.0-or-later & OpenSSL"

PV = "5.10.8"

RPM_NAME = "deepin-movie-5.10.8-1.5.aarch64.rpm"
RPM_HASH = "5d99718439e5733787a505587bae4c5825c9c6bbd3f1d9543ab8db0f2a4afe3b2c9167394b5dfe689b4cd7c10e4ff001d2376381ab92e1e74dcecb19c33e4f3e"

RPROVIDES:${PN} += "application() \
application(deepin-movie.desktop) \
deepin-movie \
deepin-movie(aarch-64) \
mimehandler(application/mxf) \
mimehandler(application/ogg) \
mimehandler(application/vnd.apple.mpegurl) \
mimehandler(application/vnd.rn-realmedia) \
mimehandler(application/x-extension-mp4) \
mimehandler(application/x-flac) \
mimehandler(application/x-matroska) \
mimehandler(application/x-ogg) \
mimehandler(application/xspf+xml) \
mimehandler(image/vnd.rn-realpix) \
mimehandler(misc/ultravox) \
mimehandler(text/vnd.qt.linguist) \
mimehandler(video/3gpp) \
mimehandler(video/dv) \
mimehandler(video/mp2t) \
mimehandler(video/mp4) \
mimehandler(video/mp4v-es) \
mimehandler(video/mpeg) \
mimehandler(video/msvideo) \
mimehandler(video/ogg) \
mimehandler(video/quicktime) \
mimehandler(video/vnd.rn-realvideo) \
mimehandler(video/webm) \
mimehandler(video/x-anim) \
mimehandler(video/x-avi) \
mimehandler(video/x-flc) \
mimehandler(video/x-fli) \
mimehandler(video/x-flv) \
mimehandler(video/x-m4v) \
mimehandler(video/x-matroska) \
mimehandler(video/x-mpeg) \
mimehandler(video/x-mpeg2) \
mimehandler(video/x-ms-afs) \
mimehandler(video/x-ms-asf) \
mimehandler(video/x-ms-wmv) \
mimehandler(video/x-ms-wmx) \
mimehandler(video/x-ms-wvxvideo) \
mimehandler(video/x-msvideo) \
mimehandler(video/x-nsv) \
mimehandler(video/x-ogm+ogg) \
mimehandler(video/x-theora) \
mimehandler(video/x-theora+ogg) \
mimehandler(x-content/video-dvd) \
mimehandler(x-content/video-svcd) \
mimehandler(x-content/video-vcd) \
mimehandler(x-scheme-handler/mms) \
mimehandler(x-scheme-handler/rtmp) \
mimehandler(x-scheme-handler/rtsp)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libXtst.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdtkcore.so.5()(64bit) \
libdtkgui.so.5()(64bit) \
libdtkwidget.so.5()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgsettings-qt.so.1()(64bit) \
libmpris-qt5.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libxcb-shape.so.0()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
