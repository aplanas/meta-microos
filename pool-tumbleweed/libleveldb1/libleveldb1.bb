SUMMARY = "Shared library from leveldb"
DESCRIPTION = "leveldb implements a system for maintaining a persistent key/value store. \
 \
This package holds the shared library of leveldb."
LICENSE = "BSD-3-Clause"

PV = "1.23"

RPM_NAME = "libleveldb1-1.23-2.4.aarch64.rpm"
RPM_HASH = "5ecd8fc06a7b74d07243a478cc0bd5f4875e3ad296ebcfae4b17a5890747bce0b106970887fe6712e2a3f5d32427605bee04003b69f0561bb3bcc3fcc1609656"

RPROVIDES:${PN} += "leveldb \
libleveldb.so.1 \
libleveldb1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsnappy.so.1 \
libstdc++.so.6"

inherit rpm
