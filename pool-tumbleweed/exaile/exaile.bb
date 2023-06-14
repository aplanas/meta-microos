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

RPM_NAME = "exaile-4.1.2-1.1.noarch.rpm"
RPM_HASH = "f55180383df8efe229b17798381672e667b8b6feb96fb2d26593cca7ed62c563563d1c69aa968af8d5a322b1e06dc9f63cd74d29dfb26e06afe07481a0d81b6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-exaile \
exaile"

RDEPENDS:${PN} += "/bin/sh \
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
