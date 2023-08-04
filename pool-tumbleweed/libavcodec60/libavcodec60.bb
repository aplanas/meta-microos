SUMMARY = "FFmpeg codec library"
DESCRIPTION = "The libavcodec library provides a generic encoding/decoding framework \
and contains multiple decoders and encoders for audio, video and \
subtitle streams, and several bitstream filters. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "libavcodec60-6.0-3.1.aarch64.rpm"
RPM_HASH = "ecd63422cd04df31543f5a789275c00826e63b0b11dcb8fa47fc5be90357418923f996ff8ec49ab318512ea289929a02917e7786efc8e8ff6a5b356ff32cb969"

RPROVIDES:${PN} += "libavcodec \
libavcodec.so.60 \
libavcodec60"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaom.so.3 \
libavutil.so.58 \
libavutil58 \
libc.so.6 \
libcodec2.so.1.2 \
libdav1d.so.6 \
libgsm.so.1 \
libjxl-threads.so.0.8 \
libjxl.so.0.8 \
liblzma.so.5 \
libm.so.6 \
libmp3lame.so.0 \
libopenjp2.so.7 \
libopus.so.0 \
librav1e.so.0 \
libspeex.so.1 \
libswresample.so.4 \
libswresample4 \
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
