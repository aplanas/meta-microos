SUMMARY = "Gstreamer VA-API plugins"
DESCRIPTION = "gstreamer-vaapi is a collection of GStreamer plugins and helper \
libraries that allow hardware accelerated video decoding through \
VA-API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-plugins-vaapi-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "cffd9a4f4305edfbf64b2111bff45be80a700a004b8e208b99b88d3679496152b1318b2ba2e468eae140332ffdaa53242a00e46439ada481f0b1c3df42db6658"

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
