SUMMARY = "OpenSSL crypto plugin for XML Security Library"
DESCRIPTION = "Libraries, includes, etc. for developing XML Security applications with OpenSSL"
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "xmlsec1-openssl-devel-1.2.37-3.1.aarch64.rpm"
RPM_HASH = "148db78ef2e9b6991d53a12f7d892834a06f8dd5cadeb79faad09ae19e549932028d5f53f10c665721dd584a00300575dbc45c0e6ac86139271fcfd7ae0d20cc"

RPROVIDES:${PN} += "pkgconfig-xmlsec1-openssl \
xmlsec1-openssl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxmlsec1-openssl1 \
pkgconfig-libxml-2.0 \
pkgconfig-libxslt \
xmlsec1-devel"

inherit rpm
