SUMMARY = "GStreamer renderer plugin for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides a standalone MediaRenderer plugin, based on the \
GStreamer playbin3 element."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "rygel-plugin-gstreamer-renderer-0.42.3-1.1.aarch64.rpm"
RPM_HASH = "ad866ca9ce55867929e90616ad4cbdeb0b55f5fc4a403c312df52b30928ca9bfb344a552b4cbc0765e30006711f3dad66fb4bf10f7526e528eda699032484b4e"

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
