SUMMARY = "Mesa Direct3D9 state tracker development package"
DESCRIPTION = "Mesa Direct3D9 state tracker development package"
LICENSE = "MIT"

PV = "23.1.6"

RPM_NAME = "Mesa-libd3d-devel-23.1.6-356.1.aarch64.rpm"
RPM_HASH = "60a926fe437712c9e0bdb4d7a8762f8950e35757b7c35bd293aef181b0dc17dda5c7b4d17b58a85163600ce5ec79ad11e1f4844f68771a6afd9620d1c847704f"

RPROVIDES:${PN} += "Mesa-libd3d-devel \
pkgconfig-d3d"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-libd3d \
pkgconfig-libdrm"

inherit rpm
