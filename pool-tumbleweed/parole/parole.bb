SUMMARY = "Media Player for the Xfce Desktop Environment"
DESCRIPTION = "Parole is a media player based on the GStreamer framework and written \
to fit in the Xfce desktop. Parole features playback of local media \
files, DVD/CD and live streams. Parole is extensible via plugins; for \
a how-to document for writing a Parole plugin, see the Plugins API \
documentation and the plugins directory which contains some examples."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "parole-4.18.0-1.3.aarch64.rpm"
RPM_HASH = "af8c566dd33b04c20f2bcaa66133b1de0578df6a9cacc39a9c56cb3acb111d522c2dbc55bd9021953efaacccc37df2638a7f8cc7fe2a626ff70fe6b596db99d6"

RPROVIDES:${PN} += "application() \
application(org.xfce.Parole.desktop) \
metainfo() \
metainfo(parole.appdata.xml) \
mimehandler(application/mxf) \
mimehandler(application/ogg) \
mimehandler(application/ram) \
mimehandler(application/sdp) \
mimehandler(application/smil) \
mimehandler(application/smil+xml) \
mimehandler(application/vnd.apple.mpegurl) \
mimehandler(application/vnd.ms-wpl) \
mimehandler(application/vnd.rn-realmedia) \
mimehandler(application/x-extension-m4a) \
mimehandler(application/x-extension-mp4) \
mimehandler(application/x-flac) \
mimehandler(application/x-flash-video) \
mimehandler(application/x-matroska) \
mimehandler(application/x-netshow-channel) \
mimehandler(application/x-ogg) \
mimehandler(application/x-quicktime-media-link) \
mimehandler(application/x-quicktimeplayer) \
mimehandler(application/x-shorten) \
mimehandler(application/x-smil) \
mimehandler(application/xspf+xml) \
mimehandler(audio/3gpp) \
mimehandler(audio/AMR) \
mimehandler(audio/AMR-WB) \
mimehandler(audio/ac3) \
mimehandler(audio/basic) \
mimehandler(audio/flac) \
mimehandler(audio/midi) \
mimehandler(audio/mp2) \
mimehandler(audio/mp4) \
mimehandler(audio/mpeg) \
mimehandler(audio/mpegurl) \
mimehandler(audio/ogg) \
mimehandler(audio/prs.sid) \
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
mimehandler(audio/x-pn-aiff) \
mimehandler(audio/x-pn-au) \
mimehandler(audio/x-pn-realaudio) \
mimehandler(audio/x-pn-realaudio-plugin) \
mimehandler(audio/x-pn-wav) \
mimehandler(audio/x-pn-windows-acm) \
mimehandler(audio/x-real-audio) \
mimehandler(audio/x-realaudio) \
mimehandler(audio/x-s3m) \
mimehandler(audio/x-sbc) \
mimehandler(audio/x-scpls) \
mimehandler(audio/x-speex) \
mimehandler(audio/x-stm) \
mimehandler(audio/x-tta) \
mimehandler(audio/x-vorbis) \
mimehandler(audio/x-vorbis+ogg) \
mimehandler(audio/x-wav) \
mimehandler(audio/x-wavpack) \
mimehandler(audio/x-xm) \
mimehandler(image/vnd.rn-realpix) \
mimehandler(image/x-pict) \
mimehandler(misc/ultravox) \
mimehandler(text/google-video-pointer) \
mimehandler(text/x-google-video-pointer) \
mimehandler(video/3gp) \
mimehandler(video/3gpp) \
mimehandler(video/divx) \
mimehandler(video/dv) \
mimehandler(video/fli) \
mimehandler(video/flv) \
mimehandler(video/mp2t) \
mimehandler(video/mp4) \
mimehandler(video/mp4v-es) \
mimehandler(video/mpeg) \
mimehandler(video/msvideo) \
mimehandler(video/ogg) \
mimehandler(video/quicktime) \
mimehandler(video/vivo) \
mimehandler(video/vnd.divx) \
mimehandler(video/vnd.mpegurl) \
mimehandler(video/vnd.rn-realvideo) \
mimehandler(video/vnd.vivo) \
mimehandler(video/webm) \
mimehandler(video/x-anim) \
mimehandler(video/x-avi) \
mimehandler(video/x-flc) \
mimehandler(video/x-fli) \
mimehandler(video/x-flic) \
mimehandler(video/x-flv) \
mimehandler(video/x-m4v) \
mimehandler(video/x-matroska) \
mimehandler(video/x-mpeg) \
mimehandler(video/x-mpeg2) \
mimehandler(video/x-ms-asf) \
mimehandler(video/x-ms-asx) \
mimehandler(video/x-ms-wm) \
mimehandler(video/x-ms-wmv) \
mimehandler(video/x-ms-wmx) \
mimehandler(video/x-ms-wvx) \
mimehandler(video/x-msvideo) \
mimehandler(video/x-nsv) \
mimehandler(video/x-ogm+ogg) \
mimehandler(video/x-theora+ogg) \
mimehandler(video/x-totem-stream) \
mimehandler(x-content/video-dvd) \
mimehandler(x-content/video-svcd) \
mimehandler(x-content/video-vcd) \
mimehandler(x-scheme-handler/icy) \
mimehandler(x-scheme-handler/icyx) \
mimehandler(x-scheme-handler/mms) \
mimehandler(x-scheme-handler/mmsh) \
mimehandler(x-scheme-handler/net) \
mimehandler(x-scheme-handler/pnm) \
mimehandler(x-scheme-handler/rtp) \
mimehandler(x-scheme-handler/rtsp) \
mimehandler(x-scheme-handler/uvox) \
parole \
parole(aarch-64)"

RDEPENDS:${PN} += "gstreamer-plugins-base \
gstreamer-plugins-good \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libdbus-glib-1.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstaudio-1.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgsttag-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libnotify.so.4()(64bit) \
libtag_c.so.0()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
libxfconf-0.so.3()(64bit)"

inherit rpm
