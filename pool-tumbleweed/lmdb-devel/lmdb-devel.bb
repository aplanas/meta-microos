SUMMARY = "Development package for lmdb"
DESCRIPTION = "LMDB is a Btree-based database management library with an API similar \
to BerkeleyDB. The library is thread-aware and supports concurrent \
read/write access from multiple processes and threads. The DB \
structure is multi-versioned, and data pages use a copy-on-write \
strategy, which also provides resistance to corruption and eliminates \
the need for any recovery procedures. The database is exposed in a \
memory map, requiring no page cache layer of its own. \
 \
This package contains the files needed to compile programs that use \
the liblmdb library."
LICENSE = "OLDAP-2.8"

PV = "0.9.30"

RPM_NAME = "lmdb-devel-0.9.30-1.1.aarch64.rpm"
RPM_HASH = "d8cbb926f0034088a95abc2ad4b2c50145f165a62a3378ea042cf823a7789d0f642ff1eaae70972d05b86c0af88b759ba4b16168fee99293304444e25aa5da68"

RPROVIDES:${PN} += "lmdb-devel \
lmdb-devel(aarch-64) \
pkgconfig(lmdb)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblmdb-0_9_30"

inherit rpm
