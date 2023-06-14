SUMMARY = "FFmpeg codec library"
DESCRIPTION = "The libavcodec library provides a generic encoding/decoding framework \
and contains multiple decoders and encoders for audio, video and \
subtitle streams, and several bitstream filters. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "libavcodec59-5.1.3-1.2.aarch64.rpm"
RPM_HASH = "4584f1aeaf68bc40995d3f9f5c7a85685c80cb0f454415a1a886b10e315c2eb2c39f9a4aa6edc65725b832246e411ddb27bd7ab0f46b932250bc8e69392d6e46"

RPROVIDES:${PN} += "libavcodec \
libavcodec.so.59 \
libavcodec59"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaom.so.3 \
libavutil.so.57 \
libavutil57 \
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
libswresample.so.4.ff5 \
libswresample4-ff5 \
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
