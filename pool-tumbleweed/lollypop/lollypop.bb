SUMMARY = "GNOME music playing application"
DESCRIPTION = "Lollypop is a GNOME music playing application. It provides the following \
features: \
* Supports mp3/4, ogg and flac \
* Genre/Cover browsing \
* Genre/Artist/Cover browsing \
* Search \
* Main playlist (called queue in other apps) \
* Party mode \
* Replay gain \
* Cover art downloader \
* Context artist view \
* MTP sync \
* Fullscreen view \
* Last.fm support \
* Auto install codecs \
* HiDPI support \
* Tunein support."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.37"

RPM_NAME = "lollypop-1.4.37-1.2.noarch.rpm"
RPM_HASH = "dc046bb9f4efca5a492f2d5d34db0da5be1b1caa710820ad4711bb45c537136f399fa66c6552690800c6a643f8ba7d2f7d584bd7553d4122be9348cce41fe809"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(org.gnome.Lollypop.desktop) \
lollypop \
metainfo() \
metainfo(org.gnome.Lollypop.appdata.xml) \
mimehandler(application/ogg) \
mimehandler(application/vnd.apple.mpegurl) \
mimehandler(application/x-ogg) \
mimehandler(application/x-ogm-audio) \
mimehandler(application/xspf+xml) \
mimehandler(audio/aac) \
mimehandler(audio/ac3) \
mimehandler(audio/flac) \
mimehandler(audio/m4a) \
mimehandler(audio/mp3) \
mimehandler(audio/mp4) \
mimehandler(audio/mpeg) \
mimehandler(audio/mpegurl) \
mimehandler(audio/ogg) \
mimehandler(audio/vnd.rn-realaudio) \
mimehandler(audio/vorbis) \
mimehandler(audio/x-aac) \
mimehandler(audio/x-flac) \
mimehandler(audio/x-m4a) \
mimehandler(audio/x-mp3) \
mimehandler(audio/x-mpeg) \
mimehandler(audio/x-mpegurl) \
mimehandler(audio/x-ms-wma) \
mimehandler(audio/x-musepack) \
mimehandler(audio/x-oggflac) \
mimehandler(audio/x-opus+ogg) \
mimehandler(audio/x-pn-realaudio) \
mimehandler(audio/x-scpls) \
mimehandler(audio/x-speex) \
mimehandler(audio/x-vorbis) \
mimehandler(audio/x-vorbis+ogg) \
mimehandler(audio/x-wav) \
mimehandler(x-content/audio-player)"

RDEPENDS:${PN} += "/usr/bin/python3 \
dbus-1-python3 \
gstreamer-plugins-base \
python(abi) \
python3-Pillow \
python3-beautifulsoup4 \
python3-cairo \
python3-gobject \
python3-gobject-Gdk \
python3-gst \
typelib(GLib) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Goa) \
typelib(Gst) \
typelib(GstAudio) \
typelib(GstPbutils) \
typelib(Gtk) \
typelib(Handy) \
typelib(Pango) \
typelib(Secret) \
typelib(Soup) \
typelib(TotemPlParser)"

inherit rpm
