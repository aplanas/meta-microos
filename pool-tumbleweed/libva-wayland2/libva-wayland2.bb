SUMMARY = "Wayland backend for the Video Acceleration API"
DESCRIPTION = "The libva library implements the Video Acceleration API. \
The library loads a hardware dependendent driver."
LICENSE = "MIT"

PV = "2.18.0"

RPM_NAME = "libva-wayland2-2.18.0-2.2.aarch64.rpm"
RPM_HASH = "a69c975459cb057e149c9be0e9ce0d4a429696f08d12d39283c63cb607a282871343748cb15ee3f091bd057962129f34179695a03de78b14ad6d09052fa3d94f"

RPROVIDES:${PN} += "libva-wayland.so.2 \
libva-wayland2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libva.so.2 \
libwayland-client.so.0"

inherit rpm
