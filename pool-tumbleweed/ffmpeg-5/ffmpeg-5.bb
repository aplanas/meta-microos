SUMMARY = "Set of libraries for working with various multimedia formats"
DESCRIPTION = "FFmpeg is a multimedia framework, able to decode, encode, \
transcode, mux, demux, stream, filter and play several formats \
that humans and machines have created. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-5.1.3-2.1.aarch64.rpm"
RPM_HASH = "857d6e88270dfb1ede9c28234e8d8548126040303705a055856993588769dafdd3ff8d0b8f29843f972fc18e9f95b4b46c5dadf307acfcd584de719fe2288a03"

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
