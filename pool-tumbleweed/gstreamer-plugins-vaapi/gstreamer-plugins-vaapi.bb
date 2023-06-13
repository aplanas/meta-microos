SUMMARY = "Gstreamer VA-API plugins"
DESCRIPTION = "gstreamer-vaapi is a collection of GStreamer plugins and helper \
libraries that allow hardware accelerated video decoding through \
VA-API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "gstreamer-plugins-vaapi-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "7bdb70f8a2ee34c428017dcec812f792d7401257e58eb3dcf508b5a40dd6120b1cc8f54c92a74465da3c9b93fafd99ab6557628a20a597a1a6894b2b2278f951"

RPROVIDES:${PN} += "gstreamer-plugins-vaapi \
gstreamer-plugins-vaapi(aarch-64) \
libgstvaapi.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libEGL.so.1()(64bit) \
libGL.so.1()(64bit) \
libGLESv2.so.2()(64bit) \
libOpenGL.so.0()(64bit) \
libX11.so.6()(64bit) \
libXrandr.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstallocators-1.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstcodecparsers-1.0.so.0()(64bit) \
libgstgl-1.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libva-drm.so.2()(64bit) \
libva-wayland.so.2()(64bit) \
libva-x11.so.2()(64bit) \
libva.so.2()(64bit) \
libva.so.2(VA_API_0.33.0)(64bit) \
libwayland-client.so.0()(64bit)"

inherit rpm
