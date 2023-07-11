SUMMARY = "FFmpeg codec library"
DESCRIPTION = "The libavcodec library provides a generic encoding/decoding framework \
and contains multiple decoders and encoders for audio, video and \
subtitle streams, and several bitstream filters. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "libavcodec60-6.0-2.4.aarch64.rpm"
RPM_HASH = "9cf66ea94421312fa4b9a8560af9b1e5ca1440e7fb1d2f5071a7c2b5e31c05853e0cae9fcdc13894b6e3d89520fc03d939a5dfc3079a2e1c5a0e4428b214b04c"

RPROVIDES:${PN} += "libavcodec \
libavcodec.so.60 \
libavcodec60"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaom.so.3 \
libavutil.so.58 \
libavutil58 \
libc.so.6 \
libcodec2.so.1.1 \
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
