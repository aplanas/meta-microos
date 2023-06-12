SUMMARY = "Complete frontend for MPV"
DESCRIPTION = "SMPlayer is a front-end for MPV/MPlayer, from basic features like \
playing videos, DVDs, and VCDs to more advanced features like support \
for MPV filters and more. \
 \
SMPlayer remembers the settings of all files you play. Opening a \
movie again will resume at the same point it was left, and with the \
same chosen audio track, subtitles and volume level."
LICENSE = "GPL-2.0-or-later"

PV = "22.7.0"

RPM_NAME = "smplayer-22.7.0-1.5.aarch64.rpm"
RPM_HASH = "98b563faa91876bde3890d265b2dd7f3f578a6b985e24d591ed842655798058cfabae2b29177942ab28af878b6db256d7f5f6172dde7bf5dd43c0c17a8b958ee"

RPROVIDES:${PN} += "application() \
application(smplayer.desktop) \
application(smplayer_enqueue.desktop) \
metainfo() \
metainfo(smplayer.appdata.xml) \
mimehandler(audio/aac) \
mimehandler(audio/ac3) \
mimehandler(audio/flac) \
mimehandler(audio/mp4) \
mimehandler(audio/mpeg) \
mimehandler(audio/mpegurl) \
mimehandler(audio/ogg) \
mimehandler(audio/vnd.rn-realaudio) \
mimehandler(audio/vorbis) \
mimehandler(audio/x-adpcm) \
mimehandler(audio/x-matroska) \
mimehandler(audio/x-mp2) \
mimehandler(audio/x-mp3) \
mimehandler(audio/x-mpegurl) \
mimehandler(audio/x-ms-wma) \
mimehandler(audio/x-pn-realaudio) \
mimehandler(audio/x-scpls) \
mimehandler(audio/x-vorbis) \
mimehandler(audio/x-wav) \
mimehandler(video/avi) \
mimehandler(video/flv) \
mimehandler(video/mp4) \
mimehandler(video/mpeg) \
mimehandler(video/quicktime) \
mimehandler(video/vnd.rn-realvideo) \
mimehandler(video/webm) \
mimehandler(video/x-matroska) \
mimehandler(video/x-ms-asf) \
mimehandler(video/x-ms-wmv) \
mimehandler(video/x-msvideo) \
mimehandler(video/x-ogm) \
mimehandler(video/x-ogm+ogg) \
mimehandler(video/x-theora) \
smplayer \
smplayer(aarch-64)"
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
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libz.so.1()(64bit) \
mpv"

inherit rpm
