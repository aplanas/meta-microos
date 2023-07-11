SUMMARY = "Bullet Continuous Collision Detection and Physics Library"
DESCRIPTION = "Bullet is a Collision Detection and Rigid Body Dynamics Library."
LICENSE = "Zlib"

PV = "3.17"

RPM_NAME = "libbullet3_17-3.17-1.10.aarch64.rpm"
RPM_HASH = "d7e3d4173ec95cc2a9a8d9a966efa58983cca9c3bc893a56df9910edd187852ec61cca5e026c1e15fdb35f1fa64214a0449cc7e8cca50d8b9d4aef688bd7f45c"

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
