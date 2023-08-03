SUMMARY = "Wayland backend for the Video Acceleration API"
DESCRIPTION = "The libva library implements the Video Acceleration API. \
The library loads a hardware dependendent driver."
LICENSE = "MIT"

PV = "2.19.0"

RPM_NAME = "libva-wayland2-2.19.0-1.1.aarch64.rpm"
RPM_HASH = "17554c6e3fac66998ec8264cf5247ef08d5bdc47d691271d4e72d0beb6471b462599b413e38af8cf249c7436baf6c36603c59de32e1ef1b17cfe0d1773676a9a"

RPROVIDES:${PN} += "libva-wayland.so.2 \
libva-wayland2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libva.so.2 \
libwayland-client.so.0"

inherit rpm
