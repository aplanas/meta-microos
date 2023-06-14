SUMMARY = "C++ bindings for the GStreamer streaming multimedia library"
DESCRIPTION = "gstreamermm provides C++ bindings for the GStreamer streaming multimedia \
library (http://gstreamer.freedesktop.org).  With gstreamermm it is possible to \
develop applications that work with multimedia in C++."
LICENSE = "LGPL-2.1-only"

PV = "1.10.0"

RPM_NAME = "gstreamermm-devel-1.10.0-6.9.aarch64.rpm"
RPM_HASH = "2c7fecd1947eb3f2a00a7b8dd2b9881f0af816909f93336382a654bc7b86a973d9a802d92f6fbfd4974bc943ad1a8aabffef97a276a255f3d87d5f723856069b"

RPROVIDES:${PN} += "gstreamermm-devel \
pkgconfig-gstreamermm-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgstreamermm-1-0-1 \
libstdc++.so.6 \
pkgconfig-giomm-2.4 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-allocators-1.0 \
pkgconfig-gstreamer-app-1.0 \
pkgconfig-gstreamer-audio-1.0 \
pkgconfig-gstreamer-base-1.0 \
pkgconfig-gstreamer-check-1.0 \
pkgconfig-gstreamer-controller-1.0 \
pkgconfig-gstreamer-fft-1.0 \
pkgconfig-gstreamer-net-1.0 \
pkgconfig-gstreamer-pbutils-1.0 \
pkgconfig-gstreamer-plugins-base-1.0 \
pkgconfig-gstreamer-riff-1.0 \
pkgconfig-gstreamer-rtp-1.0 \
pkgconfig-gstreamer-rtsp-1.0 \
pkgconfig-gstreamer-sdp-1.0 \
pkgconfig-gstreamer-tag-1.0 \
pkgconfig-gstreamer-video-1.0"

inherit rpm
