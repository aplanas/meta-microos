SUMMARY = "Development files for statically link leveldb"
DESCRIPTION = "leveldb implements a system for maintaining a persistent key/value store. \
 \
This package holds the development files for statically linking leveldb."
LICENSE = "BSD-3-Clause"

PV = "1.23"

RPM_NAME = "leveldb-devel-static-1.23-2.4.aarch64.rpm"
RPM_HASH = "2cc3a18b156708e50c49bd730aad1ace1eab41180c02a9417739f08f543a5e2cd3ef1b1645d17b0dd5b80477d3945fa2beba2fece334a3f495f07be7b63c78be"

RPROVIDES:${PN} += "leveldb-devel-static"

RDEPENDS:${PN} += "leveldb-devel"

inherit rpm
