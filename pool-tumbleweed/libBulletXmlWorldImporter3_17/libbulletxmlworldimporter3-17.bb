SUMMARY = "Bullet Xml World Importer Library"
DESCRIPTION = "Bullet is a Collision Detection and Rigid Body Dynamics Library."
LICENSE = "Zlib"

PV = "3.17"

RPM_NAME = "libBulletXmlWorldImporter3_17-3.17-1.10.aarch64.rpm"
RPM_HASH = "5f0cf93ad59826ed36acb7d6219b608468ce55eac6d6e980d35b39ffc1ab4ebcf66e7aef291217b441fb03e56d461bc5ac59d6a609bc289cb344ff1dd0060558"

RPROVIDES:${PN} += "libBulletXmlWorldImporter.so.3.17 \
libBulletXmlWorldImporter3-17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libBulletDynamics.so.3.17 \
libBulletWorldImporter.so.3.17 \
libLinearMath.so.3.17 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtinyxml2.so.9"

inherit rpm
