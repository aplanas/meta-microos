SUMMARY = "Include files and librs mandatory for development with gstreamer-plugins-base"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and link applications that use gstreamer-plugins-base."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "gstreamer-plugins-base-devel-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "edbe572117e48338a956d69cccbb96799420077aa255039ce3db146445c71fa63f9829075fb91c2230c645f110c18d496b849332fe9f54af8f299ee0e0cb22b3"

RPROVIDES:${PN} += "gst-plugins-base-devel \
gstreamer-plugins-base-devel \
gstreamer-plugins-base-devel(aarch-64) \
pkgconfig(gstreamer-allocators-1.0) \
pkgconfig(gstreamer-app-1.0) \
pkgconfig(gstreamer-audio-1.0) \
pkgconfig(gstreamer-fft-1.0) \
pkgconfig(gstreamer-gl-1.0) \
pkgconfig(gstreamer-gl-egl-1.0) \
pkgconfig(gstreamer-gl-prototypes-1.0) \
pkgconfig(gstreamer-gl-wayland-1.0) \
pkgconfig(gstreamer-gl-x11-1.0) \
pkgconfig(gstreamer-pbutils-1.0) \
pkgconfig(gstreamer-plugins-base-1.0) \
pkgconfig(gstreamer-riff-1.0) \
pkgconfig(gstreamer-rtp-1.0) \
pkgconfig(gstreamer-rtsp-1.0) \
pkgconfig(gstreamer-sdp-1.0) \
pkgconfig(gstreamer-tag-1.0) \
pkgconfig(gstreamer-video-1.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgstallocators-1_0-0 \
libgstapp-1_0-0 \
libgstaudio-1_0-0 \
libgstfft-1_0-0 \
libgstgl-1_0-0 \
libgstpbutils-1_0-0 \
libgstriff-1_0-0 \
libgstrtp-1_0-0 \
libgstrtsp-1_0-0 \
libgstsdp-1_0-0 \
libgsttag-1_0-0 \
libgstvideo-1_0-0 \
pkgconfig(egl) \
pkgconfig(gbm) \
pkgconfig(gio-2.0) \
pkgconfig(glesv2) \
pkgconfig(glx) \
pkgconfig(gmodule-no-export-2.0) \
pkgconfig(gstreamer-1.0) \
pkgconfig(gstreamer-allocators-1.0) \
pkgconfig(gstreamer-audio-1.0) \
pkgconfig(gstreamer-base-1.0) \
pkgconfig(gstreamer-gl-1.0) \
pkgconfig(gstreamer-pbutils-1.0) \
pkgconfig(gstreamer-rtp-1.0) \
pkgconfig(gstreamer-sdp-1.0) \
pkgconfig(gstreamer-tag-1.0) \
pkgconfig(gstreamer-video-1.0) \
pkgconfig(gudev-1.0) \
pkgconfig(libdrm) \
pkgconfig(opengl) \
pkgconfig(orc-0.4) \
pkgconfig(wayland-client) \
pkgconfig(wayland-cursor) \
pkgconfig(wayland-egl) \
pkgconfig(x11) \
pkgconfig(x11-xcb) \
pkgconfig(zlib) \
typelib-1_0-GstAllocators-1_0 \
typelib-1_0-GstApp-1_0 \
typelib-1_0-GstAudio-1_0 \
typelib-1_0-GstGL-1_0 \
typelib-1_0-GstGLEGL-1_0 \
typelib-1_0-GstGLWayland-1_0 \
typelib-1_0-GstGLX11-1_0 \
typelib-1_0-GstPbutils-1_0 \
typelib-1_0-GstRtp-1_0 \
typelib-1_0-GstRtsp-1_0 \
typelib-1_0-GstSdp-1_0 \
typelib-1_0-GstTag-1_0 \
typelib-1_0-GstVideo-1_0"

inherit rpm
