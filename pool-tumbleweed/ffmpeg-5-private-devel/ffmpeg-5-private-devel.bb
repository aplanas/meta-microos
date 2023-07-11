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

RPM_NAME = "ffmpeg-5-private-devel-5.1.3-2.1.aarch64.rpm"
RPM_HASH = "61d335e92d6cf259b5a4b6afb6304875f3da665dd9f1a060e0088cba49c09aae63ba48a1fe31af5d8ba116a08ed96c86d20ea9fa0d518e7c8e2b12a7b290f4b9"

RPROVIDES:${PN} += "ffmpeg-5-private-devel \
ffmpeg-private-devel"

RDEPENDS:${PN} += "ffmpeg-5-libavcodec-devel \
ffmpeg-5-libavformat-devel \
ffmpeg-5-libavutil-devel"

inherit rpm
