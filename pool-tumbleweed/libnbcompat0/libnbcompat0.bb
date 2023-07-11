SUMMARY = "NetBSD compatibility library"
DESCRIPTION = "This package holds the shared library of libnbcompat."
LICENSE = "BSD-4-Clause"

PV = "1.0.1"

RPM_NAME = "libnbcompat0-1.0.1-3.1.aarch64.rpm"
RPM_HASH = "a9616566d6b603cee7201d3fd8b45bbbe34b4fd79a51937fc1ba115fc198ab7fef92a7ededfc1859d59067d5eb64f963828dd73d9c6a8ebff8d6d0e9acecdc3b"

RPROVIDES:${PN} += "libnbcompat.so.0 \
libnbcompat0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
