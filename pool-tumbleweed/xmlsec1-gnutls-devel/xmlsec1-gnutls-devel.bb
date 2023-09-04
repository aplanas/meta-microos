SUMMARY = "GNUTls crypto plugin for XML Security Library"
DESCRIPTION = "Libraries, includes, etc. for developing XML Security applications with GNUTls."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "xmlsec1-gnutls-devel-1.2.37-3.1.aarch64.rpm"
RPM_HASH = "a33b067e86fa104f73a161777e5813e5c212dc712686c822389a022e2cc26c420f34da5b43d5a613d3b80e4e8d9b837251c06b452ce923d49896475d58103969"

RPROVIDES:${PN} += "pkgconfig-xmlsec1-gnutls \
xmlsec1-gnutls-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnutls-devel \
libgcrypt-devel \
libxmlsec1-gnutls1 \
pkgconfig-libxml-2.0 \
pkgconfig-libxslt \
xmlsec1-devel \
xmlsec1-openssl-devel"

inherit rpm
