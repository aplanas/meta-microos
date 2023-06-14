SUMMARY = "Set of libraries for working with various multimedia formats"
DESCRIPTION = "FFmpeg is a multimedia framework, able to decode, encode, \
transcode, mux, demux, stream, filter and play several formats \
that humans and machines have created. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-6.0-2.2.aarch64.rpm"
RPM_HASH = "f3bd99d4d27f10465a1f4c3998e09b1f50a50158d6c9fc7f5d65dc14b2454465c3834109c27bfec91142689c5860ffbcd2e9c37d910236728b0f7480f9b6157b"

RPROVIDES:${PN} += "ffmpeg \
ffmpeg-6 \
ffmpeg-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libavcodec.so.60 \
libavcodec60 \
libavdevice.so.60 \
libavdevice60 \
libavfilter.so.9 \
libavfilter9 \
libavformat.so.60 \
libavformat60 \
libavutil.so.58 \
libavutil58 \
libc.so.6 \
libm.so.6 \
libpostproc.so.57 \
libpostproc57 \
libswresample.so.4 \
libswresample4 \
libswscale.so.7 \
libswscale7 \
libz.so.1"

inherit rpm
