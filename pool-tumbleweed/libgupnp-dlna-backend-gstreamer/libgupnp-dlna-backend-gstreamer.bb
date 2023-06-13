SUMMARY = "GUPnP-DLNA GStreamer meta-extraction backend"
DESCRIPTION = "GUPnP-DLNA is a collection of helpers for building DLNA media sharing \
applications using GUPnP. \
 \
This package contains the meta-data extraction based on GStreamer"
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "libgupnp-dlna-backend-gstreamer-0.12.0-1.10.aarch64.rpm"
RPM_HASH = "0f72ea2cefe552388dfc9efe75660fafb7a2a642e14a6912f520a61d7cd3d0bf5f9975f28dd3fab33686a08b0e4a57b0c9b9e8d2a9a903668b893e10163f483d"

RPROVIDES:${PN} += "libgstreamer.so()(64bit) \
libgupnp-dlna-backend \
libgupnp-dlna-backend-gstreamer \
libgupnp-dlna-backend-gstreamer(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgupnp-dlna-gst-2.0.so.4()(64bit)"

inherit rpm
