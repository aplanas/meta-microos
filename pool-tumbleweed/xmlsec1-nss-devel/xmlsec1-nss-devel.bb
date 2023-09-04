SUMMARY = "NSS crypto plugin for XML Security Library"
DESCRIPTION = "Libraries, includes, etc. for developing XML Security applications with NSS."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "xmlsec1-nss-devel-1.2.37-3.1.aarch64.rpm"
RPM_HASH = "652353fd8be8d85b9e6786e2920232ea2bd70cde3e4c09d2957e99752c24f126e9c95f47900d68b2d4351eecc0c7cf188b87857e90fdb4ce856963d0345d3eaf"

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
