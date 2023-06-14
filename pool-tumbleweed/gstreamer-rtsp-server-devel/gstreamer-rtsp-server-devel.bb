SUMMARY = "Development files for the GStreamer-based RTSP server library"
DESCRIPTION = "Development files for the GStreamer library for building an RTSP server."
LICENSE = "LGPL-2.0-or-later"

PV = "1.22.3"

RPM_NAME = "gstreamer-rtsp-server-devel-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "980ade8d5a1b4840a3719d950fce40dde79145bc1d35cf1b394577192cedff4701cb85f405ac0020a587ead03d060b9a7e8c78bfcfc1302b195ed26b1492c7b9"

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
