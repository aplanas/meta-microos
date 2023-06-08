SUMMARY = "GTK+ audio player"
DESCRIPTION = "DeaDBeeF is an audio player using GTK+. Through use of the ffmpeg \
libraries, it supports many formats. It also supports cuesheets, \
chiptune formats with subtunes, song-length databases. It can be \
extended using plugins (DSP, GUI, output, input, etc.). The GUI looks \
similar to Foobar2000."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & Zlib & LGPL-2.1-or-later"

PV = "1.9.5"

RPM_NAME = "deadbeef-1.9.5-2.1.aarch64.rpm"
RPM_HASH = "efcb4c0ca0334874545ff3bbccdda6aeb885daaa841d5263a5f7f05d6780fabf899d78193f1ba47b1d2352b1383296cd88dc2a2db5315497f996985df9dc4291"

RPROVIDES:${PN} += "application() application(deadbeef.desktop) deadbeef deadbeef(aarch-64) metainfo() metainfo(deadbeef.appdata.xml) mimehandler(application/ogg) mimehandler(application/x-cue) mimehandler(application/x-ogg) mimehandler(audio/mp3) mimehandler(audio/mpeg) mimehandler(audio/prs.sid) mimehandler(audio/x-flac) mimehandler(audio/x-it) mimehandler(audio/x-mod) mimehandler(audio/x-mpeg) mimehandler(audio/x-mpegurl) mimehandler(audio/x-s3m) mimehandler(audio/x-scpls) mimehandler(audio/x-vorbis+ogg) mimehandler(audio/x-xm)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libBlocksRuntime.so.1.3()(64bit) libFLAC.so.12()(64bit) libX11.so.6()(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libatk-1.0.so.0()(64bit) libavcodec.so.60()(64bit) libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) libavformat.so.60()(64bit) libavformat.so.60(LIBAVFORMAT_60.3_SUSE)(64bit) libavutil.so.58()(64bit) libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libcddb.so.2()(64bit) libcdio.so.19()(64bit) libcdio.so.19(CDIO_19)(64bit) libcurl.so.4()(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libdispatch.so.1.3()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgdk-3.so.0()(64bit) libgdk-x11-2.0.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libjansson.so.4()(64bit) libjansson.so.4(libjansson.so.4)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmad.so.0()(64bit) libmpg123.so.0()(64bit) libogg.so.0()(64bit) libopusfile.so.0()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libpipewire-0.3.so.0()(64bit) libpulse-simple.so.0()(64bit) libpulse-simple.so.0(PULSE_0)(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit) libsamplerate.so.0()(64bit) libsamplerate.so.0(libsamplerate.so.0.0)(64bit) libsndfile.so.1()(64bit) libsndfile.so.1(libsndfile.so.1.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libvorbis.so.0()(64bit) libvorbisfile.so.3()(64bit) libwavpack.so.1()(64bit) libz.so.1()(64bit) libzip.so.5()(64bit)"

inherit rpm
