SUMMARY = "Development files for librpma"
DESCRIPTION = "Development files for librpma"
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "rpma-devel-1.2.0-1.2.aarch64.rpm"
RPM_HASH = "ca90760279f9caba0e5544433c8bef7199eb491001a3c870016f354c58b760c6804a9bd1a3f7bb6e2599ab98ee6d79810dc6d8dd0102e50697c53e4f810d5e8e"

RPROVIDES:${PN} += "cmake-librpma \
pkgconfig-librpma \
rpma-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librpma0"

inherit rpm
