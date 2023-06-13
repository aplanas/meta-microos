SUMMARY = "VLC-based Multimedia Player"
DESCRIPTION = "Kaffeine is a media player. \
What makes it different from the others is its excellent support of digital TV (DVB). \
Kaffeine has a user-friendly interface so that even first-time users can start immediately \
playing their movies: from DVD (including DVD menus, titles, chapters, etc.), VCD, or a file."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.18git.20230531T022124~afc6c12"

RPM_NAME = "kaffeine-2.0.18git.20230531T022124~afc6c12-1.1.aarch64.rpm"
RPM_HASH = "0576eac8a007a6cb51dc1ca97e49caafd4100f55415a1bfd49d04c5a29a3c9e531e8ce492ff63c81704b7be0f8808fca26b8ff0342f3c5c7988cb7c76c799bec"

RPROVIDES:${PN} += "application() \
application(org.kde.kaffeine.desktop) \
kaffeine \
kaffeine(aarch-64) \
metainfo() \
metainfo(org.kde.kaffeine.appdata.xml) \
mimehandler(application/ogg) \
mimehandler(application/ram) \
mimehandler(application/vnd.rn-realmedia) \
mimehandler(application/x-matroska) \
mimehandler(application/x-ogg) \
mimehandler(application/x-quicktime-media-link) \
mimehandler(application/x-shockwave-flash) \
mimehandler(application/x-shorten) \
mimehandler(application/xspf+xml) \
mimehandler(audio/ac3) \
mimehandler(audio/amr) \
mimehandler(audio/amr-wb) \
mimehandler(audio/basic) \
mimehandler(audio/flac) \
mimehandler(audio/mp4) \
mimehandler(audio/mpeg) \
mimehandler(audio/ogg) \
mimehandler(audio/vnd.rn-realaudio) \
mimehandler(audio/webm) \
mimehandler(audio/x-aiff) \
mimehandler(audio/x-flac) \
mimehandler(audio/x-it) \
mimehandler(audio/x-m4a) \
mimehandler(audio/x-m4b) \
mimehandler(audio/x-matroska) \
mimehandler(audio/x-mod) \
mimehandler(audio/x-mp3) \
mimehandler(audio/x-mpeg) \
mimehandler(audio/x-mpegurl) \
mimehandler(audio/x-ms-asx) \
mimehandler(audio/x-ms-wma) \
mimehandler(audio/x-musepack) \
mimehandler(audio/x-pn-realaudio) \
mimehandler(audio/x-pn-realaudio-plugin) \
mimehandler(audio/x-s3m) \
mimehandler(audio/x-scpls) \
mimehandler(audio/x-stm) \
mimehandler(audio/x-tta) \
mimehandler(audio/x-voc) \
mimehandler(audio/x-vorbis+ogg) \
mimehandler(audio/x-wav) \
mimehandler(audio/x-wavpack) \
mimehandler(audio/x-xm) \
mimehandler(image/vnd.rn-realpix) \
mimehandler(inode/directory) \
mimehandler(misc/ultravox) \
mimehandler(video/dv) \
mimehandler(video/mp2t) \
mimehandler(video/mp4) \
mimehandler(video/mp4v-es) \
mimehandler(video/mpeg) \
mimehandler(video/msvideo) \
mimehandler(video/ogg) \
mimehandler(video/quicktime) \
mimehandler(video/vnd.rn-realvideo) \
mimehandler(video/webm) \
mimehandler(video/x-anim) \
mimehandler(video/x-avi) \
mimehandler(video/x-fli) \
mimehandler(video/x-flic) \
mimehandler(video/x-flv) \
mimehandler(video/x-matroska) \
mimehandler(video/x-mng) \
mimehandler(video/x-mpeg) \
mimehandler(video/x-ms-asf) \
mimehandler(video/x-ms-wmv) \
mimehandler(video/x-msvideo) \
mimehandler(video/x-nsv) \
mimehandler(video/x-ogm+ogg) \
mimehandler(x-content/audio-cdda) \
mimehandler(x-content/audio-player) \
mimehandler(x-content/video-dvd) \
mimehandler(x-content/video-svcd) \
mimehandler(x-content/video-vcd) \
mimehandler(x-scheme-handler/mms) \
mimehandler(x-scheme-handler/rtmp) \
mimehandler(x-scheme-handler/rtsp)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5Solid.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Sql5-sqlite \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libXss.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdvbv5.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libvlc.so.5()(64bit) \
vlc-noX"

inherit rpm
