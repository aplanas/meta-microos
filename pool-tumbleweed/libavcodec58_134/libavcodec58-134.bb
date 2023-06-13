SUMMARY = "FFmpeg codec library"
DESCRIPTION = "The libavcodec library provides a generic encoding/decoding framework \
and contains multiple decoders and encoders for audio, video and \
subtitle streams, and several bitstream filters. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libavcodec58_134-4.4.4-1.2.aarch64.rpm"
RPM_HASH = "c74d901622a47318c481bc2196c6671a5fafc176b1104f14a329291c92dc41a1380e1744225d9c6d04bf4280cc7a6012d1b7ff3bb642ac7ee1cd6fe9dc2ce8ed"

RPROVIDES:${PN} += "libavcodec \
libavcodec.so.58.134()(64bit) \
libavcodec.so.58.134(LIBAVCODEC_58)(64bit) \
libavcodec58_134 \
libavcodec58_134(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libaom.so.3()(64bit) \
libavutil.so.56.70()(64bit) \
libavutil.so.56.70(LIBAVUTIL_56)(64bit) \
libavutil56_70 \
libc.so.6()(64bit) \
libcelt0.so.2()(64bit) \
libcodec2.so.1.1()(64bit) \
libdav1d.so.6()(64bit) \
libgsm.so.1()(64bit) \
liblzma.so.5()(64bit) \
libm.so.6()(64bit) \
libmp3lame.so.0()(64bit) \
libopenjp2.so.7()(64bit) \
libopus.so.0()(64bit) \
librav1e.so.0()(64bit) \
libspeex.so.1()(64bit) \
libswresample.so.3.9()(64bit) \
libswresample.so.3.9(LIBSWRESAMPLE_3)(64bit) \
libswresample3_9 \
libtheoradec.so.1()(64bit) \
libtheoraenc.so.1()(64bit) \
libtwolame.so.0()(64bit) \
libva.so.2()(64bit) \
libvorbis.so.0()(64bit) \
libvorbisenc.so.2()(64bit) \
libvpx.so.8()(64bit) \
libwebp.so.7()(64bit) \
libwebpmux.so.3()(64bit) \
libz.so.1()(64bit)"

inherit rpm
