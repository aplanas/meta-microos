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

RPROVIDES:${PN} += "application() application(cantata.desktop) cantata cantata(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /usr/bin/perl hicolor-icon-theme ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libavcodec.so.59()(64bit) libavcodec.so.59(LIBAVCODEC_59.37_SUSE)(64bit) libavformat.so.59()(64bit) libavformat.so.59(LIBAVFORMAT_59.27_SUSE)(64bit) libavutil.so.57()(64bit) libavutil.so.57(LIBAVUTIL_57.28_SUSE)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcddb.so.2()(64bit) libcdio_cdda.so.2()(64bit) libcdio_cdda.so.2(CDIO_CDDA_2)(64bit) libcdio_paranoia.so.2()(64bit) libcdio_paranoia.so.2(CDIO_PARANOIA_2)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmpg123.so.0()(64bit) libmtp.so.9()(64bit) libmusicbrainz5.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtag.so.1()(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) libvlc.so.5()(64bit) libz.so.1()(64bit) media-player-info update-desktop-files"

inherit rpm
