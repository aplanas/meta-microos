SUMMARY = "Qt 6 Quick3D Physics Extensions"
DESCRIPTION = "This module adds physical simulation capabilities on top of Qt Quick 3D. \
In particular, it enables rigid body simulation using simple primitives as well \
as convex- and triangle meshes and heightmaps. Physical properties such as mass, \
density, gravity and friction are customizable. This makes it possible to create \
physically correct behavior in 3D scenes without having to handcraft animations."
LICENSE = "GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-quick3dphysics-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "a5697a8cbb2c0e13992a9cfbcd9e483941c70583cb601dac9c7beb77d7f3f317e1d11d24ebc1e4f971728a01e0cdf6d80de90728bbd7f7594a33e5f3129839ab"

RPROVIDES:${PN} += "qt6-quick3dphysics"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Quick3DUtils.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
