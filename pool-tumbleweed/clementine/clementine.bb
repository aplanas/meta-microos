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

RPM_NAME = "clementine-1.4.0~rc2-1.12.aarch64.rpm"
RPM_HASH = "14122d4f7f5aef5f4a6a28f65c5141f8ec833ede35499331787cc10d5605e132363adbdfcd98d093cc9104db73c54dbcc4fbc5b191312cac5528d838589975af"

RPROVIDES:${PN} += "application() \
application(org.clementine_player.Clementine.desktop) \
clementine \
clementine(aarch-64) \
clementine-kde \
metainfo() \
metainfo(org.clementine_player.Clementine.appdata.xml) \
mimehandler(application/ogg) \
mimehandler(application/x-ogg) \
mimehandler(application/x-ogm-audio) \
mimehandler(audio/aac) \
mimehandler(audio/mp4) \
mimehandler(audio/mpeg) \
mimehandler(audio/mpegurl) \
mimehandler(audio/ogg) \
mimehandler(audio/vnd.rn-realaudio) \
mimehandler(audio/vorbis) \
mimehandler(audio/x-flac) \
mimehandler(audio/x-mp3) \
mimehandler(audio/x-mpeg) \
mimehandler(audio/x-mpegurl) \
mimehandler(audio/x-ms-wma) \
mimehandler(audio/x-musepack) \
mimehandler(audio/x-oggflac) \
mimehandler(audio/x-pn-realaudio) \
mimehandler(audio/x-scpls) \
mimehandler(audio/x-speex) \
mimehandler(audio/x-vorbis) \
mimehandler(audio/x-vorbis+ogg) \
mimehandler(audio/x-wav) \
mimehandler(video/x-ms-asf) \
mimehandler(x-content/audio-player) \
mimehandler(x-scheme-handler/feed) \
mimehandler(x-scheme-handler/itms) \
mimehandler(x-scheme-handler/itpc) \
mimehandler(x-scheme-handler/zune)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Concurrent.so.5()(64bit) \
libQt5Concurrent.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5OpenGL.so.5()(64bit) \
libQt5OpenGL.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libcdio.so.19()(64bit) \
libcdio.so.19(CDIO_19)(64bit) \
libchromaprint.so.1()(64bit) \
libcryptopp.so.8.7.0()(64bit) \
libfftw3.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgpod.so.4()(64bit) \
libgstapp-1.0.so.0()(64bit) \
libgstaudio-1.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgsttag-1.0.so.0()(64bit) \
liblastfm5.so.1()(64bit) \
libm.so.6()(64bit) \
libmtp.so.9()(64bit) \
libmygpo-qt5.so.1()(64bit) \
libprojectM.so.3()(64bit) \
libprotobuf-3.21.12.so()(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libqxtglobalshortcut.so.0()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libtag.so.1()(64bit) \
libtag1 \
libz.so.1()(64bit)"

inherit rpm
