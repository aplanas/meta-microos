SUMMARY = "A music player inspired by Amarok 1.4"
DESCRIPTION = "Clementine is a music player and library organiser. \
It is inspired by Amarok 1.4, focusing on a fast and easy-to-use \
interface for searching and playing your music. \
 \
Features: \
 \
 * Search and play your local music library. \
 * Play audio CDs. \
 * Edit tags on audio files and organise your music. \
 * Native desktop notifications. \
 * Tabbed playlists, import and export M3U, XSPF, PLS and ASX. \
 * Create smart playlists and dynamic playlists. \
 * Download missing album cover art from Last.fm, MusicBrainz and Discogs. \
 * Lyrics and artist biographies and photos. \
 * Copy music to your iPod, iPhone, MTP or mass-storage USB player. \
 * Queue manager. \
 * Search and play songs you've uploaded to Box, Dropbox, Google Drive, and OneDrive \
 * Listen to internet radio from Spotify, Grooveshark, SomaFM, Magnatune, Jamendo, \
 SKY.fm, Digitally Imported, JAZZRADIO.com, Icecast and Subsonic servers."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.0~rc2"

RPM_NAME = "clementine-1.4.0~rc2-1.14.aarch64.rpm"
RPM_HASH = "ab7224e4ee9077f601ff4c64a742dd6578e287ebd9a4029acaaa368054ed9e1cbaf4ce9982dec8de6fe9967a8aad67b39ca02fd588e10bba66126bd5dd9f6415"

RPROVIDES:${PN} += "clementine \
clementine-kde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5OpenGL.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libasound.so.2 \
libc.so.6 \
libcdio.so.19 \
libchromaprint.so.1 \
libcryptopp.so.8.7.0 \
libfftw3.so.3 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpod.so.4 \
libgstapp-1.0.so.0 \
libgstaudio-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
liblastfm5.so.1 \
libm.so.6 \
libmtp.so.9 \
libmygpo-qt5.so.1 \
libprojectM.so.3 \
libprotobuf-3.21.12.so \
libpulse.so.0 \
libqxtglobalshortcut.so.0 \
libsqlite3.so.0 \
libstdc++.so.6 \
libtag.so.1 \
libtag1 \
libz.so.1"

inherit rpm
