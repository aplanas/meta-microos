SUMMARY = "A video player for local files"
DESCRIPTION = "A video player for watching local video files."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.2"

RPM_NAME = "cinema-1.1.2-1.24.aarch64.rpm"
RPM_HASH = "8860012d78f27fc136d57425876cac3dcc563a56dd175207a9627b4ef8a27f08af4e9d411dbfea078e856ec592ecfcb01dd403cf8333cbe886dca9ce67622e40"

RPROVIDES:${PN} += "application() \
application(com.github.artemanufrij.playmyvideos.desktop) \
cinema \
cinema(aarch-64) \
metainfo() \
metainfo(com.github.artemanufrij.playmyvideos.appdata.xml) \
mimehandler(application/asx) \
mimehandler(application/musepack) \
mimehandler(application/ogg) \
mimehandler(application/smil) \
mimehandler(application/vnd.rn-realmedia) \
mimehandler(application/x-ape) \
mimehandler(application/x-drm-v2) \
mimehandler(application/x-flac) \
mimehandler(application/x-id3) \
mimehandler(application/x-mplayer2) \
mimehandler(application/x-ms-wmv) \
mimehandler(application/x-musepack) \
mimehandler(application/x-nsv-vp3-mp3) \
mimehandler(application/x-ogg) \
mimehandler(application/x-quicktimeplayer) \
mimehandler(application/x-vorbis+ogg) \
mimehandler(video/3gpp) \
mimehandler(video/fli) \
mimehandler(video/matroska) \
mimehandler(video/mp2t) \
mimehandler(video/mp4) \
mimehandler(video/mpeg) \
mimehandler(video/msvideo) \
mimehandler(video/quicktime) \
mimehandler(video/vnd.mpegurl) \
mimehandler(video/vnd.rn-realvideo) \
mimehandler(video/vnd.vivo) \
mimehandler(video/webm) \
mimehandler(video/x-fli) \
mimehandler(video/x-flv) \
mimehandler(video/x-matroska) \
mimehandler(video/x-mng) \
mimehandler(video/x-mpeg) \
mimehandler(video/x-mpeg2) \
mimehandler(video/x-ms-asf) \
mimehandler(video/x-ms-asf-plugin) \
mimehandler(video/x-ms-wm) \
mimehandler(video/x-ms-wmp) \
mimehandler(video/x-ms-wmv) \
mimehandler(video/x-ms-wvx) \
mimehandler(video/x-msvideo) \
mimehandler(video/x-ogm+ogg) \
mimehandler(video/x-quicktime) \
mimehandler(video/x-webm)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libclutter-1.0.so.0()(64bit) \
libclutter-gst-3.0.so.0()(64bit) \
libclutter-gtk-1.0.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgranite.so.6()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libsoup-2.4.so.1()(64bit) \
libsqlite3.so.0()(64bit)"

inherit rpm
