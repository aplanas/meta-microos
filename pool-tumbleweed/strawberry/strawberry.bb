SUMMARY = "A music player and music collection organizer"
DESCRIPTION = "Strawberry is a music player and music collection organizer. \
It is a fork of Clementine. The name is inspired by the band Strawbs. \
 \
Features: \
  - Play and organize music \
  - Supports WAV, FLAC, WavPack, DSF, DSDIFF, Ogg FLAC, Ogg Vorbis, Ogg Opus, Ogg Speex, MPC, TrueAudio, \
    AIFF, MP4, MP3, ASF and Monkey's Audio. \
  - Audio CD playback \
  - Native desktop notifications \
  - Playlists in multiple formats \
  - Advanced audio output and device options \
  - Edit tags on music files \
  - Fetch tags from MusicBrainz \
  - Album cover art from Last.fm, Musicbrainz, Discogs, Musixmatch, Deezer, Tidal, Qobuz and Spotify \
  - Song lyrics from Lyrics.com, Genius, Musixmatch, ChartLyrics, lyrics.ovh and lololyrics.com \
  - Support for multiple backends \
  - Audio analyzer \
  - Equalizer \
  - Transfer music to iPod, MTP or mass-storage USB player \
  - Scrobbler with support for Last.fm, Libre.fm and ListenBrainz \
  - Subsonic streaming support"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.18"

RPM_NAME = "strawberry-1.0.18-1.3.aarch64.rpm"
RPM_HASH = "c9fca605799e23afe865d76db1ebdfc12409eb88bbda14d4fcd50936f91e9d4f3fe7a798d606b18f99b6bbbca0cb880e00ee16603a83770a5605b6980a0067e7"

RPROVIDES:${PN} += "strawberry"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libasound.so.2 \
libc.so.6 \
libcdio.so.19 \
libchromaprint.so.1 \
libfftw3.so.3 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgpod.so.4 \
libgstapp-1.0.so.0 \
libgstaudio-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libicui18n.so.73 \
libicuuc.so.73 \
libm.so.6 \
libmtp.so.9 \
libprotobuf.so.23.4.0 \
libpulse.so.0 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtag.so.1 \
qt6-sql-sqlite"

inherit rpm
