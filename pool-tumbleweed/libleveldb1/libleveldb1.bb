SUMMARY = "Shared library from leveldb"
DESCRIPTION = "leveldb implements a system for maintaining a persistent key/value store. \
 \
This package holds the shared library of leveldb."
LICENSE = "BSD-3-Clause"

PV = "1.23"

RPM_NAME = "libleveldb1-1.23-2.3.aarch64.rpm"
RPM_HASH = "95761c5d2bad671e3f247423c6380ebcdb21ee3de998b214964b43efcf0bd6a0f627d28ac182fdae5321cb194e503d552ecbc85ab17feaee9d7501de0a275e00"

RPROVIDES:${PN} += "leveldb \
libleveldb.so.1()(64bit) \
libleveldb1 \
libleveldb1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libsnappy.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
