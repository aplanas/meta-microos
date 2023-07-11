SUMMARY = "Libraries, includes for XML Signatures/Encryption"
DESCRIPTION = "Libraries, includes, etc. you can use to develop applications with XML Digital \
Signatures and XML Encryption support."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "xmlsec1-devel-1.2.37-2.3.aarch64.rpm"
RPM_HASH = "745ae30a96800be4bcc7034c156cd6eef87ce05868a8922b565929c827fee45dbc9dd3ef685237376f92a6d7e5e213a0193b57e0d7dfa7a01dfbfff045dc0cfe"

RPROVIDES:${PN} += "pkgconfig-xmlsec1 \
xmlsec1-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libxml2-devel \
libxmlsec1-1 \
libxslt-devel \
openssl-devel \
pkgconfig-libxml-2.0 \
pkgconfig-libxslt \
pkgconfig-zlib"

inherit rpm
