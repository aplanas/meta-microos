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

RPM_NAME = "ffmpeg-4-private-devel-4.4.4-2.1.aarch64.rpm"
RPM_HASH = "9dd292a0ed683035abd9698d525071af252d304efa64a78a15cdaa0b05ab778f812bdecda91f0eab203af2b42a86f92bb454c397d4b35ca9a64b6a690191aefc"

RPROVIDES:${PN} += "ffmpeg-4-private-devel \
ffmpeg-private-devel"

RDEPENDS:${PN} += "ffmpeg-4-libavcodec-devel \
ffmpeg-4-libavformat-devel \
ffmpeg-4-libavutil-devel"

inherit rpm
