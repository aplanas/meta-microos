SUMMARY = "OpenSSL crypto plugin for XML Security Library"
DESCRIPTION = "Libraries, includes, etc. for developing XML Security applications with OpenSSL"
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "xmlsec1-openssl-devel-1.2.37-2.3.aarch64.rpm"
RPM_HASH = "1913f87961cf3c99ee2f38dd7f77a82a82cd1a39b99710b138105a7e2687112febd79a83eb09fce1549e8776775bba3080415cd5ce223c13e49abcb831398d49"

RPROVIDES:${PN} += "pkgconfig-xmlsec1-openssl \
xmlsec1-openssl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxmlsec1-openssl1 \
pkgconfig-libxml-2.0 \
pkgconfig-libxslt \
xmlsec1-devel"

inherit rpm
