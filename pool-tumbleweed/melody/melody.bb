SUMMARY = "A music player for local files and remote streams"
DESCRIPTION = "A music player for listening local music files, online radios and Audio CDs."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.1"

RPM_NAME = "melody-2.2.1-1.18.aarch64.rpm"
RPM_HASH = "8483b15efd37152f05c61d145ebed1def5bf323b1e2551e783c1414253ff9165df63dea4ef910fd4645c01eeefc2251948f88d07b9148582bb1673b598a57c72"

RPROVIDES:${PN} += "application() \
application(com.github.artemanufrij.playmymusic.desktop) \
melody \
melody(aarch-64) \
metainfo() \
metainfo(com.github.artemanufrij.playmymusic.appdata.xml) \
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
mimehandler(x-content/audio-player)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgranite.so.6()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgsttag-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libsoup-2.4.so.1()(64bit) \
libsqlite3.so.0()(64bit) \
libtag_c.so.0()(64bit)"

inherit rpm
