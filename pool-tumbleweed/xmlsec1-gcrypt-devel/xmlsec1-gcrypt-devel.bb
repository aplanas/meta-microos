SUMMARY = "GCrypt crypto plugin for XML Security Library"
DESCRIPTION = "Libraries, includes, etc. for developing XML Security applications with GCrypt."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "xmlsec1-gcrypt-devel-1.2.37-3.1.aarch64.rpm"
RPM_HASH = "ca87452f1fad288c65d77478794ce02d9b540c963c9021ae8039cef9ef0ef5f1335125a25d1da67a740a43d6c83f5a9045ffdeb99c5f31463651d3b1e7d3b2b3"

RPROVIDES:${PN} += "pkgconfig-xmlsec1-gcrypt \
xmlsec1-gcrypt-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxmlsec1-gcrypt1 \
pkgconfig-libxml-2.0 \
pkgconfig-libxslt \
xmlsec1-devel"

inherit rpm
