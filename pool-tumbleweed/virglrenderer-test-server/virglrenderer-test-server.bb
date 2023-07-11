SUMMARY = "Virgil3D renderer development files"
DESCRIPTION = "The virgil3d rendering library is a library used by \
qemu to implement 3D GPU support for the virtio GPU. \
This package contains a server to test virgl rendering \
without GL."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "virglrenderer-test-server-0.9.1-3.8.aarch64.rpm"
RPM_HASH = "4e31abc0a7faa9512d620f19955e028ef4bc44b6a2b3327dc372fe3ff3be579088e37423a8d02c8906a588c988e666110e406a324e30ccbd1754195c720c1e44"

RPROVIDES:${PN} += "virglrenderer-test-server"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libvirglrenderer.so.1 \
libvirglrenderer1"

inherit rpm
