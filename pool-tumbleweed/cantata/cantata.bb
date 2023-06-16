SUMMARY = "Client for the Music Player Daemon (MPD)"
DESCRIPTION = "Cantata is a graphical client for MPD, supporting the following features: \
 * Multiple MPD collections. \
 * Customisable layout. \
 * Songs grouped by album in play queue. \
 * Context view to show artist, album, and song information of \
   current track. \
 * Tag editor. \
 * File organizer - use tags to organize files and folders. \
 * Ability to calculate ReplyGain tags \
 * Dynamic playlists. \
 * Online services; Jamendo, Magnatune, SoundCloud, and Podcasts. \
 * Radio stream support - with the ability to search for streams via \
   TuneIn, ShoutCast, or Dirble. \
 * USB-Mass-Storage and MTP device support \
 * Audio CD ripping and playback \
 * Playback of non-MPD songs - via simple in-built HTTP server if \
   connected to MPD via a standard socket, otherwise filepath is sent \
   to MPD. \
 * MPRISv2 DBUS interface. \
 * Basic support for touch-style interface (views are made \
   'flickable'). \
 * Scrobbling. \
 * Ratings support. \
 \
Cantata started off as a fork of QtMPC, however, the code (and user \
interface) is now very different to that of QtMPC. For more detailed \
information, please refer to the main README."
LICENSE = "GPL-3.0-only"

PV = "2.5.0"

RPM_NAME = "cantata-2.5.0-2.9.aarch64.rpm"
RPM_HASH = "b17990a6e6b87250f44770811778df57cc09a1c147439006ccafcaca36ce5cf6704bb580b7ec57b0e52b770095aaaee3b4babf77d68e1fc5c0a9c903884bf18a"

RPROVIDES:${PN} += "cantata"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libavcodec.so.59 \
libavformat.so.59 \
libavutil.so.57 \
libc.so.6 \
libcddb.so.2 \
libcdio-cdda.so.2 \
libcdio-paranoia.so.2 \
libgcc-s.so.1 \
libm.so.6 \
libmpg123.so.0 \
libmtp.so.9 \
libmusicbrainz5.so.1 \
libstdc++.so.6 \
libtag.so.1 \
libudev.so.1 \
libvlc.so.5 \
libz.so.1 \
media-player-info \
update-desktop-files"

inherit rpm
