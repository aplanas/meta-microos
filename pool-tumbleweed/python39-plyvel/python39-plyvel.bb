SUMMARY = "Python interface to LevelDB"
DESCRIPTION = "Plyvel is a Python interface to LevelDB. \
 \
In addition to basic features like getting, putting and deleting \
data, Plyvel allows you to use write batches, database snapshots, \
very flexible iterators, prefixed databases, bloom filters, custom \
cache sizes, custom comparators."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python39-plyvel-1.5.0-1.7.aarch64.rpm"
RPM_HASH = "cc52d860d65679131d5092161e7e38e5efb343f75f317c2ce6de6800330a48da083eb5b31197baa07aa48700de3529ccd633c84f2d9235828f6b0de4d739e98e"

RPROVIDES:${PN} += "python3.9dist-plyvel \
python39-plyvel \
python3dist-plyvel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libleveldb.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
