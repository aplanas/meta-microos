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

RPM_NAME = "liblmdb-0_9_30-0.9.30-1.1.aarch64.rpm"
RPM_HASH = "3047c514ce061846b89dd7306f05b6ab87ac89fd51ad3e2ff96ae79424f5aad5111caf745b1246206c6d428cf23f923bb1459bb2799e3578c6e51f756b4200e3"

RPROVIDES:${PN} += "liblmdb-0.9.30.so()(64bit) \
liblmdb-0_9_30 \
liblmdb-0_9_30(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm