SUMMARY = "GNU dbm key/data database"
DESCRIPTION = "GNU dbm is a library of database functions that use extensible \
hashing and work similar to the standard UNIX dbm. These routines are \
provided to a programmer needing to create and manipulate a hashed \
database. \
 \
The basic use of GDBM is to store key/data pairs in a data file. Each \
key must be unique and each key is paired with only one data item. \
 \
The library provides primitives for storing key/data pairs, searching \
and retrieving the data by its key and deleting a key along with its \
data. It also supports sequential iteration over all key/data pairs in \
a database."
LICENSE = "GPL-3.0-or-later"

PV = "1.23"

RPM_NAME = "libgdbm6-1.23-1.12.aarch64.rpm"
RPM_HASH = "965670a406e5d22b9ea69d8a71374b89b4fa4e5028e70809144ebe7387d12d0bd9c5083a5acd213e06c52bd59ee93b995f36bc59435a3410c3ae514a07a9c017"

RPROVIDES:${PN} += "gdbm \
libgdbm.so.6()(64bit) \
libgdbm6 \
libgdbm6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
