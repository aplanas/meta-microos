SUMMARY = "Qt 6 Quick3D Physics Extensions"
DESCRIPTION = "This module adds physical simulation capabilities on top of Qt Quick 3D. \
In particular, it enables rigid body simulation using simple primitives as well \
as convex- and triangle meshes and heightmaps. Physical properties such as mass, \
density, gravity and friction are customizable. This makes it possible to create \
physically correct behavior in 3D scenes without having to handcraft animations."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dphysics-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "2360175ee905785193a300b61092180119e72392330c4339a425c43f4cf87aedd9cc174a6f71c3f80f7ecac6cb023694d083287b542cc451dada6aa216650015"

RPROVIDES:${PN} += "qt6-quick3dphysics"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Quick3DUtils.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
