SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstinsertbin-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "bf7484d0c701662dd6b76dca9d077ac14860203e6abd48f17ba67e9f16e48c25e84d00e8ec937fba51ebf4eacf75a69aa071ed56771b2aa5dd9184a3c8c77125"

RPROVIDES:${PN} += "libgstinsertbin-1.0.so.0()(64bit) \
libgstinsertbin-1_0-0 \
libgstinsertbin-1_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit)"

inherit rpm
