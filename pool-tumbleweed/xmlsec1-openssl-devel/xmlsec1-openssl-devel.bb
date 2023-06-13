SUMMARY = "OpenSSL crypto plugin for XML Security Library"
DESCRIPTION = "Libraries, includes, etc. for developing XML Security applications with OpenSSL"
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "xmlsec1-openssl-devel-1.2.37-2.2.aarch64.rpm"
RPM_HASH = "278d79b11f22c797b1f303e81c861156d14adaf56bb499217186aa3ee1870948689742ed56923d4219c9cb14b159666421126088de19a42b73ff3184b675ce3b"

RPROVIDES:${PN} += "pkgconfig(xmlsec1-openssl) \
xmlsec1-openssl-devel \
xmlsec1-openssl-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxmlsec1-openssl1 \
pkgconfig(libxml-2.0) \
pkgconfig(libxslt) \
xmlsec1-devel"

inherit rpm
