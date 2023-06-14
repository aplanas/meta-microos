SUMMARY = "Image viewer for X11/Wayland"
DESCRIPTION = "imv is a command line image viewer intended for use with tiling window managers."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "4.4.0"

RPM_NAME = "imv-4.4.0-1.4.aarch64.rpm"
RPM_HASH = "b85af39c1a1aa5f6f489f180bfad2707426b0a142457daea8f2b624a696d8f0163c45b96f5f3f570db3936d76d41cde0cd8e3305b9d4d351abfba2a54e95cef4"

RPROVIDES:${PN} += "imv"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGL.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libfreeimage.so.3 \
libgobject-2.0.so.0 \
libheif.so.1 \
libicuuc.so.73 \
libinih.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
librsvg-2.so.2 \
libtiff.so.6 \
libturbojpeg.so.0 \
libwayland-client.so.0 \
libwayland-egl.so.1 \
libxcb.so.1 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0"

inherit rpm
