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

RPROVIDES:${PN} += "deadbeef"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libBlocksRuntime.so.1.3 \
libFLAC.so.12 \
libX11.so.6 \
libasound.so.2 \
libatk-1.0.so.0 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libcairo.so.2 \
libcddb.so.2 \
libcdio.so.19 \
libcurl.so.4 \
libdbus-1.so.3 \
libdispatch.so.1.3 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-x11-2.0.so.0 \
libjansson.so.4 \
libm.so.6 \
libmad.so.0 \
libmpg123.so.0 \
libogg.so.0 \
libopusfile.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpipewire-0.3.so.0 \
libpulse-simple.so.0 \
libpulse.so.0 \
libsamplerate.so.0 \
libsndfile.so.1 \
libstdc++.so.6 \
libvorbis.so.0 \
libvorbisfile.so.3 \
libwavpack.so.1 \
libz.so.1 \
libzip.so.5"

inherit rpm
