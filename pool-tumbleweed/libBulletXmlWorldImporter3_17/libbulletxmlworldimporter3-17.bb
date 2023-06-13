SUMMARY = "Bullet Xml World Importer Library"
DESCRIPTION = "Bullet is a Collision Detection and Rigid Body Dynamics Library."
LICENSE = "Zlib"

PV = "3.17"

RPM_NAME = "libBulletXmlWorldImporter3_17-3.17-1.9.aarch64.rpm"
RPM_HASH = "7b405ed6e446f9f693bc7e40bd3e1ff59b71fe59758d9cdf728688efce9668566567c1e937df7c98377da397ad08f53924d3a1d12052031068fa52d8052ecd5e"

RPROVIDES:${PN} += "libBulletXmlWorldImporter.so.3.17()(64bit) \
libBulletXmlWorldImporter3_17 \
libBulletXmlWorldImporter3_17(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libBulletDynamics.so.3.17()(64bit) \
libBulletWorldImporter.so.3.17()(64bit) \
libLinearMath.so.3.17()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libtinyxml2.so.9()(64bit)"

inherit rpm
