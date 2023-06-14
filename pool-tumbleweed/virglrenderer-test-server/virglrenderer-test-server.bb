SUMMARY = "Virgil3D renderer development files"
DESCRIPTION = "The virgil3d rendering library is a library used by \
qemu to implement 3D GPU support for the virtio GPU. \
This package contains a server to test virgl rendering \
without GL."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "virglrenderer-test-server-0.9.1-3.7.aarch64.rpm"
RPM_HASH = "c2f77da15c280bbf410f29d6b3ca4cafeeff79543544919f4924ef4a6535abc84ce1e3e140105cedffa9299abf4884888904d9abc2338fefc2da381aabdf2e4c"

RPROVIDES:${PN} += "virglrenderer-test-server"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libvirglrenderer.so.1 \
libvirglrenderer1"

inherit rpm
