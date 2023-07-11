SUMMARY = "Bullet GIMPACT Utils Library"
DESCRIPTION = "Bullet is a Collision Detection and Rigid Body Dynamics Library."
LICENSE = "Zlib"

PV = "3.17"

RPM_NAME = "libGIMPACTUtils3_17-3.17-1.10.aarch64.rpm"
RPM_HASH = "9df91ba80525c376914c7dc6096332bc17192239168309346979e9dd1e57414a03271ae47ca70ca34addb295ffc562e8d874bb25b2cde150e9faa7e8b7a2075a"

RPROVIDES:${PN} += "libGIMPACTUtils.so.3.17 \
libGIMPACTUtils3-17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libBulletCollision.so.3.17 \
libConvexDecomposition.so.3.17 \
libLinearMath.so.3.17 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
