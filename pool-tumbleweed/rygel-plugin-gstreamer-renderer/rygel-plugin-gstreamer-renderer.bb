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

RPROVIDES:${PN} += "librygel-playbin.so()(64bit) \
rygel-plugin-gstreamer-renderer \
rygel-plugin-gstreamer-renderer(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
librygel-core-2.8.so.0()(64bit) \
librygel-renderer-2.8.so.0()(64bit) \
librygel-renderer-gst-2.8.so.0()(64bit) \
rygel"

inherit rpm
