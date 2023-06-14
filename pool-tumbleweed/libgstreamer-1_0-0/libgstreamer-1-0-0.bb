SUMMARY = "Streaming-Media Framework Runtime"
DESCRIPTION = "GStreamer is a streaming-media framework, based on graphs of filters \
which operate on media data. Applications using this library can do \
anything from real-time sound processing to playing videos, and just \
about anything else media-related.  Its plug-in-based architecture \
means that new data types or processing capabilities can be added by \
installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstreamer-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "a23a8b9b5aa6d29c15d896844f3c71e6eff0d86741b53368c72fb28521f08115f0291ecc215a5e1e11d7f627fa1720dd589f9048eed48c21e7b39e7068517221"

RPROVIDES:${PN} += "libgstbase-1.0.so.0 \
libgstcheck-1.0.so.0 \
libgstcontroller-1.0.so.0 \
libgstnet-1.0.so.0 \
libgstreamer-1-0-0 \
libgstreamer-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libunwind.so.8"

inherit rpm
