SUMMARY = "Set of libraries for working with various multimedia formats"
DESCRIPTION = "FFmpeg is a multimedia framework, able to decode, encode, \
transcode, mux, demux, stream, filter and play several formats \
that humans and machines have created. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-6.0-3.1.aarch64.rpm"
RPM_HASH = "81944e902f69cbe3eb31a6c5edad51e217762e7e684997edddb6cfcca873c73049e4b6e081c46601bf0a1d17827a7474a79f235556b97cb31b971d703434cbef"

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
