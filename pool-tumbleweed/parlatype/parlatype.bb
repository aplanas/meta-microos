SUMMARY = "GNOME audio player for transcriptions"
DESCRIPTION = "Parlatype is a minimal audio player for manual speech transcription, written for the GNOME desktop environment. It plays audio sources to transcribe them in your favourite text application."
LICENSE = "GPL-3.0-or-later"

PV = "3.1"

RPM_NAME = "parlatype-3.1-1.7.aarch64.rpm"
RPM_HASH = "5c3cc5888d3f1081125f056539947da559728ad1ee8acfc257157e51a385cd94ed4b5790ac048b2e7b9dd28c87f7de2c1d350618efbd46e48b20c271829b6b47"

RPROVIDES:${PN} += "application() \
application(org.parlatype.Parlatype.desktop) \
metainfo() \
metainfo(org.parlatype.Parlatype.appdata.xml) \
mimehandler(application/ogg) \
mimehandler(application/x-ogg) \
mimehandler(audio/mp4) \
mimehandler(audio/mpeg) \
mimehandler(audio/x-flac) \
mimehandler(audio/x-mp3) \
mimehandler(audio/x-mpeg) \
mimehandler(audio/x-mpegurl) \
mimehandler(audio/x-scpls) \
mimehandler(audio/x-vorbis+ogg) \
mimehandler(x-scheme-handler/itms) \
mimehandler(x-scheme-handler/itmss) \
parlatype \
parlatype(aarch-64)"

RDEPENDS:${PN} += "gstreamer-plugins-bad \
gstreamer-plugins-good \
gstreamer-plugins-ugly \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libparlatype.so.5()(64bit) \
libparlatype5"

inherit rpm
