SUMMARY = "Python interface to LevelDB"
DESCRIPTION = "Plyvel is a Python interface to LevelDB. \
 \
In addition to basic features like getting, putting and deleting \
data, Plyvel allows you to use write batches, database snapshots, \
very flexible iterators, prefixed databases, bloom filters, custom \
cache sizes, custom comparators."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python311-plyvel-1.5.0-1.5.aarch64.rpm"
RPM_HASH = "665749064e12bf0737a7ae42763c0e1eabef7e72e6b31f80f821f14889ace77d8367e7a3ca3da047ca7daba1de78d5145258957c98c8e2d771287042752656a3"

RPROVIDES:${PN} += "python3.11dist-plyvel \
python311-plyvel \
python3dist-plyvel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libleveldb.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
