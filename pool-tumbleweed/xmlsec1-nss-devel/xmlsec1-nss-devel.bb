SUMMARY = "NSS crypto plugin for XML Security Library"
DESCRIPTION = "Libraries, includes, etc. for developing XML Security applications with NSS."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "xmlsec1-nss-devel-1.2.37-2.2.aarch64.rpm"
RPM_HASH = "09c19dd9addc35392e885b877652d7aa25eac23e0048994d09e5610d0fa4246bfa15372d51480c6ab03d05dabd904b4541a9821f5d5a8b2d9cda1ab57f6172a9"

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
