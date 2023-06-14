SUMMARY = "Bullet Continuous Collision Detection and Physics Library"
DESCRIPTION = "Bullet is a Collision Detection and Rigid Body Dynamics Library."
LICENSE = "Zlib"

PV = "3.17"

RPM_NAME = "libbullet3_17-3.17-1.9.aarch64.rpm"
RPM_HASH = "049bee5f7222f6f1b818c5d2c2056e394b1ba7e54cb795184d80c5b8a838ad15ff69d110e9978ae0d97efd2a43908ed500141a49166ffef36a7481d8e850a349"

RPROVIDES:${PN} += "libBullet2FileLoader.so.3.17 \
libBullet3Collision.so.3.17 \
libBullet3Common.so.3.17 \
libBullet3Dynamics.so.3.17 \
libBullet3Geometry.so.3.17 \
libBullet3OpenCL-clew.so.3.17 \
libBulletCollision.so.3.17 \
libBulletDynamics.so.3.17 \
libBulletInverseDynamics.so.3.17 \
libBulletSoftBody.so.3.17 \
libLinearMath.so.3.17 \
libbullet \
libbullet3-17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
