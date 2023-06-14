SUMMARY = "Wayland backend for the Video Acceleration API"
DESCRIPTION = "The libva library implements the Video Acceleration API. \
The library loads a hardware dependendent driver."
LICENSE = "MIT"

PV = "2.18.0"

RPM_NAME = "libva-wayland2-2.18.0-2.1.aarch64.rpm"
RPM_HASH = "a0b41d46905fe6cffbd80437e45d555262a8046334f5f9ab526f2dc1f5c8c302df0e2e0c2895af69c546e7ec509abd673505c9e15b6472f775be0deee8e11272"

RPROVIDES:${PN} += "libva-wayland.so.2 \
libva-wayland2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libva.so.2 \
libwayland-client.so.0"

inherit rpm
