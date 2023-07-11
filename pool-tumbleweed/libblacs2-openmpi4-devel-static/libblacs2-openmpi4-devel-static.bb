SUMMARY = "Development libraries for BLACS (openmpi4)"
DESCRIPTION = "This package contains static libraries for BLACS, compiled against openmpi4."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libblacs2-openmpi4-devel-static-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "96e02131c3d0430e5c5abe5ad27820c51ebe1706f585d7068c78037b3dc6289bc885738e342818760a7520e7d88cfc8c305297232543d73ba756f51bb389e24e"

RPROVIDES:${PN} += "libblacs2-openmpi4-devel-static"

RDEPENDS:${PN} += "libblacs2-openmpi4-devel"

inherit rpm
