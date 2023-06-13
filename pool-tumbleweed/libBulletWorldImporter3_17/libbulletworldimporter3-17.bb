SUMMARY = "Bullet World Importer Library"
DESCRIPTION = "Bullet is a Collision Detection and Rigid Body Dynamics Library."
LICENSE = "Zlib"

PV = "3.17"

RPM_NAME = "libBulletWorldImporter3_17-3.17-1.9.aarch64.rpm"
RPM_HASH = "30b883f3d6d1d8061e69f30f0a3ff3614c5918467531f62c8f8998db3650eba2c892e6f193c24e1c86335982abd9136708aa6bac781153fb87aab3e750481195"

RPROVIDES:${PN} += "libBulletWorldImporter.so.3.17()(64bit) \
libBulletWorldImporter3_17 \
libBulletWorldImporter3_17(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libBulletCollision.so.3.17()(64bit) \
libBulletDynamics.so.3.17()(64bit) \
libBulletFileLoader.so.3.17()(64bit) \
libLinearMath.so.3.17()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
