SUMMARY = "Library providing support for 'XML Signature' and 'XML Encryption' standards"
DESCRIPTION = "XML Security Library is a C library based on LibXML2  and OpenSSL. \
The library was created with a goal to support major XML security \
standards 'XML Digital Signature' and 'XML Encryption'."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "xmlsec1-1.2.37-2.3.aarch64.rpm"
RPM_HASH = "7a745c6cc560c64291cd2f852c3f538d75f7847644c83a9515013192d0bd6d015848c79c6d39634dbe8a3ea9ed40f948bf9ad13e21b3da24d29832cd5e384c01"

RPROVIDES:${PN} += "xmlsec1"

RDEPENDS:${PN} += "libc.so.6 \
libxml2.so.2 \
libxmlsec1.so.1 \
libxslt.so.1"

inherit rpm
