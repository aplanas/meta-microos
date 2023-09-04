SUMMARY = "Render library for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides the renderer library of rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.4"

RPM_NAME = "librygel-renderer-2_8-0-0.42.4-1.1.aarch64.rpm"
RPM_HASH = "b4c775eaa5cdcf0f97e6c5508ee0a2411745a7da58ca67c93134ad23aa0dd57ae51eca78155a10ea09ef52b5161e96fa83b9a329f6656e863488f4f99bcd17dc"

RPROVIDES:${PN} += "librygel-renderer-2-8-0 \
librygel-renderer-2.8.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgupnp-1.6.so.0 \
libgupnp-av-1.0.so.3 \
librygel-core-2.8.so.0 \
libsoup-3.0.so.0"

inherit rpm
