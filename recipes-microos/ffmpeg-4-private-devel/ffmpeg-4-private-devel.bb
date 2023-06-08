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

RPM_NAME = "ffmpeg-4-private-devel-4.4.4-1.1.aarch64.rpm"
RPM_HASH = "45adbbe3647e7e264ce8a0bb2f36c12c956ee8cd094c5197e4a69d7837412a2e5de1cb34c90a63f2311281e938d9b12ce858dc5103cb09090c7e32e081cb19d8"

RPROVIDES:${PN} += "ffmpeg-4-private-devel ffmpeg-4-private-devel(aarch-64) ffmpeg-private-devel"
RDEPENDS:${PN} += "ffmpeg-4-libavcodec-devel ffmpeg-4-libavformat-devel ffmpeg-4-libavutil-devel"

inherit rpm
