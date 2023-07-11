SUMMARY = "GTK Amarok-like music player"
DESCRIPTION = "Exaile is a media player aiming to be similar to Clementine, but \
written in GTK+. \
 \
It incorporates many of the cool things from Amarok (and other \
media players) like automatic fetching of album art, handling of \
large libraries, lyrics fetching, artist/album information via the \
wikipedia, last.fm support, optional iPod support (assuming you \
have python-gpod installed). \
 \
In addition, Exaile also includes a built in shoutcast directory \
browser, tabbed playlists (so you can have more than one playlist \
open at a time), blacklisting of tracks (so they don't get scanned \
into your library), downloading of guitar tablature from \
fretplay.com, and submitting played tracks on your iPod to last.fm."
LICENSE = "GPL-3.0-or-later"

PV = "4.1.2"

RPM_NAME = "exaile-4.1.2-1.2.noarch.rpm"
RPM_HASH = "d1fd31dede3c4ece909be252c32ce4a5e5187e98ddcef611f4a0c8d97e6baa47f8d7ffe785eed343d2d992f1ceae6c7386c76e859e34ea73efbde7d78b5b4634"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-exaile \
exaile"

RDEPENDS:${PN} += "/usr/bin/sh \
gdk-pixbuf-loader-rsvg \
gstreamer \
gstreamer-plugins-good \
python3-bsddb3 \
python3-cairo \
python3-dbus-python \
python3-feedparser \
python3-gobject \
python3-gobject-Gdk \
python3-gobject-cairo \
python3-mutagen \
typelib-Atk \
typelib-GIRepository \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gst \
typelib-GstPbutils \
typelib-Gtk \
typelib-Keybinder \
typelib-Notify \
typelib-Pango \
typelib-PangoCairo \
typelib-WebKit2"

inherit rpm
