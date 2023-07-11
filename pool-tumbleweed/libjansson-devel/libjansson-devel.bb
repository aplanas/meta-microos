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

RPM_NAME = "libjansson-devel-2.14-1.8.aarch64.rpm"
RPM_HASH = "6f12d22ac6960768745e2032b56fe801784d3a4cadc26e889b4d5a598ab1b9388cdbb36c399aff4dd23f9f9488676432705a0f55f87b82107967ac4e528698e0"

RPROVIDES:${PN} += "libjansson-devel \
pkgconfig-jansson"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjansson4"

inherit rpm
