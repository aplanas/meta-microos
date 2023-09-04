SUMMARY = "Libraries, includes for XML Signatures/Encryption"
DESCRIPTION = "Libraries, includes, etc. you can use to develop applications with XML Digital \
Signatures and XML Encryption support."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "xmlsec1-devel-1.2.37-3.1.aarch64.rpm"
RPM_HASH = "a1c2814d570e87ee88a861212109f9633865b834724eb35da962bb4da8be5d0f297ae57df8201dba1d957197fc894225e3492652cfb5e1ac5603831d23ec5527"

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
