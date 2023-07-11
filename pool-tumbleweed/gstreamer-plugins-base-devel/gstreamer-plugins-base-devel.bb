SUMMARY = "Include files and librs mandatory for development with gstreamer-plugins-base"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and link applications that use gstreamer-plugins-base."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "gstreamer-plugins-base-devel-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "74a5d3c6154a6525b91d1d6dd8801837779fe3164c5f43186a3dd30b2127862bd8545c6729e18959738fa9789547442cd7eaccb602b10a099f32b21c2f422c67"

RPROVIDES:${PN} += "gst-plugins-base-devel \
gstreamer-plugins-base-devel \
pkgconfig-gstreamer-allocators-1.0 \
pkgconfig-gstreamer-app-1.0 \
pkgconfig-gstreamer-audio-1.0 \
pkgconfig-gstreamer-fft-1.0 \
pkgconfig-gstreamer-gl-1.0 \
pkgconfig-gstreamer-gl-egl-1.0 \
pkgconfig-gstreamer-gl-prototypes-1.0 \
pkgconfig-gstreamer-gl-wayland-1.0 \
pkgconfig-gstreamer-gl-x11-1.0 \
pkgconfig-gstreamer-pbutils-1.0 \
pkgconfig-gstreamer-plugins-base-1.0 \
pkgconfig-gstreamer-riff-1.0 \
pkgconfig-gstreamer-rtp-1.0 \
pkgconfig-gstreamer-rtsp-1.0 \
pkgconfig-gstreamer-sdp-1.0 \
pkgconfig-gstreamer-tag-1.0 \
pkgconfig-gstreamer-video-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgstallocators-1-0-0 \
libgstapp-1-0-0 \
libgstaudio-1-0-0 \
libgstfft-1-0-0 \
libgstgl-1-0-0 \
libgstpbutils-1-0-0 \
libgstriff-1-0-0 \
libgstrtp-1-0-0 \
libgstrtsp-1-0-0 \
libgstsdp-1-0-0 \
libgsttag-1-0-0 \
libgstvideo-1-0-0 \
pkgconfig-egl \
pkgconfig-gbm \
pkgconfig-gio-2.0 \
pkgconfig-glesv2 \
pkgconfig-glx \
pkgconfig-gmodule-no-export-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-allocators-1.0 \
pkgconfig-gstreamer-audio-1.0 \
pkgconfig-gstreamer-base-1.0 \
pkgconfig-gstreamer-gl-1.0 \
pkgconfig-gstreamer-pbutils-1.0 \
pkgconfig-gstreamer-rtp-1.0 \
pkgconfig-gstreamer-sdp-1.0 \
pkgconfig-gstreamer-tag-1.0 \
pkgconfig-gstreamer-video-1.0 \
pkgconfig-gudev-1.0 \
pkgconfig-libdrm \
pkgconfig-opengl \
pkgconfig-orc-0.4 \
pkgconfig-wayland-client \
pkgconfig-wayland-cursor \
pkgconfig-wayland-egl \
pkgconfig-x11 \
pkgconfig-x11-xcb \
pkgconfig-zlib \
typelib-1-0-GstAllocators-1-0 \
typelib-1-0-GstApp-1-0 \
typelib-1-0-GstAudio-1-0 \
typelib-1-0-GstGL-1-0 \
typelib-1-0-GstGLEGL-1-0 \
typelib-1-0-GstGLWayland-1-0 \
typelib-1-0-GstGLX11-1-0 \
typelib-1-0-GstPbutils-1-0 \
typelib-1-0-GstRtp-1-0 \
typelib-1-0-GstRtsp-1-0 \
typelib-1-0-GstSdp-1-0 \
typelib-1-0-GstTag-1-0 \
typelib-1-0-GstVideo-1-0"

inherit rpm
