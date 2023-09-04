SUMMARY = "Library providing support for 'XML Signature' and 'XML Encryption' standards"
DESCRIPTION = "XML Security Library is a C library based on LibXML2  and OpenSSL. \
The library was created with a goal to support major XML security \
standards 'XML Digital Signature' and 'XML Encryption'."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "libxmlsec1-1-1.2.37-3.1.aarch64.rpm"
RPM_HASH = "ed75b62ff25fbb06de37a83d9be8fb9dd6fd2ec48f2ce5dd95f6be627cc7c14d77eec786b30c6083684c1aa8f1a156b8bc963cc457105063f6e47de7435dceb5"

RPROVIDES:${PN} += "libxmlsec1-1 \
libxmlsec1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libltdl.so.7 \
libxml2.so.2 \
libxslt.so.1"

inherit rpm
