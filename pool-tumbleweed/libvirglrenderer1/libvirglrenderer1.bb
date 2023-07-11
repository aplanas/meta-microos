SUMMARY = "Virgil3D renderer"
DESCRIPTION = "The virgil3d rendering library is a library used by \
qemu to implement 3D GPU support for the virtio GPU."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "libvirglrenderer1-0.9.1-3.8.aarch64.rpm"
RPM_HASH = "e13270bc045ad948cb9a0a6f6df8c0b2daa55c308e8f9098db3d4b16af5c93c0a5b72019040baf39d6e33a76a9cf4f26c544e54dc0f48bcf4fb6017e44ca89c8"

RPROVIDES:${PN} += "libvirglrenderer.so.1 \
libvirglrenderer1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libdrm.so.2 \
libepoxy.so.0 \
libgbm.so.1 \
libm.so.6"

inherit rpm
