SUMMARY = "A Qt based media player, streamer and downloader"
DESCRIPTION = "QMPlay2 is a video player, it can play and stream all formats supported by \
ffmpeg and libmodplug (including J2B). It has an integrated Youtube \
browser."
LICENSE = "LGPL-3.0-or-later"

PV = "23.06.04"

RPM_NAME = "QMPlay2-23.06.04-1.1.aarch64.rpm"
RPM_HASH = "27a26c6e4acc95066550e5c37d40f17aaf5c92309e3a6f0f845e0f96df49949b187cd039d738410e2f7a334269253e74f755c9d31c7c8dfebf80b0ed7c16f4d0"

RPROVIDES:${PN} += "QMPlay2 \
libALSA.so \
libAudioCD.so \
libAudioFilters.so \
libCUVID.so \
libChiptune.so \
libExtensions.so \
libFFmpeg.so \
libInputs.so \
libModplug.so \
libNotify.so \
libPipeWire.so \
libPlaylists.so \
libPortAudio.so \
libPulseAudio.so \
libQPainter.so \
libSubtitles.so \
libVideoFilters.so \
libVisualizations.so \
libXVideo.so \
libqmplay2.so"

RDEPENDS:${PN} += "/bin/sh \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libXv.so.1 \
libasound.so.2 \
libass.so.9 \
libavcodec.so.60 \
libavdevice.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libcddb.so.2 \
libcdio.so.19 \
libgcc-s.so.1 \
libgme.so.0 \
libm.so.6 \
libpipewire-0.3.so.0 \
libportaudio.so.2 \
libpulse-simple.so.0 \
libpulse.so.0 \
librubberband.so.2 \
libsidplayfp.so.6 \
libstdc++.so.6 \
libswresample.so.4 \
libswscale.so.7 \
libtag.so.1 \
libva-drm.so.2 \
libva.so.2 \
python3 \
shared-mime-info \
update-desktop-files"

inherit rpm
