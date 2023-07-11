SUMMARY = "Gstreamer VA-API plugins"
DESCRIPTION = "gstreamer-vaapi is a collection of GStreamer plugins and helper \
libraries that allow hardware accelerated video decoding through \
VA-API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.4"

RPM_NAME = "gstreamer-plugins-vaapi-1.22.4-1.1.aarch64.rpm"
RPM_HASH = "ed38580076396b4a9646fa5d1c20047397692fad0df156456aca3da16a6a502fc087c7b7b2dcb0a5bc180fae7f1c2f8b021cc3258510adafb5a26db89f1350c8"

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
