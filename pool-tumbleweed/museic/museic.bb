SUMMARY = "Audio player with remote control"
DESCRIPTION = "MuseIC is a fast and simple music player with remote control from any \
device through internet browser."
LICENSE = "GPL-3.0-only"

PV = "2.1.3"

RPM_NAME = "museic-2.1.3-1.26.aarch64.rpm"
RPM_HASH = "a681e6155b0ef1030133c8c99ce2989a9d17dea0fc2b61c643e6985844b7fc8db648a0e26feadebdf2ed9fc81c03ea9bc54c997a9681b3baff9f54461461e2d4"

RPROVIDES:${PN} += "application() \
application(com.github.bcedu.museic.desktop) \
metainfo() \
metainfo(com.github.bcedu.museic.appdata.xml) \
mimehandler(application/ogg) \
mimehandler(application/x-extension-m4a) \
mimehandler(application/x-extension-mp4) \
mimehandler(application/x-flac) \
mimehandler(application/x-ogg) \
mimehandler(audio/3gpp) \
mimehandler(audio/AMR) \
mimehandler(audio/AMR-WB) \
mimehandler(audio/aac) \
mimehandler(audio/ac3) \
mimehandler(audio/basic) \
mimehandler(audio/flac) \
mimehandler(audio/midi) \
mimehandler(audio/mp2) \
mimehandler(audio/mp4) \
mimehandler(audio/mpeg) \
mimehandler(audio/ogg) \
mimehandler(audio/vnd.rn-realaudio) \
mimehandler(audio/x-aiff) \
mimehandler(audio/x-ape) \
mimehandler(audio/x-flac) \
mimehandler(audio/x-gsm) \
mimehandler(audio/x-it) \
mimehandler(audio/x-m4a) \
mimehandler(audio/x-matroska) \
mimehandler(audio/x-mod) \
mimehandler(audio/x-mp3) \
mimehandler(audio/x-mpeg) \
mimehandler(audio/x-mpegurl) \
mimehandler(audio/x-ms-asf) \
mimehandler(audio/x-ms-asx) \
mimehandler(audio/x-ms-wax) \
mimehandler(audio/x-ms-wma) \
mimehandler(audio/x-musepack) \
mimehandler(audio/x-opus+ogg) \
mimehandler(audio/x-pn-aiff) \
mimehandler(audio/x-pn-au) \
mimehandler(audio/x-pn-realaudio) \
mimehandler(audio/x-pn-realaudio-plugin) \
mimehandler(audio/x-pn-wav) \
mimehandler(audio/x-pn-windows-acm) \
mimehandler(audio/x-real-audio) \
mimehandler(audio/x-realaudio) \
mimehandler(audio/x-sbc) \
mimehandler(audio/x-scpls) \
mimehandler(audio/x-speex) \
mimehandler(audio/x-tta) \
mimehandler(audio/x-vorbis) \
mimehandler(audio/x-vorbis+ogg) \
mimehandler(audio/x-wav) \
mimehandler(audio/x-wavpack) \
mimehandler(audio/x-xm) \
mimehandler(x-content/audio-cdda) \
mimehandler(x-content/audio-player) \
museic \
museic(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgranite.so.6()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
