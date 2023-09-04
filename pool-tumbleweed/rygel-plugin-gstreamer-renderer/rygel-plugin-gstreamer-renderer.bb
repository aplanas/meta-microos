SUMMARY = "GStreamer renderer plugin for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides a standalone MediaRenderer plugin, based on the \
GStreamer playbin3 element."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.4"

RPM_NAME = "rygel-plugin-gstreamer-renderer-0.42.4-1.1.aarch64.rpm"
RPM_HASH = "9116fcdcb6ae8b10b0d5088bef26439f319a057c4f242b3d4305d90f261efa65573d0ef18f42bb5659f9119e15de66f15ce92065e0720b74fb77b54583076fe2"

RPROVIDES:${PN} += "librygel-playbin.so \
rygel-plugin-gstreamer-renderer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
librygel-core-2.8.so.0 \
librygel-renderer-2.8.so.0 \
librygel-renderer-gst-2.8.so.0 \
rygel"

inherit rpm
