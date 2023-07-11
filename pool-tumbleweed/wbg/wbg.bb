SUMMARY = "Wallpaper application for layer-shell Wayland compositors"
DESCRIPTION = "Wbg is a wallpaper setter for Wayland compositors that implement the \
layer-shell protocol. \
 \
It takes a single argument, the image filename, which is displayed \
scaled-to-fit on all monitors."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "wbg-1.1.0-1.3.aarch64.rpm"
RPM_HASH = "b6b731cd960678c01f009c551af5c65b2a5d24b4367b85b323bb1ac2c941c443a2c6e5df35febb2addd8c997b7e6dbff95d53647e19206d3d432191864f5650c"

RPROVIDES:${PN} += "wbg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
libpixman-1.so.0 \
libpng16.so.16 \
libwayland-client.so.0 \
libwebp.so.7"

inherit rpm
