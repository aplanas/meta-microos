SUMMARY = "Movie Player for the GNOME Desktop"
DESCRIPTION = "Totem is a movie player for the GNOME desktop based on GStreamer. It \
features a playlist, a full-screen mode, seek and volume controls, and \
complete keyboard navigation."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "43.0"

RPM_NAME = "totem-43.0-2.3.aarch64.rpm"
RPM_HASH = "4d6a12fe767c4227d0309ebf794bc220418681bd3b73026943b54bbe3e29e5e825f60c68f9e5b3d7721e63ac4c7f771b50c9bdeefd5d22db84ca72bbf6143b3c"

RPROVIDES:${PN} += "application() \
application(org.gnome.Totem.desktop) \
libtotem.so.0()(64bit) \
metainfo() \
metainfo(org.gnome.Totem.appdata.xml) \
mimehandler(application/mxf) \
mimehandler(application/ram) \
mimehandler(application/sdp) \
mimehandler(application/smil) \
mimehandler(application/smil+xml) \
mimehandler(application/vnd.apple.mpegurl) \
mimehandler(application/vnd.ms-asf) \
mimehandler(application/vnd.ms-wpl) \
mimehandler(application/vnd.rn-realmedia) \
mimehandler(application/vnd.rn-realmedia-vbr) \
mimehandler(application/x-extension-m4a) \
mimehandler(application/x-extension-mp4) \
mimehandler(application/x-flash-video) \
mimehandler(application/x-matroska) \
mimehandler(application/x-netshow-channel) \
mimehandler(application/x-quicktime-media-link) \
mimehandler(application/x-quicktimeplayer) \
mimehandler(application/x-shorten) \
mimehandler(application/x-smil) \
mimehandler(audio/x-pn-realaudio) \
mimehandler(image/vnd.rn-realpix) \
mimehandler(image/x-pict) \
mimehandler(misc/ultravox) \
mimehandler(text/google-video-pointer) \
mimehandler(text/x-google-video-pointer) \
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
mimehandler(video/x-mjpeg) \
mimehandler(video/x-mpeg) \
mimehandler(video/x-mpeg2) \
mimehandler(video/x-ms-asf) \
mimehandler(video/x-ms-asf-plugin) \
mimehandler(video/x-ms-asx) \
mimehandler(video/x-ms-wm) \
mimehandler(video/x-ms-wmv) \
mimehandler(video/x-ms-wmx) \
mimehandler(video/x-ms-wvx) \
mimehandler(video/x-msvideo) \
mimehandler(video/x-nsv) \
mimehandler(video/x-ogm+ogg) \
mimehandler(video/x-theora) \
mimehandler(video/x-theora+ogg) \
mimehandler(video/x-totem-stream) \
mimehandler(x-content/video-dvd) \
mimehandler(x-scheme-handler/icy) \
mimehandler(x-scheme-handler/icyx) \
mimehandler(x-scheme-handler/mms) \
mimehandler(x-scheme-handler/mmsh) \
mimehandler(x-scheme-handler/net) \
mimehandler(x-scheme-handler/pnm) \
mimehandler(x-scheme-handler/rtmp) \
mimehandler(x-scheme-handler/rtp) \
mimehandler(x-scheme-handler/rtsp) \
mimehandler(x-scheme-handler/uvox) \
totem \
totem(aarch-64) \
typelib(Totem)"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
gstreamer-plugins-good \
gstreamer-plugins-good-gtk \
iso-codes \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libgirepository-1.0.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgnome-desktop-3.so.20()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgrilo-0.3.so.0()(64bit) \
libgrlpls-0.3.so.0()(64bit) \
libgstaudio-1.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgsttag-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libhandy-1.so.0()(64bit) \
libhandy-1.so.0(LIBHANDY_1_0)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpeas-1.0.so.0()(64bit) \
libpeas-gtk-1.0.so.0()(64bit) \
libtotem-plparser.so.18()(64bit) \
libtotem-plparser.so.18(LIBTOTEM_PL_PARSER_MINI_1.0)(64bit) \
typelib(Atk) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(TotemPlParser) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib)"

inherit rpm
