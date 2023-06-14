SUMMARY = "Development files for libjose"
DESCRIPTION = "The libjose-devel package contains libraries and header files for \
developing applications that use libjose."
LICENSE = "Apache-2.0"

PV = "11"

RPM_NAME = "libjose-devel-11-1.1.aarch64.rpm"
RPM_HASH = "ca620b06a12bbf1caf22d3c0f549aecae5cc84d05149a46c41fece36043650e951a15d3e22277d2821c9c3849eb7a83d43f63217828c600ca0527947d488bfb5"

RPROVIDES:${PN} += "libjose-devel \
pkgconfig-jose"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjose0 \
pkgconfig-jansson \
pkgconfig-libcrypto \
pkgconfig-zlib"

inherit rpm
