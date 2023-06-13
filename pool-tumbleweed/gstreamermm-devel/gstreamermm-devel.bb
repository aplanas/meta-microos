SUMMARY = "C++ bindings for the GStreamer streaming multimedia library"
DESCRIPTION = "gstreamermm provides C++ bindings for the GStreamer streaming multimedia \
library (http://gstreamer.freedesktop.org).  With gstreamermm it is possible to \
develop applications that work with multimedia in C++."
LICENSE = "LGPL-2.1-only"

PV = "1.10.0"

RPM_NAME = "gstreamermm-devel-1.10.0-6.9.aarch64.rpm"
RPM_HASH = "2c7fecd1947eb3f2a00a7b8dd2b9881f0af816909f93336382a654bc7b86a973d9a802d92f6fbfd4974bc943ad1a8aabffef97a276a255f3d87d5f723856069b"

RPROVIDES:${PN} += "gstreamermm-devel \
gstreamermm-devel(aarch-64) \
pkgconfig(gstreamermm-1.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstreamermm-1_0-1 \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
pkgconfig(giomm-2.4) \
pkgconfig(gstreamer-1.0) \
pkgconfig(gstreamer-allocators-1.0) \
pkgconfig(gstreamer-app-1.0) \
pkgconfig(gstreamer-audio-1.0) \
pkgconfig(gstreamer-base-1.0) \
pkgconfig(gstreamer-check-1.0) \
pkgconfig(gstreamer-controller-1.0) \
pkgconfig(gstreamer-fft-1.0) \
pkgconfig(gstreamer-net-1.0) \
pkgconfig(gstreamer-pbutils-1.0) \
pkgconfig(gstreamer-plugins-base-1.0) \
pkgconfig(gstreamer-riff-1.0) \
pkgconfig(gstreamer-rtp-1.0) \
pkgconfig(gstreamer-rtsp-1.0) \
pkgconfig(gstreamer-sdp-1.0) \
pkgconfig(gstreamer-tag-1.0) \
pkgconfig(gstreamer-video-1.0)"

inherit rpm
