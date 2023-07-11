SUMMARY = "Finite-state C library development files and headers"
DESCRIPTION = "Finite-state C library development files and headers for foma."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "foma-devel-0.10.0-1.4.aarch64.rpm"
RPM_HASH = "7921a9dee71c156c6036c0f9d2f078ea10c9ee0e78b21b00e808e4b51d88ebff2e08a54a2b543d7a3bae44a24c33fc6695789b406367cf586c699b78822a035e"

RPROVIDES:${PN} += "foma-devel \
pkgconfig-libfoma"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfoma0"

inherit rpm
