SUMMARY = "Some FFmpeg private headers"
DESCRIPTION = "FFmpeg is a multimedia framework, able to decode, encode, \
transcode, mux, demux, stream, filter and play several formats \
that humans and machines have created. \
 \
This package contains some private headers for libavformat, libavcodec and \
libavutil which are needed by libav-tools to build. No other package apart \
from libav should depend on these private headers which are expected to \
break compatibility without any notice."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-private-devel-5.1.3-1.2.aarch64.rpm"
RPM_HASH = "46c7c682b91471cdbecc9cbd54d71a9f2cd7b8510008bac213043122357028c355d62951df71799289437bda03aaa49bb708cb32908492ea9f14f7addaca5e01"

RPROVIDES:${PN} += "ffmpeg-5-private-devel ffmpeg-5-private-devel(aarch-64) ffmpeg-private-devel"
RDEPENDS:${PN} += "ffmpeg-5-libavcodec-devel ffmpeg-5-libavformat-devel ffmpeg-5-libavutil-devel"

inherit rpm
