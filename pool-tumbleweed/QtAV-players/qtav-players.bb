SUMMARY = "QtAV/QML players"
DESCRIPTION = "QtAV is a multimedia playback library based on Qt and FFmpeg. \
 \
This package contains the QtAV based players."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-only"

PV = "1.13.0"

RPM_NAME = "QtAV-players-1.13.0-3.25.aarch64.rpm"
RPM_HASH = "34b95a6a6d6a75e5c244ab6149c179782ddc9870f8f4afe2fa2d434aee88b1922ce6b279a090e85c560ebdeccf9e31610f0019d77d38e6a1416376e9735150e2"

RPROVIDES:${PN} += "QtAV-players \
QtAV-players(aarch-64) \
application() \
application(Player.desktop) \
application(QMLPlayer.desktop) \
mimehandler(application/ogg) \
mimehandler(application/sdp) \
mimehandler(application/smil) \
mimehandler(application/streamingmedia) \
mimehandler(application/vnd.rn-realmedia) \
mimehandler(application/vnd.rn-realmedia-vbr) \
mimehandler(application/x-ogg) \
mimehandler(application/x-smil) \
mimehandler(application/x-streamingmedia) \
mimehandler(audio/AMR) \
mimehandler(audio/aac) \
mimehandler(audio/ac3) \
mimehandler(audio/flac) \
mimehandler(audio/m4a) \
mimehandler(audio/mp1) \
mimehandler(audio/mp2) \
mimehandler(audio/mp3) \
mimehandler(audio/mpeg) \
mimehandler(audio/mpegurl) \
mimehandler(audio/mpg) \
mimehandler(audio/rn-mpeg) \
mimehandler(audio/scpls) \
mimehandler(audio/vnd.rn-realaudio) \
mimehandler(audio/wav) \
mimehandler(audio/x-aac) \
mimehandler(audio/x-ape) \
mimehandler(audio/x-flac) \
mimehandler(audio/x-m4a) \
mimehandler(audio/x-mp1) \
mimehandler(audio/x-mp2) \
mimehandler(audio/x-mp3) \
mimehandler(audio/x-mpeg) \
mimehandler(audio/x-mpegurl) \
mimehandler(audio/x-mpg) \
mimehandler(audio/x-ms-wma) \
mimehandler(audio/x-pls) \
mimehandler(audio/x-pn-realaudio) \
mimehandler(audio/x-pn-windows-pcm) \
mimehandler(audio/x-realaudio) \
mimehandler(audio/x-scpls) \
mimehandler(audio/x-shorten) \
mimehandler(audio/x-tta) \
mimehandler(audio/x-vorbis+ogg) \
mimehandler(audio/x-wav) \
mimehandler(audio/x-wavpack) \
mimehandler(video/mp2t) \
mimehandler(video/mp4) \
mimehandler(video/mpeg) \
mimehandler(video/msvideo) \
mimehandler(video/quicktime) \
mimehandler(video/vnd.rn-realvideo) \
mimehandler(video/webm) \
mimehandler(video/x-avi) \
mimehandler(video/x-fli) \
mimehandler(video/x-flv) \
mimehandler(video/x-matroska) \
mimehandler(video/x-mpeg) \
mimehandler(video/x-mpeg2) \
mimehandler(video/x-ms-afs) \
mimehandler(video/x-ms-asf) \
mimehandler(video/x-ms-wmv) \
mimehandler(video/x-ms-wmx) \
mimehandler(video/x-ms-wvxvideo) \
mimehandler(video/x-msvideo) \
mimehandler(video/x-ogm+ogg) \
mimehandler(video/x-theora)"
RDEPENDS:${PN} += "/bin/sh \
QtAV-qml \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Svg5 \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQtAV.so.1()(64bit) \
libQtAVWidgets.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libqt5-qtquickcontrols \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm