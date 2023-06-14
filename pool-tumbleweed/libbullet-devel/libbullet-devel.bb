SUMMARY = "Development package for bullet library"
DESCRIPTION = "This package contain all that is needed to developer or compile \
appliancation with the Bullet library."
LICENSE = "Zlib"

PV = "3.17"

RPM_NAME = "libbullet-devel-3.17-1.9.aarch64.rpm"
RPM_HASH = "02c69cdd5b8a8802c99da7fa56a5e7d0f7d2b44cb6a0f999aaa231575fd2033b697ea8adb3beb27c470ae259788c1d3efc29fb258150dce406718b4125437d73"

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
