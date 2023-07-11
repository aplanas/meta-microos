SUMMARY = "GUPnP-DLNA GStreamer meta-extraction backend"
DESCRIPTION = "GUPnP-DLNA is a collection of helpers for building DLNA media sharing \
applications using GUPnP. \
 \
This package contains the meta-data extraction based on GStreamer"
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "libgupnp-dlna-backend-gstreamer-0.12.0-1.11.aarch64.rpm"
RPM_HASH = "d3efdaeae14d1b1784038c05757360eae65fec660bb2c197d82d73d060582798e5d9446827327146d5e6e427767b0e40e38c1a63a1782522730383ee265061f4"

RPROVIDES:${PN} += "libgstreamer.so \
libgupnp-dlna-backend \
libgupnp-dlna-backend-gstreamer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgupnp-dlna-gst-2.0.so.4"

inherit rpm
