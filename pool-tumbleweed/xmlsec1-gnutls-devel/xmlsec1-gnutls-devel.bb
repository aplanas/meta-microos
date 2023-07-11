SUMMARY = "GNUTls crypto plugin for XML Security Library"
DESCRIPTION = "Libraries, includes, etc. for developing XML Security applications with GNUTls."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "xmlsec1-gnutls-devel-1.2.37-2.3.aarch64.rpm"
RPM_HASH = "07dbd0fcd920fa67f0c71864b9820b719622701682a414487651f44946d98e3e244521b4f3c50dc506bf5bed725ade427e5f06e771a241f4947f70e31a1ede16"

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
