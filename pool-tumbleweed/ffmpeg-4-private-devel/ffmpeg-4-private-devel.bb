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

RPM_NAME = "ffmpeg-4-private-devel-4.4.4-2.3.aarch64.rpm"
RPM_HASH = "6a2cbc02e404f41fff24704aa38ea0611129bb992fa4f879025c3d9dc08bf99e8d1af1a1d88c2b49106145659fa5d5192ea846d64a21520fee4087b676092553"

RPROVIDES:${PN} += "ffmpeg-4-private-devel \
ffmpeg-private-devel"

RDEPENDS:${PN} += "ffmpeg-4-libavcodec-devel \
ffmpeg-4-libavformat-devel \
ffmpeg-4-libavutil-devel"

inherit rpm
