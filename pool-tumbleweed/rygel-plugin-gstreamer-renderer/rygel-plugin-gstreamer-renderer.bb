SUMMARY = "GStreamer renderer plugin for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides a standalone MediaRenderer plugin, based on the \
GStreamer playbin3 element."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "rygel-plugin-gstreamer-renderer-0.42.3-1.2.aarch64.rpm"
RPM_HASH = "6798d942227442675fdd743cd732a3f3d7193e3214552b4729384fb063e56a88bda540e60abee3b68ac71607d9d0ecf89713948986f3c829541941b3d5bfb466"

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
