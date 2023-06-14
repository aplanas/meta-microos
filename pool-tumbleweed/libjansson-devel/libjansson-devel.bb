SUMMARY = "Development files for libjansson"
DESCRIPTION = "Jansson is a C library for encoding, decoding and manipulating JSON data. \
It features: \
 * Simple and intuitive API and data model \
 * Comprehensive documentation \
 * No dependencies on other libraries \
 * Full Unicode support (UTF-8) \
 * Extensive test suite"
LICENSE = "MIT"

PV = "2.14"

RPM_NAME = "libjansson-devel-2.14-1.7.aarch64.rpm"
RPM_HASH = "e53b95bd9f67b1a9364f9a2e6bd8465f541e73a9a22561a097b23bbea6fb7cdef06ebc5de3bc5d8c68bc5367beb2fd8fa11c6994ecda63bccacc95eed1bb7ed1"

RPROVIDES:${PN} += "libjansson-devel \
pkgconfig-jansson"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjansson4"

inherit rpm
