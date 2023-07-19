SUMMARY = "Development files for libuuid"
DESCRIPTION = "Files to develop applications using the library to generate universally \
unique IDs (UUIDs)."
LICENSE = "BSD-3-Clause"

PV = "2.39"

RPM_NAME = "libuuid-devel-2.39-3.1.aarch64.rpm"
RPM_HASH = "7a263d8ab69bb3c4b104a4c8ea8a3caba252bf41782f3ccb6f6d956d2903a4b195f845330cd246cddafd3ee2de123f6b4bba145508a161853137671bd9ed51a1"

RPROVIDES:${PN} += "libuuid-devel \
pkgconfig-uuid"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuuid1"

inherit rpm
