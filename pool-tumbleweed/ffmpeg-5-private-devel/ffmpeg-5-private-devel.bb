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

RPM_NAME = "ffmpeg-5-private-devel-5.1.3-2.2.aarch64.rpm"
RPM_HASH = "f29ec22c60ce29679dafe5322aa64d1b1a052b81843766e6a3fee77cfc20f7855582bc95ef333babb782fc846f5919918f26fb461ab4bf575507b4589e07047d"

RPROVIDES:${PN} += "ffmpeg-5-private-devel \
ffmpeg-private-devel"

RDEPENDS:${PN} += "ffmpeg-5-libavcodec-devel \
ffmpeg-5-libavformat-devel \
ffmpeg-5-libavutil-devel"

inherit rpm
