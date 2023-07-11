SUMMARY = "Python interface to LevelDB"
DESCRIPTION = "Plyvel is a Python interface to LevelDB. \
 \
In addition to basic features like getting, putting and deleting \
data, Plyvel allows you to use write batches, database snapshots, \
very flexible iterators, prefixed databases, bloom filters, custom \
cache sizes, custom comparators."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python311-plyvel-1.5.0-1.7.aarch64.rpm"
RPM_HASH = "c38d2dd05aca734cfdb56b9d3e3373ec3b0eb0b3aae1e77dd0008a127a58eb95893db5357fa329953f90ae5fb80c3bb6f1ccbebdd7b899ffc980e0bbcf412180"

RPROVIDES:${PN} += "python3-plyvel \
python3.11dist-plyvel \
python311-plyvel \
python3dist-plyvel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libleveldb.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
