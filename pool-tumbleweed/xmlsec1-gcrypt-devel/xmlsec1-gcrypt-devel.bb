SUMMARY = "GCrypt crypto plugin for XML Security Library"
DESCRIPTION = "Libraries, includes, etc. for developing XML Security applications with GCrypt."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "xmlsec1-gcrypt-devel-1.2.37-2.3.aarch64.rpm"
RPM_HASH = "f525e9012f63295b6d3b71ac3d68f9f1c9e32f7f034bc9620d0378a155684f3481ddb0322ce250f7b0f387942329b52c757f74219372c2e7e558d0d0bbbc4e12"

RPROVIDES:${PN} += "pkgconfig-xmlsec1-gcrypt \
xmlsec1-gcrypt-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxmlsec1-gcrypt1 \
pkgconfig-libxml-2.0 \
pkgconfig-libxslt \
xmlsec1-devel"

inherit rpm
