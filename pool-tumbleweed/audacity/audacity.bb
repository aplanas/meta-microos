SUMMARY = "A Multi Track Digital Audio Editor"
DESCRIPTION = "Audacity is a program that manipulates digital audio wave forms. \
In addition to multitrack recording capabilities with effects, it \
imports and exports many sound file formats, including WAV, AIFF, \
AU, IRCAM, MP, and Ogg Vorbis. Wave data larger than the available \
physical memory size can be edited."
LICENSE = "CC-BY-3.0 & GPL-2.0-or-later & GPL-3.0-only"

PV = "3.3.2"

RPM_NAME = "audacity-3.3.2-1.2.aarch64.rpm"
RPM_HASH = "0fa69db14350c30271271a8ec401a9727a5a6c26f30bab540fd1f815d02a46484ca94bd88bee54843bd3d6d604342dfefac1e93d50b359ee3daff27f6eccab13"

RPROVIDES:${PN} += "audacity \
audacity-plugins \
lib-audio-devices.so \
lib-audio-graph.so \
lib-audio-io.so \
lib-basic-ui.so \
lib-command-parameters.so \
lib-components.so \
lib-effects.so \
lib-exceptions.so \
lib-ffmpeg-support.so \
lib-files.so \
lib-graphics.so \
lib-ipc.so \
lib-math.so \
lib-module-manager.so \
lib-numeric-formats.so \
lib-preferences.so \
lib-project-file-io.so \
lib-project-history.so \
lib-project-rate.so \
lib-project.so \
lib-realtime-effects.so \
lib-registries.so \
lib-sample-track.so \
lib-screen-geometry.so \
lib-shuttlegui.so \
lib-snapping.so \
lib-string-utils.so \
lib-strings.so \
lib-tags.so \
lib-theme-resources.so \
lib-theme.so \
lib-time-frequency-selection.so \
lib-time-track.so \
lib-track-selection.so \
lib-track.so \
lib-transactions.so \
lib-utility.so \
lib-uuid.so \
lib-vst3.so \
lib-wave-track.so \
lib-wx-init.so \
lib-wx-wrappers.so \
lib-xml.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ffmpeg \
ld-linux-aarch64.so.1 \
libFLAC++.so.10 \
libFLAC.so.12 \
libSoundTouch.so.1 \
libX11.so.6 \
libasound.so.2 \
libc.so.6 \
libexpat.so.1 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libid3tag.so.0.16.2 \
liblilv-0.so.0 \
libm.so.6 \
libmp3lame0 \
libmpg123.so.0 \
libogg.so.0 \
libportaudio.so.2 \
libportmidi.so.2 \
libsndfile.so.1 \
libsoxr.so.0 \
libsqlite3.so.0 \
libstdc++.so.6 \
libsuil-0.so.0 \
libtwolame.so.0 \
libuuid.so.1 \
libvamp-hostsdk.so.3 \
libvorbis.so.0 \
libvorbisenc.so.2 \
libvorbisfile.so.3 \
libwavpack.so.1 \
libwx-baseu-net-suse-nostl.so.9.0.0 \
libwx-baseu-suse-nostl.so.9.0.0 \
libwx-gtk3u-core-suse-nostl.so.9.0.0 \
libwx-gtk3u-html-suse-nostl.so.9.0.0 \
libwx-gtk3u-qa-suse-nostl.so.9.0.0"

inherit rpm
