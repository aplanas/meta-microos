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

RPM_NAME = "ffmpeg-6-private-devel-6.0-3.1.aarch64.rpm"
RPM_HASH = "33612ada3f45f8c99761eb108ef91d5a9c3b53cad862b5f92cd78802623b2960076193802494977d07fbe1662dc6760c7d35012556090479b7e812870b3cd1d5"

RPROVIDES:${PN} += "ffmpeg-6-private-devel \
ffmpeg-private-devel"

RDEPENDS:${PN} += "ffmpeg-6-libavcodec-devel \
ffmpeg-6-libavformat-devel \
ffmpeg-6-libavutil-devel"

inherit rpm
