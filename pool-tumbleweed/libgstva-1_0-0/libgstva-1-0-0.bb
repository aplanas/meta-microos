SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "libgstva-1_0-0-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "636573bfbff1f77b21618655807fa92fb46e76593befe1cce25262f7e117db58422639a26a060be615c247d72a3581f68c2cdda4c933c847b492af1fd4ef9329"

RPROVIDES:${PN} += "libgstva-1-0-0 \
libgstva-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstallocators-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libva-drm.so.2 \
libva.so.2"

inherit rpm
