SUMMARY = "Simple GTK+ frontend for MPV"
DESCRIPTION = "Celluloid is a simple GTK+ frontend for MPV."
LICENSE = "GPL-3.0-or-later"

PV = "0.25"

RPM_NAME = "celluloid-0.25-1.1.aarch64.rpm"
RPM_HASH = "2ea70a5a11c82aff9876b1289b3626fe75e28f693054c24fe94dac67be8c7b3992871ef89182daa43fdb198ec1b71691bea695d8033ceae5e5035ba49df556e9"

RPROVIDES:${PN} += "application() \
application(io.github.celluloid_player.Celluloid.desktop) \
celluloid \
celluloid(aarch-64) \
gnome-mpv \
metainfo() \
metainfo(io.github.celluloid_player.Celluloid.appdata.xml) \
mimehandler(application/mpeg4-iod) \
mimehandler(application/mpeg4-muxcodetable) \
mimehandler(application/mxf) \
mimehandler(application/ogg) \
mimehandler(application/ram) \
mimehandler(application/sdp) \
mimehandler(application/streamingmedia) \
mimehandler(application/vnd.apple.mpegurl) \
mimehandler(application/vnd.ms-asf) \
mimehandler(application/vnd.rn-realmedia) \
mimehandler(application/vnd.rn-realmedia-vbr) \
mimehandler(application/x-extension-m4a) \
mimehandler(application/x-extension-mp4) \
mimehandler(application/x-flac) \
mimehandler(application/x-flash-video) \
mimehandler(application/x-matroska) \
mimehandler(application/x-ogg) \
mimehandler(application/x-streamingmedia) \
mimehandler(audio/3gpp) \
mimehandler(audio/3gpp2) \
mimehandler(audio/aac) \
mimehandler(audio/ac3) \
mimehandler(audio/amr) \
mimehandler(audio/amr-wb) \
mimehandler(audio/basic) \
mimehandler(audio/dv) \
mimehandler(audio/eac3) \
mimehandler(audio/flac) \
mimehandler(audio/m4a) \
mimehandler(audio/midi) \
mimehandler(audio/mp1) \
mimehandler(audio/mp2) \
mimehandler(audio/mp3) \
mimehandler(audio/mp4) \
mimehandler(audio/mpeg) \
mimehandler(audio/mpegurl) \
mimehandler(audio/mpg) \
mimehandler(audio/ogg) \
mimehandler(audio/opus) \
mimehandler(audio/scpls) \
mimehandler(audio/vnd.dolby.heaac.1) \
mimehandler(audio/vnd.dolby.heaac.2) \
mimehandler(audio/vnd.dolby.mlp) \
mimehandler(audio/vnd.dts) \
mimehandler(audio/vnd.dts.hd) \
mimehandler(audio/vnd.rn-realaudio) \
mimehandler(audio/wav) \
mimehandler(audio/webm) \
mimehandler(audio/x-aac) \
mimehandler(audio/x-aiff) \
mimehandler(audio/x-ape) \
mimehandler(audio/x-flac) \
mimehandler(audio/x-gsm) \
mimehandler(audio/x-it) \
mimehandler(audio/x-m4a) \
mimehandler(audio/x-matroska) \
mimehandler(audio/x-mod) \
mimehandler(audio/x-mp1) \
mimehandler(audio/x-mp2) \
mimehandler(audio/x-mp3) \
mimehandler(audio/x-mpeg) \
mimehandler(audio/x-mpegurl) \
mimehandler(audio/x-mpg) \
mimehandler(audio/x-ms-asf) \
mimehandler(audio/x-ms-wma) \
mimehandler(audio/x-musepack) \
mimehandler(audio/x-pn-aiff) \
mimehandler(audio/x-pn-au) \
mimehandler(audio/x-pn-realaudio) \
mimehandler(audio/x-pn-wav) \
mimehandler(audio/x-real-audio) \
mimehandler(audio/x-realaudio) \
mimehandler(audio/x-s3m) \
mimehandler(audio/x-scpls) \
mimehandler(audio/x-shorten) \
mimehandler(audio/x-speex) \
mimehandler(audio/x-tta) \
mimehandler(audio/x-vorbis) \
mimehandler(audio/x-vorbis+ogg) \
mimehandler(audio/x-wav) \
mimehandler(audio/x-wavpack) \
mimehandler(audio/x-xm) \
mimehandler(video/3gp) \
mimehandler(video/3gpp) \
mimehandler(video/3gpp2) \
mimehandler(video/divx) \
mimehandler(video/dv) \
mimehandler(video/fli) \
mimehandler(video/flv) \
mimehandler(video/mp2t) \
mimehandler(video/mp4) \
mimehandler(video/mp4v-es) \
mimehandler(video/mpeg) \
mimehandler(video/mpeg-system) \
mimehandler(video/msvideo) \
mimehandler(video/ogg) \
mimehandler(video/quicktime) \
mimehandler(video/vnd.mpegurl) \
mimehandler(video/vnd.rn-realvideo) \
mimehandler(video/webm) \
mimehandler(video/x-avi) \
mimehandler(video/x-flc) \
mimehandler(video/x-fli) \
mimehandler(video/x-flv) \
mimehandler(video/x-m4v) \
mimehandler(video/x-matroska) \
mimehandler(video/x-mpeg) \
mimehandler(video/x-mpeg-system) \
mimehandler(video/x-mpeg2) \
mimehandler(video/x-ms-asf) \
mimehandler(video/x-ms-wm) \
mimehandler(video/x-ms-wmv) \
mimehandler(video/x-ms-wmx) \
mimehandler(video/x-msvideo) \
mimehandler(video/x-nsv) \
mimehandler(video/x-ogm+ogg) \
mimehandler(video/x-theora) \
mimehandler(video/x-theora+ogg) \
mimehandler(x-content/audio-cdda) \
mimehandler(x-content/audio-player) \
mimehandler(x-content/video-dvd) \
mimehandler(x-scheme-handler/mms) \
mimehandler(x-scheme-handler/mmsh) \
mimehandler(x-scheme-handler/rtmp) \
mimehandler(x-scheme-handler/rtp) \
mimehandler(x-scheme-handler/rtsp)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libadwaita-1.so.0()(64bit) \
libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) \
libc.so.6()(64bit) \
libepoxy.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libm.so.6()(64bit) \
libmpv.so.2()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
