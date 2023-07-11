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

RPM_NAME = "ffmpeg-6-private-devel-6.0-2.4.aarch64.rpm"
RPM_HASH = "98a3faac08baef348910f165d47c9f32cbbd6057e7fefb05d6a9c7d7fd39c48d4f3cae057aa30405d3c86a03110651f907ce254dbcef3ec7e204a8c50a63a999"

RPROVIDES:${PN} += "ffmpeg-6-private-devel \
ffmpeg-private-devel"

RDEPENDS:${PN} += "ffmpeg-6-libavcodec-devel \
ffmpeg-6-libavformat-devel \
ffmpeg-6-libavutil-devel"

inherit rpm
