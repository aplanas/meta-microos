SUMMARY = "Python interface to LevelDB"
DESCRIPTION = "Plyvel is a Python interface to LevelDB. \
 \
In addition to basic features like getting, putting and deleting \
data, Plyvel allows you to use write batches, database snapshots, \
very flexible iterators, prefixed databases, bloom filters, custom \
cache sizes, custom comparators."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python310-plyvel-1.5.0-1.7.aarch64.rpm"
RPM_HASH = "35ef5e588d9e766953e5d8cf50debcccb7e27cbb7c790faf0a8f7d2e7ae5060ddf133d5c4665acae48f81011da26d800e576ef74ec20a881f59f59276999ea6e"

RPROVIDES:${PN} += "python3.10dist-plyvel \
python310-plyvel \
python3dist-plyvel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libleveldb.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
