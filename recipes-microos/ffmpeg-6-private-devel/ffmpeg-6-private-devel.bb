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

RPM_NAME = "ffmpeg-6-private-devel-6.0-2.1.aarch64.rpm"
RPM_HASH = "9ce2f96532eb3bb8888c5ba072c10dae31c75a9d62cfcb55fc2db7f4465f3a5c715a1b584b93a57abece33394b149bbdde7ec81d1590a01a838e7bc9abc6929e"

RPROVIDES:${PN} += "ffmpeg-6-private-devel ffmpeg-6-private-devel(aarch-64) ffmpeg-private-devel"
RDEPENDS:${PN} += "ffmpeg-6-libavcodec-devel ffmpeg-6-libavformat-devel ffmpeg-6-libavutil-devel"

inherit rpm
