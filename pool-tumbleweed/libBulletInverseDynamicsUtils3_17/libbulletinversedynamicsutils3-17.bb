SUMMARY = "Bullet Inverse Dynamics Utils Library"
DESCRIPTION = "Bullet is a Collision Detection and Rigid Body Dynamics Library."
LICENSE = "Zlib"

PV = "3.17"

RPM_NAME = "libBulletInverseDynamicsUtils3_17-3.17-1.10.aarch64.rpm"
RPM_HASH = "e7330355b81566bd407a52a736c2d52b4f41be10e4f85cb2454560fff6dc8aedc7af5684c2356079f694982987845b88c1c165e5e0ae9478998c0a3f673fd118"

RPROVIDES:${PN} += "libBulletInverseDynamicsUtils.so.3.17 \
libBulletInverseDynamicsUtils3-17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libBullet3Common.so.3.17 \
libBulletCollision.so.3.17 \
libBulletDynamics.so.3.17 \
libBulletInverseDynamics.so.3.17 \
libLinearMath.so.3.17 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
