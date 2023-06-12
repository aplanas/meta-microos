SUMMARY = "GNOME Music Management Application"
DESCRIPTION = "Music Management application with support for ripping audio-CD's, \
playback of Ogg Vorbis and MP3 and burning of CD-ROMs."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.7"

RPM_NAME = "rhythmbox-3.4.7-1.1.aarch64.rpm"
RPM_HASH = "65995107a222179097c149e9a7a8fb7347ac89eec350501af34985eeda14bb1d98221f44932c0f2cd6c4a1843e8c9025ce73a459dd02e56845c32f086a88dc6f"

RPROVIDES:${PN} += "application() \
application(org.gnome.Rhythmbox3.desktop) \
application(org.gnome.Rhythmbox3.device.desktop) \
libandroid.so()(64bit) \
libaudiocd.so()(64bit) \
libaudioscrobbler.so()(64bit) \
libcd-recorder.so()(64bit) \
libdaap.so()(64bit) \
libdbus-media-server.so()(64bit) \
libfmradio.so()(64bit) \
libgeneric-player.so()(64bit) \
libgrilo.so()(64bit) \
libipod.so()(64bit) \
libiradio.so()(64bit) \
libmpris.so()(64bit) \
libmtpdevice.so()(64bit) \
libnotification.so()(64bit) \
libpower-manager.so()(64bit) \
librblirc.so()(64bit) \
librhythmbox-core.so.10()(64bit) \
metainfo() \
metainfo(org.gnome.Rhythmbox3.appdata.xml) \
mimehandler(application/ogg) \
mimehandler(application/x-ogg) \
mimehandler(audio/mp4) \
mimehandler(audio/mpeg) \
mimehandler(audio/vorbis) \
mimehandler(audio/x-flac) \
mimehandler(audio/x-it) \
mimehandler(audio/x-mod) \
mimehandler(audio/x-mp3) \
mimehandler(audio/x-mpeg) \
mimehandler(audio/x-mpegurl) \
mimehandler(audio/x-s3m) \
mimehandler(audio/x-scpls) \
mimehandler(audio/x-stm) \
mimehandler(audio/x-vorbis) \
mimehandler(audio/x-vorbis+ogg) \
mimehandler(audio/x-xm) \
mimehandler(x-content/audio-cdda) \
mimehandler(x-content/audio-player) \
rhythmbox \
rhythmbox(aarch-64) \
typelib(MPID) \
typelib(RB)"
RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
gstreamer-plugins-good \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libatk-1.0.so.0()(64bit) \
libbrasero-media3.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libdmapsharing-4.0.so.3()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libgirepository-1.0.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgpod.so.4()(64bit) \
libgrilo-0.3.so.0()(64bit) \
libgstaudio-1.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstcontroller-1.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgsttag-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgudev-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
liblirc_client.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmtp.so.9()(64bit) \
libnotify.so.4()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpeas-1.0.so.0()(64bit) \
libpeas-gtk-1.0.so.0()(64bit) \
libsecret-1.so.0()(64bit) \
libsoup-3.0.so.0()(64bit) \
libtdb.so.1()(64bit) \
libtdb.so.1(TDB_1.2.1)(64bit) \
libtotem-plparser.so.18()(64bit) \
libtotem-plparser.so.18(LIBTOTEM_PL_PARSER_MINI_1.0)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.3)(64bit) \
libxml2.so.2(LIBXML2_2.6.5)(64bit) \
libxml2.so.2(LIBXML2_2.6.8)(64bit) \
python3-gobject \
python3-gobject-Gdk \
typelib(Atk) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gst) \
typelib(GstAudio) \
typelib(GstBase) \
typelib(GstPbutils) \
typelib(GstVideo) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(Peas) \
typelib(PeasGtk) \
typelib(RB) \
typelib(Secret) \
typelib(Soup) \
typelib(cairo) \
typelib(freetype2) \
typelib(libxml2) \
typelib(xlib)"

inherit rpm