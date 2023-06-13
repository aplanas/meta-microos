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

RPM_NAME = "lmdb-0.9.30-1.1.aarch64.rpm"
RPM_HASH = "d1f50b59dc5b9cfca6542bc3a88bdd7ea8551e71bf2da676bc19500a108e667f478a79ec6e1eb3084e4697a020e14d06631fe27a526dcd5f228ec942f1d8fce9"

RPROVIDES:${PN} += "lmdb \
lmdb(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
liblmdb-0.9.30.so()(64bit)"

inherit rpm
