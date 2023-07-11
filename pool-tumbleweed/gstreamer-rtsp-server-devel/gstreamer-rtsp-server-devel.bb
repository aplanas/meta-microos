SUMMARY = "Development files for the GStreamer-based RTSP server library"
DESCRIPTION = "Development files for the GStreamer library for building an RTSP server."
LICENSE = "LGPL-2.0-or-later"

PV = "1.22.4"

RPM_NAME = "gstreamer-rtsp-server-devel-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "697bbe6b9e7f79e96178726c267d2abf7473b2b377c77b78b8e26db433118928e2e37c9eac833a8e57e537e3b5c4e3fd8b142d7beed828804ab888e052f93e2b"

RPROVIDES:${PN} += "gst-rtsp-server-devel \
gstreamer-rtsp-server-devel \
gstreamer1 \
libgstrtspclientsink.so \
pkgconfig-gstreamer-rtsp-server-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgstrtsp-1.0.so.0 \
libgstrtspserver-1-0-0 \
libgstrtspserver-1.0.so.0 \
libgstsdp-1.0.so.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-app-1.0 \
pkgconfig-gstreamer-net-1.0 \
pkgconfig-gstreamer-rtp-1.0 \
pkgconfig-gstreamer-rtsp-1.0 \
pkgconfig-gstreamer-sdp-1.0 \
typelib-1-0-GstRtspServer-1-0"

inherit rpm
