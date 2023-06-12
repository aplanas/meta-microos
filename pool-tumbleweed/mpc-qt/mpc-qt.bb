SUMMARY = "Media Player Classic Qute Theater"
DESCRIPTION = "A clone of Media Player Classic reimplemented in Qt."
LICENSE = "GPL-2.0-only"

PV = "23.02"

RPM_NAME = "mpc-qt-23.02-1.3.aarch64.rpm"
RPM_HASH = "d645913fa2883fefb59b48136e47839a56db88a6810ab839b3b2d677b7002705dabf6926aa81b1e8c2fe0b01179880e7a9ade52ced9da3b27e1339119131b14f"

RPROVIDES:${PN} += "Classic \
Player \
Qute \
Theater.desktop) \
application() \
application(Media \
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
mimehandler(audio/mp4) \
mimehandler(audio/mpeg) \
mimehandler(audio/mpegurl) \
mimehandler(audio/mpg) \
mimehandler(audio/ogg) \
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
mimehandler(inode/directory) \
mimehandler(video/mp2t) \
mimehandler(video/mp4) \
mimehandler(video/mpeg) \
mimehandler(video/msvideo) \
mimehandler(video/ogg) \
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
mimehandler(video/x-theora) \
mpc-qt \
mpc-qt(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmpv.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
