SUMMARY = "A Qt based media player, streamer and downloader"
DESCRIPTION = "QMPlay2 is a video player, it can play and stream all formats supported by \
ffmpeg and libmodplug (including J2B). It has an integrated Youtube \
browser."
LICENSE = "LGPL-3.0-or-later"

PV = "23.06.04"

RPM_NAME = "QMPlay2-23.06.04-1.1.aarch64.rpm"
RPM_HASH = "27a26c6e4acc95066550e5c37d40f17aaf5c92309e3a6f0f845e0f96df49949b187cd039d738410e2f7a334269253e74f755c9d31c7c8dfebf80b0ed7c16f4d0"

RPROVIDES:${PN} += "QMPlay2 \
QMPlay2(aarch-64) \
application() \
application(QMPlay2.desktop) \
application(QMPlay2_enqueue.desktop) \
libALSA.so()(64bit) \
libAudioCD.so()(64bit) \
libAudioFilters.so()(64bit) \
libCUVID.so()(64bit) \
libChiptune.so()(64bit) \
libExtensions.so()(64bit) \
libFFmpeg.so()(64bit) \
libInputs.so()(64bit) \
libModplug.so()(64bit) \
libNotify.so()(64bit) \
libPipeWire.so()(64bit) \
libPlaylists.so()(64bit) \
libPortAudio.so()(64bit) \
libPulseAudio.so()(64bit) \
libQPainter.so()(64bit) \
libSubtitles.so()(64bit) \
libVideoFilters.so()(64bit) \
libVisualizations.so()(64bit) \
libXVideo.so()(64bit) \
libqmplay2.so()(64bit) \
metainfo() \
metainfo(QMPlay2.appdata.xml) \
mimehandler(application/vnd.rn-realmedia) \
mimehandler(application/x-cue) \
mimehandler(application/x-matroska) \
mimehandler(application/x-shockwave-flash) \
mimehandler(application/xspf+xml) \
mimehandler(audio/AMR) \
mimehandler(audio/aac) \
mimehandler(audio/ac3) \
mimehandler(audio/flac) \
mimehandler(audio/mp2) \
mimehandler(audio/mp4) \
mimehandler(audio/mpeg) \
mimehandler(audio/ogg) \
mimehandler(audio/prs.sid) \
mimehandler(audio/webm) \
mimehandler(audio/x-aiff) \
mimehandler(audio/x-ape) \
mimehandler(audio/x-flac+ogg) \
mimehandler(audio/x-gme) \
mimehandler(audio/x-it) \
mimehandler(audio/x-j2b) \
mimehandler(audio/x-matroska) \
mimehandler(audio/x-mod) \
mimehandler(audio/x-mpegurl) \
mimehandler(audio/x-ms-asx) \
mimehandler(audio/x-ms-wma) \
mimehandler(audio/x-musepack) \
mimehandler(audio/x-s3m) \
mimehandler(audio/x-scpls) \
mimehandler(audio/x-sfx) \
mimehandler(audio/x-stm) \
mimehandler(audio/x-tta) \
mimehandler(audio/x-umx) \
mimehandler(audio/x-vorbis+ogg) \
mimehandler(audio/x-wav) \
mimehandler(audio/x-wavpack) \
mimehandler(audio/x-xi) \
mimehandler(audio/x-xm) \
mimehandler(inode/directory) \
mimehandler(video/3gpp) \
mimehandler(video/3gpp2) \
mimehandler(video/dv) \
mimehandler(video/mp2t) \
mimehandler(video/mp4) \
mimehandler(video/mpeg) \
mimehandler(video/ogg) \
mimehandler(video/quicktime) \
mimehandler(video/vnd.rn-realvideo) \
mimehandler(video/webm) \
mimehandler(video/x-bink) \
mimehandler(video/x-flv) \
mimehandler(video/x-matroska) \
mimehandler(video/x-ms-asf) \
mimehandler(video/x-ms-wmv) \
mimehandler(video/x-msvideo) \
mimehandler(video/x-ogm+ogg) \
mimehandler(video/x-theora+ogg)"

RDEPENDS:${PN} += "/bin/sh \
hicolor-icon-theme \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libEGL.so.1()(64bit) \
libGLESv2.so.2()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libXv.so.1()(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libass.so.9()(64bit) \
libavcodec.so.60()(64bit) \
libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) \
libavdevice.so.60()(64bit) \
libavdevice.so.60(LIBAVDEVICE_60.1_SUSE)(64bit) \
libavformat.so.60()(64bit) \
libavformat.so.60(LIBAVFORMAT_60.3_SUSE)(64bit) \
libavutil.so.58()(64bit) \
libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcddb.so.2()(64bit) \
libcdio.so.19()(64bit) \
libcdio.so.19(CDIO_19)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgme.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpipewire-0.3.so.0()(64bit) \
libportaudio.so.2()(64bit) \
libpulse-simple.so.0()(64bit) \
libpulse-simple.so.0(PULSE_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
librubberband.so.2()(64bit) \
libsidplayfp.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libswresample.so.4()(64bit) \
libswresample.so.4(LIBSWRESAMPLE_4.10_SUSE)(64bit) \
libswscale.so.7()(64bit) \
libswscale.so.7(LIBSWSCALE_7.1_SUSE)(64bit) \
libtag.so.1()(64bit) \
libva-drm.so.2()(64bit) \
libva.so.2()(64bit) \
libva.so.2(VA_API_0.33.0)(64bit) \
python3 \
shared-mime-info \
update-desktop-files"

inherit rpm
