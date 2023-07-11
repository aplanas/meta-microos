SUMMARY = "Bullet World Importer Library"
DESCRIPTION = "Bullet is a Collision Detection and Rigid Body Dynamics Library."
LICENSE = "Zlib"

PV = "3.17"

RPM_NAME = "libBulletWorldImporter3_17-3.17-1.10.aarch64.rpm"
RPM_HASH = "54d0f526193e26bc2b287ea590b2e9f6370e8c222e9131695c357eada34aea52fa4f9d0a1fbc7562ea29e3291f6c40240ee0252fc0ba9f1877ba4c2fabc963df"

RPROVIDES:${PN} += "libBulletWorldImporter.so.3.17 \
libBulletWorldImporter3-17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libBulletCollision.so.3.17 \
libBulletDynamics.so.3.17 \
libBulletFileLoader.so.3.17 \
libLinearMath.so.3.17 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
