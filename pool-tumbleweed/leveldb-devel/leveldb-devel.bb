SUMMARY = "Development files for leveldb"
DESCRIPTION = "leveldb implements a system for maintaining a persistent key/value store. \
 \
This package holds the development files for leveldb."
LICENSE = "BSD-3-Clause"

PV = "1.23"

RPM_NAME = "leveldb-devel-1.23-2.4.aarch64.rpm"
RPM_HASH = "804d99806d3d19a8d599fd0c5dda5dd25050d6a91b999713d467819f65ac7fa9f85f76360b4806b3f234e85179d707d3828c081d4af25bcb879e6cd74b7237e1"

RPROVIDES:${PN} += "cmake-leveldb \
leveldb-devel"

RDEPENDS:${PN} += "libleveldb1"

inherit rpm
