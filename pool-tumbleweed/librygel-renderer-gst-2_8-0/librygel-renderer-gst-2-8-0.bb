SUMMARY = "Gstreamer render library for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides the renderer library of rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "librygel-renderer-gst-2_8-0-0.42.3-1.1.aarch64.rpm"
RPM_HASH = "03349cf8e4e7b1df99008e7b7f0ac767e6b92d5663852a81b16225c4a1165e51d0b9441093bf93361ad2ddd0b37719a4559accec294b200601cff4085678c3ff"

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
