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

PV = "6.0"

RPM_NAME = "ffmpeg-6-private-devel-6.0-2.2.aarch64.rpm"
RPM_HASH = "f2062cc4fde9ebf96ed2f2e0a7db5e6a5bab158390afb56f69e6ddba3315c2da7e5a45b0f2d19f5740d2ee3785fae24b7695372f77b23d022000c211411747f3"

RPROVIDES:${PN} += "ffmpeg-6-private-devel \
ffmpeg-6-private-devel(aarch-64) \
ffmpeg-private-devel"

RDEPENDS:${PN} += "ffmpeg-6-libavcodec-devel \
ffmpeg-6-libavformat-devel \
ffmpeg-6-libavutil-devel"

inherit rpm
