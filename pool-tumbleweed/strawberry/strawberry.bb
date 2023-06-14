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
  - Song lyrics from Lyrics.com, AudD, Genius, Musixmatch, ChartLyrics, lyrics.ovh and lololyrics.com \
  - Support for multiple backends \
  - Audio analyzer \
  - Equalizer \
  - Transfer music to iPod, MTP or mass-storage USB player \
  - Scrobbler with support for Last.fm, Libre.fm and ListenBrainz \
  - Subsonic streaming support"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.17"

RPM_NAME = "strawberry-1.0.17-1.2.aarch64.rpm"
RPM_HASH = "c79b8e884f218c0e9acfb5671e3e8845afd10b374bcd50f86cf30a756eec45b3bbe9b5fe71e43df98be41bcdb173badafbe68b14262d58baeef6f07d3e105b7b"

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
libprotobuf-3.21.12.so \
libpulse.so.0 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtag.so.1 \
qt6-sql-sqlite"

inherit rpm
