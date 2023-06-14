SUMMARY = "Development files for libacars"
DESCRIPTION = "libacars is a library for decoding various ACARS message payloads. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libacars."
LICENSE = "MIT"

PV = "2.1.4"

RPM_NAME = "libacars2-devel-2.1.4-1.1.aarch64.rpm"
RPM_HASH = "b81f0cddbf00eb25f8f8c8038479a1cdeb20c378ee9b67bcdc8c078dd621ba5d65092df3c45f9d31c3fb8ac8df1e1a2d71dec28142594d6cfdef6a110cf58548"

RPROVIDES:${PN} += "libacars2-devel \
pkgconfig-libacars-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libacars-2-2"

inherit rpm
