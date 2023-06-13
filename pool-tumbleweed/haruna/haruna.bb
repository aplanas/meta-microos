SUMMARY = "Video player built with Qt/QML on top of libmpv"
DESCRIPTION = "haruna is a video player built with Qt/QML on top of libmpv."
LICENSE = "CC-BY-4.0 & GPL-3.0-or-later & WTFPL"

PV = "0.11.1"

RPM_NAME = "haruna-0.11.1-1.1.aarch64.rpm"
RPM_HASH = "6c41e8203bd1a13d2b0f2ed6bab8b2b36845d82e37a7fd6181005086cf2e40e965e5f52572b2d9a688da7bac5afed0bee4b245b090e60757725552bec6fc1f53"

RPROVIDES:${PN} += "application() \
application(org.kde.haruna.desktop) \
haruna \
haruna(aarch-64) \
metainfo() \
metainfo(org.kde.haruna.metainfo.xml) \
mimehandler(application/mxf) \
mimehandler(application/ogg) \
mimehandler(application/sdp) \
mimehandler(application/smil) \
mimehandler(application/streamingmedia) \
mimehandler(application/vnd.apple.mpegurl) \
mimehandler(application/vnd.ms-asf) \
mimehandler(application/vnd.rn-realmedia) \
mimehandler(application/vnd.rn-realmedia-vbr) \
mimehandler(application/x-cue) \
mimehandler(application/x-extension-m4a) \
mimehandler(application/x-extension-mp4) \
mimehandler(application/x-matroska) \
mimehandler(application/x-mpegurl) \
mimehandler(application/x-ogg) \
mimehandler(application/x-ogm) \
mimehandler(application/x-ogm-audio) \
mimehandler(application/x-ogm-video) \
mimehandler(application/x-shorten) \
mimehandler(application/x-smil) \
mimehandler(application/x-streamingmedia) \
mimehandler(audio/3gpp) \
mimehandler(audio/3gpp2) \
mimehandler(audio/AMR) \
mimehandler(audio/aac) \
mimehandler(audio/ac3) \
mimehandler(audio/aiff) \
mimehandler(audio/amr-wb) \
mimehandler(audio/dv) \
mimehandler(audio/eac3) \
mimehandler(audio/flac) \
mimehandler(audio/m3u) \
mimehandler(audio/m4a) \
mimehandler(audio/mp1) \
mimehandler(audio/mp2) \
mimehandler(audio/mp3) \
mimehandler(audio/mp4) \
mimehandler(audio/mpeg) \
mimehandler(audio/mpeg2) \
mimehandler(audio/mpeg3) \
mimehandler(audio/mpegurl) \
mimehandler(audio/mpg) \
mimehandler(audio/musepack) \
mimehandler(audio/ogg) \
mimehandler(audio/opus) \
mimehandler(audio/rn-mpeg) \
mimehandler(audio/scpls) \
mimehandler(audio/vnd.dolby.heaac.1) \
mimehandler(audio/vnd.dolby.heaac.2) \
mimehandler(audio/vnd.dts) \
mimehandler(audio/vnd.dts.hd) \
mimehandler(audio/vnd.rn-realaudio) \
mimehandler(audio/vorbis) \
mimehandler(audio/wav) \
mimehandler(audio/webm) \
mimehandler(audio/x-aac) \
mimehandler(audio/x-adpcm) \
mimehandler(audio/x-aiff) \
mimehandler(audio/x-ape) \
mimehandler(audio/x-m4a) \
mimehandler(audio/x-matroska) \
mimehandler(audio/x-mp1) \
mimehandler(audio/x-mp2) \
mimehandler(audio/x-mp3) \
mimehandler(audio/x-mpegurl) \
mimehandler(audio/x-mpg) \
mimehandler(audio/x-ms-asf) \
mimehandler(audio/x-ms-wma) \
mimehandler(audio/x-musepack) \
mimehandler(audio/x-pls) \
mimehandler(audio/x-pn-au) \
mimehandler(audio/x-pn-realaudio) \
mimehandler(audio/x-pn-wav) \
mimehandler(audio/x-pn-windows-pcm) \
mimehandler(audio/x-realaudio) \
mimehandler(audio/x-scpls) \
mimehandler(audio/x-shorten) \
mimehandler(audio/x-tta) \
mimehandler(audio/x-vorbis) \
mimehandler(audio/x-vorbis+ogg) \
mimehandler(audio/x-wav) \
mimehandler(audio/x-wavpack) \
mimehandler(video/3gp) \
mimehandler(video/3gpp) \
mimehandler(video/3gpp2) \
mimehandler(video/avi) \
mimehandler(video/divx) \
mimehandler(video/dv) \
mimehandler(video/fli) \
mimehandler(video/flv) \
mimehandler(video/mkv) \
mimehandler(video/mp2t) \
mimehandler(video/mp4) \
mimehandler(video/mp4v-es) \
mimehandler(video/mpeg) \
mimehandler(video/msvideo) \
mimehandler(video/ogg) \
mimehandler(video/quicktime) \
mimehandler(video/vnd.divx) \
mimehandler(video/vnd.mpegurl) \
mimehandler(video/vnd.rn-realvideo) \
mimehandler(video/webm) \
mimehandler(video/x-avi) \
mimehandler(video/x-flc) \
mimehandler(video/x-flic) \
mimehandler(video/x-flv) \
mimehandler(video/x-m4v) \
mimehandler(video/x-matroska) \
mimehandler(video/x-mpeg2) \
mimehandler(video/x-mpeg3) \
mimehandler(video/x-ms-afs) \
mimehandler(video/x-ms-asf) \
mimehandler(video/x-ms-wmv) \
mimehandler(video/x-ms-wmx) \
mimehandler(video/x-ms-wvxvideo) \
mimehandler(video/x-msvideo) \
mimehandler(video/x-ogm) \
mimehandler(video/x-ogm+ogg) \
mimehandler(video/x-theora) \
mimehandler(video/x-theora+ogg)"

RDEPENDS:${PN} += "breeze5-icons \
ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5FileMetaData.so.3()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickControls2.so.5()(64bit) \
libQt5QuickControls2.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libavcodec.so.60()(64bit) \
libavfilter.so.9()(64bit) \
libavformat.so.60()(64bit) \
libavutil.so.58()(64bit) \
libc.so.6()(64bit) \
libmpv.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libswscale.so.7()(64bit) \
yt-dlp"

inherit rpm
