SUMMARY = "Lightning Memory-Mapped Database Manager"
DESCRIPTION = "LMDB is a Btree-based database management library with an API similar \
to BerkeleyDB. The library is thread-aware and supports concurrent \
read/write access from multiple processes and threads. The DB \
structure is multi-versioned, and data pages use a copy-on-write \
strategy, which also provides resistance to corruption and eliminates \
the need for any recovery procedures. The database is exposed in a \
memory map, requiring no page cache layer of its own."
LICENSE = "OLDAP-2.8"

PV = "0.9.30"

RPM_NAME = "lmdb-0.9.30-1.2.aarch64.rpm"
RPM_HASH = "b16e371b66ae0119e00157512247a7ee24d8cebfb3b428ec8e875b34dc5efecb9417a99a2492ba400b34b831da2e05cda413c35d1586bece2055a3745158ea8b"

RPROVIDES:${PN} += "lmdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblmdb-0.9.30.so"

inherit rpm
