SUMMARY = "GStreamer renderer plugin for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides a standalone MediaRenderer plugin, based on the \
GStreamer playbin3 element."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "rygel-plugin-gstreamer-renderer-0.42.3-2.1.aarch64.rpm"
RPM_HASH = "f6ec38d0544d7f783e4d13c37a78a797fe6315a41a4da44f5e18b1153b60f4ddfb7c8c323b140160c0700595a1ef6362224ca1a2631b55378ef9f75e7afd95e2"

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
