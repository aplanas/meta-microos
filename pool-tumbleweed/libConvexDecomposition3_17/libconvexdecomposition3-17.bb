SUMMARY = "Bullet Convex Decomposition Library"
DESCRIPTION = "Bullet is a Collision Detection and Rigid Body Dynamics Library."
LICENSE = "Zlib"

PV = "3.17"

RPM_NAME = "libConvexDecomposition3_17-3.17-1.10.aarch64.rpm"
RPM_HASH = "62b799ec4cfd12128f6076e5b1a1f1dd392c9e1c7372811576d3da1b2c68d017199310e2a636088fa4d48f50a93b9c6c5f09241dab39793c518eec0234bce3cd"

RPROVIDES:${PN} += "libConvexDecomposition.so.3.17 \
libConvexDecomposition3-17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLinearMath.so.3.17 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
