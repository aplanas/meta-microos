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

RPM_NAME = "lmdb-devel-0.9.30-1.2.aarch64.rpm"
RPM_HASH = "fa1c40db95efe029365a0b1ebe36cc19a6d3e3866747a7289e636fda715eddf514379a464c93f186737258a78b27987cace6b768b3ea8b42af4d4b1d069c4702"

RPROVIDES:${PN} += "lmdb-devel \
pkgconfig-lmdb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblmdb-0-9-30"

inherit rpm
