SUMMARY = "FFmpeg codec library"
DESCRIPTION = "The libavcodec library provides a generic encoding/decoding framework \
and contains multiple decoders and encoders for audio, video and \
subtitle streams, and several bitstream filters. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libavcodec58_134-4.4.4-2.1.aarch64.rpm"
RPM_HASH = "78090981577719e38547fa911ec5b471466b50f06bfc2c3d3f1969b58dfc6753bffb17d4759955932cd44680fa64c690bce71ac65be63ce1f5c69269a486a971"

RPROVIDES:${PN} += "libavcodec \
libavcodec.so.58.134 \
libavcodec58-134"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaom.so.3 \
libavutil.so.56.70 \
libavutil56-70 \
libc.so.6 \
libcelt0.so.2 \
libcodec2.so.1.1 \
libdav1d.so.6 \
libgsm.so.1 \
liblzma.so.5 \
libm.so.6 \
libmp3lame.so.0 \
libopenjp2.so.7 \
libopus.so.0 \
librav1e.so.0 \
libspeex.so.1 \
libswresample.so.3.9 \
libswresample3-9 \
libtheoradec.so.1 \
libtheoraenc.so.1 \
libtwolame.so.0 \
libva.so.2 \
libvorbis.so.0 \
libvorbisenc.so.2 \
libvpx.so.8 \
libwebp.so.7 \
libwebpmux.so.3 \
libz.so.1"

inherit rpm
