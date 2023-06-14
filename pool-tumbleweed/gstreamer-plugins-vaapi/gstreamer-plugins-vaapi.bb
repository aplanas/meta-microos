SUMMARY = "Gstreamer VA-API plugins"
DESCRIPTION = "gstreamer-vaapi is a collection of GStreamer plugins and helper \
libraries that allow hardware accelerated video decoding through \
VA-API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "gstreamer-plugins-vaapi-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "7bdb70f8a2ee34c428017dcec812f792d7401257e58eb3dcf508b5a40dd6120b1cc8f54c92a74465da3c9b93fafd99ab6557628a20a597a1a6894b2b2278f951"

RPROVIDES:${PN} += "gstreamer-plugins-vaapi \
libgstvaapi.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGL.so.1 \
libGLESv2.so.2 \
libOpenGL.so.0 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstallocators-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstcodecparsers-1.0.so.0 \
libgstgl-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libm.so.6 \
libudev.so.1 \
libva-drm.so.2 \
libva-wayland.so.2 \
libva-x11.so.2 \
libva.so.2 \
libwayland-client.so.0"

inherit rpm
