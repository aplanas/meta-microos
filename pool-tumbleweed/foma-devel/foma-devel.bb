SUMMARY = "Finite-state C library development files and headers"
DESCRIPTION = "Finite-state C library development files and headers for foma."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "foma-devel-0.10.0-1.3.aarch64.rpm"
RPM_HASH = "0dbdcced82c968990da3c6819c701963a47f8c2ead6f8d216de32479b6bae06be6ad90d36baef68f4f4510976a3c8733ea4d2b8201dc3b751947fcfb3e14e8e5"

RPROVIDES:${PN} += "foma-devel \
foma-devel(aarch-64) \
pkgconfig(libfoma)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfoma0"

inherit rpm
