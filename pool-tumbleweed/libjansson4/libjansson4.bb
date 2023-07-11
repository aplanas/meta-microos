SUMMARY = "C library for encoding, decoding and manipulating JSON data"
DESCRIPTION = "Jansson is a C library for encoding, decoding and manipulating JSON data. \
It features: \
 * Simple and intuitive API and data model \
 * Comprehensive documentation \
 * No dependencies on other libraries \
 * Full Unicode support (UTF-8) \
 * Extensive test suite"
LICENSE = "MIT"

PV = "2.14"

RPM_NAME = "libjansson4-2.14-1.8.aarch64.rpm"
RPM_HASH = "27a360e68f89f45764a0d1ab6890f14cd4931ce2a2755e857ed2b63f42b41281b5175a789b75f19c01d64a99a5e7ffad36c5a19526cf5aca69fea0564117e38d"

RPROVIDES:${PN} += "libjansson.so.4 \
libjansson4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
