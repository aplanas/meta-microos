SUMMARY = "Bullet Xml World Importer Library"
DESCRIPTION = "Bullet is a Collision Detection and Rigid Body Dynamics Library."
LICENSE = "Zlib"

PV = "3.17"

RPM_NAME = "libBulletXmlWorldImporter3_17-3.17-1.9.aarch64.rpm"
RPM_HASH = "7b405ed6e446f9f693bc7e40bd3e1ff59b71fe59758d9cdf728688efce9668566567c1e937df7c98377da397ad08f53924d3a1d12052031068fa52d8052ecd5e"

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
