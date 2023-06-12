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

RPROVIDES:${PN} += "application() \
application(audacity.desktop) \
audacity \
audacity(aarch-64) \
audacity-plugins \
lib-audio-devices.so()(64bit) \
lib-audio-graph.so()(64bit) \
lib-audio-io.so()(64bit) \
lib-basic-ui.so()(64bit) \
lib-command-parameters.so()(64bit) \
lib-components.so()(64bit) \
lib-effects.so()(64bit) \
lib-exceptions.so()(64bit) \
lib-ffmpeg-support.so()(64bit) \
lib-files.so()(64bit) \
lib-graphics.so()(64bit) \
lib-ipc.so()(64bit) \
lib-math.so()(64bit) \
lib-module-manager.so()(64bit) \
lib-numeric-formats.so()(64bit) \
lib-preferences.so()(64bit) \
lib-project-file-io.so()(64bit) \
lib-project-history.so()(64bit) \
lib-project-rate.so()(64bit) \
lib-project.so()(64bit) \
lib-realtime-effects.so()(64bit) \
lib-registries.so()(64bit) \
lib-sample-track.so()(64bit) \
lib-screen-geometry.so()(64bit) \
lib-shuttlegui.so()(64bit) \
lib-snapping.so()(64bit) \
lib-string-utils.so()(64bit) \
lib-strings.so()(64bit) \
lib-tags.so()(64bit) \
lib-theme-resources.so()(64bit) \
lib-theme.so()(64bit) \
lib-time-frequency-selection.so()(64bit) \
lib-time-track.so()(64bit) \
lib-track-selection.so()(64bit) \
lib-track.so()(64bit) \
lib-transactions.so()(64bit) \
lib-utility.so()(64bit) \
lib-uuid.so()(64bit) \
lib-vst3.so()(64bit) \
lib-wave-track.so()(64bit) \
lib-wx-init.so()(64bit) \
lib-wx-wrappers.so()(64bit) \
lib-xml.so()(64bit) \
metainfo() \
metainfo(audacity.appdata.xml) \
mimehandler(application/ogg) \
mimehandler(application/x-audacity-project) \
mimehandler(application/x-audacity-project+sqlite3) \
mimehandler(audio/aac) \
mimehandler(audio/ac3) \
mimehandler(audio/flac) \
mimehandler(audio/mp4) \
mimehandler(audio/mpeg) \
mimehandler(audio/x-flac) \
mimehandler(audio/x-ms-wma) \
mimehandler(audio/x-vorbis+ogg) \
mimehandler(video/mpeg)"
RDEPENDS:${PN} += "/bin/sh \
ffmpeg \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libFLAC++.so.10()(64bit) \
libFLAC.so.12()(64bit) \
libSoundTouch.so.1()(64bit) \
libX11.so.6()(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libid3tag.so.0.16.2()(64bit) \
liblilv-0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmp3lame0 \
libmpg123.so.0()(64bit) \
libogg.so.0()(64bit) \
libportaudio.so.2()(64bit) \
libportmidi.so.2()(64bit) \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit) \
libsoxr.so.0()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libsuil-0.so.0()(64bit) \
libtwolame.so.0()(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit) \
libvamp-hostsdk.so.3()(64bit) \
libvorbis.so.0()(64bit) \
libvorbisenc.so.2()(64bit) \
libvorbisfile.so.3()(64bit) \
libwavpack.so.1()(64bit) \
libwx_baseu-suse-nostl.so.9.0.0()(64bit) \
libwx_baseu-suse-nostl.so.9.0.0(WXU_3.2)(64bit) \
libwx_baseu_net-suse-nostl.so.9.0.0()(64bit) \
libwx_baseu_net-suse-nostl.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_core-suse-nostl.so.9.0.0()(64bit) \
libwx_gtk3u_core-suse-nostl.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_html-suse-nostl.so.9.0.0()(64bit) \
libwx_gtk3u_html-suse-nostl.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_qa-suse-nostl.so.9.0.0()(64bit) \
libwx_gtk3u_qa-suse-nostl.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
