SUMMARY = "GStreamer based Command Line Music Player"
DESCRIPTION = "The gst123 program is a command line player akin to ogg123 or mpg123, \
but uses gstreamer for decoding, so supports all the codecs gstreamer \
knows."
LICENSE = "LGPL-2.0+"

PV = "0.3.5"

RPM_NAME = "gst123-0.3.5-1.23.aarch64.rpm"
RPM_HASH = "e74be4a8d5526b135dd8bd7128f9f0d117dad59ae50932102c5ad232ba3d582a76676f6dcb421e61a250a3f8298a2820f04a229d82690923336c962a3040bf06"

RPROVIDES:${PN} += "application() \
application(gst123.desktop) \
gst123 \
gst123(aarch-64) \
mimehandler(application/ogg) \
mimehandler(application/x-ogm-audio) \
mimehandler(audio/aac) \
mimehandler(audio/mp4) \
mimehandler(audio/mpeg) \
mimehandler(audio/mpegurl) \
mimehandler(audio/ogg) \
mimehandler(audio/vnd.rn-realaudio) \
mimehandler(audio/vorbis) \
mimehandler(audio/x-flac) \
mimehandler(audio/x-mp3) \
mimehandler(audio/x-mpegurl) \
mimehandler(audio/x-ms-wma) \
mimehandler(audio/x-musepack) \
mimehandler(audio/x-oggflac) \
mimehandler(audio/x-pn-realaudio) \
mimehandler(audio/x-scpls) \
mimehandler(audio/x-speex) \
mimehandler(audio/x-vorbis) \
mimehandler(audio/x-vorbis+ogg) \
mimehandler(audio/x-wav) \
mimehandler(video/x-ms-asf)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
