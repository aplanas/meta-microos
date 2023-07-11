SUMMARY = "Development package for bullet library"
DESCRIPTION = "This package contain all that is needed to developer or compile \
appliancation with the Bullet library."
LICENSE = "Zlib"

PV = "3.17"

RPM_NAME = "libbullet-devel-3.17-1.10.aarch64.rpm"
RPM_HASH = "c6a4ecab38b45db240684d8a3ed96c23b51cc3ee57b8273788d50b0c2c7fac801b05837efb76ed46f42fcd1e2f0ce84c7283debce504857caea9a3bd16bdb468"

RPROVIDES:${PN} += "cmake-Bullet \
libbullet-devel \
pkgconfig-bullet"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libBulletFileLoader3-17 \
libBulletInverseDynamicsUtils3-17 \
libBulletWorldImporter3-17 \
libBulletXmlWorldImporter3-17 \
libConvexDecomposition3-17 \
libGIMPACTUtils3-17 \
libHACD3-17 \
libbullet3-17"

inherit rpm
