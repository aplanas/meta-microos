SUMMARY = "Development files for libuuid"
DESCRIPTION = "Files to develop applications using the library to generate universally \
unique IDs (UUIDs)."
LICENSE = "BSD-3-Clause"

PV = "2.39.1"

RPM_NAME = "libuuid-devel-static-2.39.1-1.1.aarch64.rpm"
RPM_HASH = "e04b2c5a1dc3bef38d54a087de12a5067f1e69eaf92d3b93fee055e6eed04d79b9c6a2de0a0ea33b87a2f4c6357e93260994118fcec31513998f5fdd7fac6c61"

RPROVIDES:${PN} += "libuuid-devel-static"

RDEPENDS:${PN} += "libuuid-devel"

inherit rpm
