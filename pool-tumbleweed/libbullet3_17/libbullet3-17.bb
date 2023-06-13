SUMMARY = "Bullet Continuous Collision Detection and Physics Library"
DESCRIPTION = "Bullet is a Collision Detection and Rigid Body Dynamics Library."
LICENSE = "Zlib"

PV = "3.17"

RPM_NAME = "libbullet3_17-3.17-1.9.aarch64.rpm"
RPM_HASH = "049bee5f7222f6f1b818c5d2c2056e394b1ba7e54cb795184d80c5b8a838ad15ff69d110e9978ae0d97efd2a43908ed500141a49166ffef36a7481d8e850a349"

RPROVIDES:${PN} += "libBullet2FileLoader.so.3.17()(64bit) \
libBullet3Collision.so.3.17()(64bit) \
libBullet3Common.so.3.17()(64bit) \
libBullet3Dynamics.so.3.17()(64bit) \
libBullet3Geometry.so.3.17()(64bit) \
libBullet3OpenCL_clew.so.3.17()(64bit) \
libBulletCollision.so.3.17()(64bit) \
libBulletDynamics.so.3.17()(64bit) \
libBulletInverseDynamics.so.3.17()(64bit) \
libBulletSoftBody.so.3.17()(64bit) \
libLinearMath.so.3.17()(64bit) \
libbullet \
libbullet3_17 \
libbullet3_17(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
