SUMMARY = "Bullet Inverse Dynamics Utils Library"
DESCRIPTION = "Bullet is a Collision Detection and Rigid Body Dynamics Library."
LICENSE = "Zlib"

PV = "3.17"

RPM_NAME = "libBulletInverseDynamicsUtils3_17-3.17-1.9.aarch64.rpm"
RPM_HASH = "32f57172b6d7242a2a9cca93334fd5b8730666d5ba339e372f0203fa0033e9d72a3def6317039b27f1214c31f9071bf7d490eb8548d1a03cc2bcc04bf1076954"

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
