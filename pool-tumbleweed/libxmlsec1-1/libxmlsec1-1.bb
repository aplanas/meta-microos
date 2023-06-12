SUMMARY = "Library providing support for 'XML Signature' and 'XML Encryption' standards"
DESCRIPTION = "XML Security Library is a C library based on LibXML2  and OpenSSL. \
The library was created with a goal to support major XML security \
standards 'XML Digital Signature' and 'XML Encryption'."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "libxmlsec1-1-1.2.37-2.2.aarch64.rpm"
RPM_HASH = "3506a69da8b3846fb5f5b5c45f5ef994bad586338197c9e658069e742ca4fbd214d150b9d9ad34482861a8d984e86599e5f6069cbc71bdf6f8a6215b58fe49a8"

RPROVIDES:${PN} += "libxmlsec1-1 \
libxmlsec1-1(aarch-64) \
libxmlsec1.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.17)(64bit) \
libltdl.so.7()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.12)(64bit) \
libxml2.so.2(LIBXML2_2.6.2)(64bit) \
libxslt.so.1()(64bit) \
libxslt.so.1(LIBXML2_1.0.11)(64bit) \
libxslt.so.1(LIBXML2_1.0.22)(64bit)"

inherit rpm
