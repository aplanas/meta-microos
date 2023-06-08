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

RPM_NAME = "ffmpeg-5-private-devel-5.1.3-1.1.aarch64.rpm"
RPM_HASH = "b35e73b32d18f99add3cec127b176eda105bf9524f2cf69ee14c72a059d0ec063f2032ecf615ad9a3e4887b3a84e14f5cef7b341b92803a11b580539a0abd197"

RPROVIDES:${PN} += "ffmpeg-5-private-devel ffmpeg-5-private-devel(aarch-64) ffmpeg-private-devel"
RDEPENDS:${PN} += "ffmpeg-5-libavcodec-devel ffmpeg-5-libavformat-devel ffmpeg-5-libavutil-devel"

inherit rpm
