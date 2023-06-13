SUMMARY = "Lightweight Music Player"
DESCRIPTION = "A Lightweight Music Player for GNU/Linux, based on Gtk, sqlite, and \
completely written in C, constructed to be fast, light, and \
simultaneously complete without obstructing the daily work. \
 \
Pragha was originally derived of Consonance Music Manager \
(http://sites.google.com/site/consonancemanager/), discontinued by the \
original author. \
 \
Some of the features are: \
* Library management using sqlite3. \
* Versatile Amarok-style play queue. \
* Multiple views. \
* OSD support with Libnotify. \
* Id3 tag editing. \
* mp3, ogg, flac, modplug, wav, asf, wma, mp4, m4a, MonkeyAudio and \
  Audio CD support. \
* Last.fm scrobbling, get cover art, get artist information, append \
  similar songs, love, unlove, etc. \
* Playlist management (M3U Exporting). \
* DBUS management interface. \
* MPRIS2 Support. \
* Search/Filterin the current playlist. \
* Search lyrics."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.99.1"

RPM_NAME = "pragha-1.3.99.1-3.3.aarch64.rpm"
RPM_HASH = "de87d8fc2b740080edaf2730cd7148316d3fe8aaea9db33ef4a706d565edf7dcc99af9227d80dd0117eea08bcaf1255be6b25af6bbbc91eb580a54834a9d2273"

RPROVIDES:${PN} += "application() \
application(pragha.desktop) \
libpragha.so()(64bit) \
metainfo() \
metainfo(io.github.pragha_music_player.metainfo.xml) \
mimehandler(application/ogg) \
mimehandler(application/x-ape) \
mimehandler(application/x-flac) \
mimehandler(application/x-ogg) \
mimehandler(application/xspf+xml) \
mimehandler(audio/ape) \
mimehandler(audio/flac) \
mimehandler(audio/mp3) \
mimehandler(audio/mpeg) \
mimehandler(audio/mpeg3) \
mimehandler(audio/mpegurl) \
mimehandler(audio/ogg) \
mimehandler(audio/vorbis) \
mimehandler(audio/x-ape) \
mimehandler(audio/x-flac) \
mimehandler(audio/x-m4a) \
mimehandler(audio/x-mp3) \
mimehandler(audio/x-mpeg) \
mimehandler(audio/x-mpegurl) \
mimehandler(audio/x-ms-wax) \
mimehandler(audio/x-ms-wma) \
mimehandler(audio/x-ogg) \
mimehandler(audio/x-scpls) \
mimehandler(audio/x-vorbis) \
mimehandler(audio/x-wav) \
mimehandler(video/x-ms-asf) \
pragha \
pragha(aarch-64)"

RDEPENDS:${PN} += "gstreamer-plugins-base \
gstreamer-plugins-good \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstaudio-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgudev-1.0.so.0()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpeas-1.0.so.0()(64bit) \
libpeas-gtk-1.0.so.0()(64bit) \
libsqlite3.so.0()(64bit) \
libtag_c.so.0()(64bit) \
libtotem-plparser.so.18()(64bit) \
libxfce4ui-2.so.0()(64bit)"

inherit rpm
