SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstsctp-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "10f8bc240a06ca9b72d221ab320c1a27ef3486af3d5d5f2a560a963ee1180eec3b193e6c043009f257be294bec0c85815637f61b0883f0062cf921e2256d42ea"

RPROVIDES:${PN} += "libgstsctp-1.0.so.0()(64bit) \
libgstsctp-1_0-0 \
libgstsctp-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit)"

inherit rpm
