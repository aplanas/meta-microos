SUMMARY = "Set of libraries for working with various multimedia formats"
DESCRIPTION = "FFmpeg is a multimedia framework, able to decode, encode, \
transcode, mux, demux, stream, filter and play several formats \
that humans and machines have created. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-5.1.3-2.2.aarch64.rpm"
RPM_HASH = "c5b9b10f2b3ad9de10cf5da7257d9983b1a1f663af17485b73e8b89fb872246b5a6651a20f8277d6a541bc87adeb45442217ca47ac7d02b85865cbccd5ccb75c"

RPROVIDES:${PN} += "ffmpeg \
ffmpeg-5 \
ffmpeg-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libavcodec.so.59 \
libavcodec59 \
libavdevice.so.59 \
libavdevice59 \
libavfilter.so.8 \
libavfilter8 \
libavformat.so.59 \
libavformat59 \
libavutil.so.57 \
libavutil57 \
libc.so.6 \
libm.so.6 \
libpostproc.so.56 \
libpostproc56 \
libswresample.so.4.ff5 \
libswresample4-ff5 \
libswscale.so.6 \
libswscale6 \
libz.so.1"

inherit rpm
