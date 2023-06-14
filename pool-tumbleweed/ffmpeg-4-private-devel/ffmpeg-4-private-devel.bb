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

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-private-devel-4.4.4-1.2.aarch64.rpm"
RPM_HASH = "c062bfb1247afe9c903a74c431363b1f191709762e7d63188d7f0ea171167d3a08a17642f52122cb675b11361fa13a8b4772804fe0ef14c2f4e8068f2d48cdce"

RPROVIDES:${PN} += "ffmpeg-4-private-devel \
ffmpeg-private-devel"

RDEPENDS:${PN} += "ffmpeg-4-libavcodec-devel \
ffmpeg-4-libavformat-devel \
ffmpeg-4-libavutil-devel"

inherit rpm
