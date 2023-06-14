SUMMARY = "Library providing support for 'XML Signature' and 'XML Encryption' standards"
DESCRIPTION = "XML Security Library is a C library based on LibXML2  and OpenSSL. \
The library was created with a goal to support major XML security \
standards 'XML Digital Signature' and 'XML Encryption'."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "libxmlsec1-1-1.2.37-2.2.aarch64.rpm"
RPM_HASH = "3506a69da8b3846fb5f5b5c45f5ef994bad586338197c9e658069e742ca4fbd214d150b9d9ad34482861a8d984e86599e5f6069cbc71bdf6f8a6215b58fe49a8"

RPROVIDES:${PN} += "libxmlsec1-1 \
libxmlsec1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libltdl.so.7 \
libxml2.so.2 \
libxslt.so.1"

inherit rpm
