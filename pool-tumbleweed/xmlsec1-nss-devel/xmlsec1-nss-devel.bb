SUMMARY = "NSS crypto plugin for XML Security Library"
DESCRIPTION = "Libraries, includes, etc. for developing XML Security applications with NSS."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "xmlsec1-nss-devel-1.2.37-2.3.aarch64.rpm"
RPM_HASH = "d3e4f8785ac8f96884454a79fabc85f1f9b3d8d09cae439fa70e2c4f3e096ec8ae4bde47026934702e6373b728d1ed6f622284b5a5627b2114b0aef970245ee1"

RPROVIDES:${PN} += "pkgconfig-xmlsec1-nss \
xmlsec1-nss-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxmlsec1-nss1 \
mozilla-nspr-devel \
mozilla-nss-devel \
pkgconfig-libxml-2.0 \
pkgconfig-libxslt \
pkgconfig-nspr \
pkgconfig-nss \
xmlsec1-devel"

inherit rpm
