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

RPM_NAME = "ffmpeg-4-private-devel-4.4.4-2.2.aarch64.rpm"
RPM_HASH = "31ddd0a883ec83991a90b7021f9a4f565c859410be99e4cc52b6bb2261813b4ed37355cc15aa0d7d80cfb8374fea8d5879958adf848fd66161ab2e5235345fc1"

RPROVIDES:${PN} += "ffmpeg-4-private-devel \
ffmpeg-private-devel"

RDEPENDS:${PN} += "ffmpeg-4-libavcodec-devel \
ffmpeg-4-libavformat-devel \
ffmpeg-4-libavutil-devel"

inherit rpm
