SUMMARY = "Virgil3D renderer development files"
DESCRIPTION = "The virgil3d rendering library is a library used by \
qemu to implement 3D GPU support for the virtio GPU. \
This package contains the virgil3d renderer development \
files."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "virglrenderer-devel-0.9.1-3.7.aarch64.rpm"
RPM_HASH = "a140b3731f08c4196356999d6404ffd626cacd5f9d364686b9f34bfd3639c5ec3d1ca9b97be82c5ae2a215673e2d6e9224135688af28d4b555c35efcfc903d99"

RPROVIDES:${PN} += "pkgconfig(virglrenderer) \
virglrenderer-devel \
virglrenderer-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvirglrenderer1"

inherit rpm
