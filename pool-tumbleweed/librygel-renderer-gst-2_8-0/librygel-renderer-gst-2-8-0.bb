SUMMARY = "Gstreamer render library for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides the renderer library of rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.4"

RPM_NAME = "librygel-renderer-gst-2_8-0-0.42.4-1.1.aarch64.rpm"
RPM_HASH = "f0fac9a402ded161be6af4fb04a72dd055fbf2ae33ed7a4843a075e6d422347a12966b2f5d42861277e7cbd15edb443bc59dafda141b7fe8351b3c70ae42db63"

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
