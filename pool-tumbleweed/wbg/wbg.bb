SUMMARY = "Wallpaper application for layer-shell Wayland compositors"
DESCRIPTION = "Wbg is a wallpaper setter for Wayland compositors that implement the \
layer-shell protocol. \
 \
It takes a single argument, the image filename, which is displayed \
scaled-to-fit on all monitors."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "wbg-1.1.0-1.2.aarch64.rpm"
RPM_HASH = "6db344c8cd135e2bb49d1b1be539a3a40c6ada0c3b81fc29c9e5236c67f0dc06de973181d5d704b96792edf4ca508ad4f0724bced90d2631d75f685b9c8ce69b"

RPROVIDES:${PN} += "wbg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
libpixman-1.so.0 \
libpng16.so.16 \
libwayland-client.so.0 \
libwebp.so.7"

inherit rpm
