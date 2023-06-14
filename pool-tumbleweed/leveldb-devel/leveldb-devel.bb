SUMMARY = "Development files for leveldb"
DESCRIPTION = "leveldb implements a system for maintaining a persistent key/value store. \
 \
This package holds the development files for leveldb."
LICENSE = "BSD-3-Clause"

PV = "1.23"

RPM_NAME = "leveldb-devel-1.23-2.3.aarch64.rpm"
RPM_HASH = "dccb1675fe0dc921ef816977c18496c86049b5cde9ead9ee582385ab8fe34a4217267dfd492220e00b1f766fd648fffbe1b7b761fc05b9837589d87573d96202"

RPROVIDES:${PN} += "cmake-leveldb \
leveldb-devel"

RDEPENDS:${PN} += "libleveldb1"

inherit rpm
