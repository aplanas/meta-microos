SUMMARY = "Gstreamer render library for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides the renderer library of rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "librygel-renderer-gst-2_8-0-0.42.3-2.1.aarch64.rpm"
RPM_HASH = "144770e4beb754cf51253191324925aeeba285215d592767b4ed695ddc238a5680e224d577fff8cebff585f0962e814ca7b569db90343799dc6e628c1f83f448"

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
