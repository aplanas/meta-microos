SUMMARY = "Gstreamer render library for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides the renderer library of rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "librygel-renderer-gst-2_8-0-0.42.3-1.2.aarch64.rpm"
RPM_HASH = "b26b4f713bf9ad5635a21ba3800728508613a8c4e9471d65781355b213550cf6d12e73f6d60b32b3a2a11746ed7f8707c76858843996999f7fef6f66a32ced55"

RPROVIDES:${PN} += "librygel-renderer-gst-2-8-0 \
librygel-renderer-gst-2.8.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgupnp-av-1.0.so.3 \
librygel-core-2.8.so.0 \
librygel-renderer-2.8.so.0"

inherit rpm
