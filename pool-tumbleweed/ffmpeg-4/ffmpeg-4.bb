SUMMARY = "Set of libraries for working with various multimedia formats"
DESCRIPTION = "FFmpeg is a multimedia framework, able to decode, encode, \
transcode, mux, demux, stream, filter and play several formats \
that humans and machines have created. \
 \
 \
This build of ffmpeg is limited in the number of codecs supported."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-4.4.4-2.1.aarch64.rpm"
RPM_HASH = "a38f4d1264d4e251f0bb0a820f3a7c5039dcb0b84cf45a6e85b4fe5baff51648519fdd86c7a2bb5a7e1c193f5b85fe2dadb74b77c842b6b0691ea46096d51a41"

RPROVIDES:${PN} += "ffmpeg \
ffmpeg-4 \
ffmpeg-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libavcodec.so.58.134 \
libavcodec58-134 \
libavdevice.so.58.13 \
libavdevice58-13 \
libavfilter.so.7.110 \
libavfilter7-110 \
libavformat.so.58.76 \
libavformat58-76 \
libavresample.so.4.0 \
libavresample4-0 \
libavutil.so.56.70 \
libavutil56-70 \
libc.so.6 \
libm.so.6 \
libpostproc.so.55.9 \
libpostproc55-9 \
libswresample.so.3.9 \
libswresample3-9 \
libswscale.so.5.9 \
libswscale5-9 \
libz.so.1"

inherit rpm
