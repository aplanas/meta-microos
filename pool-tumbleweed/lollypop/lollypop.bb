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

RPM_NAME = "lollypop-1.4.37-1.3.noarch.rpm"
RPM_HASH = "b5478565051c2450293f8996ddd3a6fb99cf78537753e57538e65c9dfe724db8cb9cbe79f37df09428c866cc13f15278d5a64f6f2a1c34f9a8cb5003d6d93802"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lollypop"

RDEPENDS:${PN} += "/usr/bin/python3 \
dbus-1-python3 \
gstreamer-plugins-base \
python-abi \
python3-Pillow \
python3-beautifulsoup4 \
python3-cairo \
python3-gobject \
python3-gobject-Gdk \
python3-gst \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Goa \
typelib-Gst \
typelib-GstAudio \
typelib-GstPbutils \
typelib-Gtk \
typelib-Handy \
typelib-Pango \
typelib-Secret \
typelib-Soup \
typelib-TotemPlParser"

inherit rpm
