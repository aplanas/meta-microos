SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "libgstphotography-1_0-0-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "9f442d4e4d2a247098dacbe5fc6ab4ff9ed5ba44dc48cff038a3267da0f2462a3ba2f493c4db081a38834940678dddb8e7ba0fa792543042f10272f5bf60c998"

RPROVIDES:${PN} += "libgstphotography-1-0-0 \
libgstphotography-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
