SUMMARY = "Virgil3D renderer development files"
DESCRIPTION = "The virgil3d rendering library is a library used by \
qemu to implement 3D GPU support for the virtio GPU. \
This package contains the virgil3d renderer development \
files."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "virglrenderer-devel-0.9.1-3.8.aarch64.rpm"
RPM_HASH = "df8c3418f4088435e38b02916cb8d10c0f821e1ac09fb4002d403b09d63bacf450a9b8b36baf9c2f132cef4d5f659dd6592dc12e47b3c4e3a66a524981156229"

RPROVIDES:${PN} += "pkgconfig-virglrenderer \
virglrenderer-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvirglrenderer1"

inherit rpm
