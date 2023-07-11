SUMMARY = "Shared library for Lightning Memory-Mapped Database (LMDB)"
DESCRIPTION = "LMDB is a Btree-based database management library with an API similar \
to BerkeleyDB. The library is thread-aware and supports concurrent \
read/write access from multiple processes and threads. The DB \
structure is multi-versioned, and data pages use a copy-on-write \
strategy, which also provides resistance to corruption and eliminates \
the need for any recovery procedures. The database is exposed in a \
memory map, requiring no page cache layer of its own. \
 \
This package contains the shared library."
LICENSE = "OLDAP-2.8"

PV = "0.9.30"

RPM_NAME = "liblmdb-0_9_30-0.9.30-1.2.aarch64.rpm"
RPM_HASH = "638ac85210b37240284ed80d306e18a8d1da1a879534e6a56b7315cbc63af9cde9eb596f305f70a6c30c324b3b9b207323e3a856f8dc23cd68d94fa9f6378600"

RPROVIDES:${PN} += "liblmdb-0-9-30 \
liblmdb-0.9.30.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
