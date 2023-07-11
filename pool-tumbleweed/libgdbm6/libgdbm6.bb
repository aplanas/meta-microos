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

RPM_NAME = "libgdbm6-1.23-1.14.aarch64.rpm"
RPM_HASH = "b64d4f81c6408913315d31f6c08c5e492c28b1f575a4663937795257524e1216e1d648ede06bf594b999b256b83727b58a1dc8261c92df72c2db4fb1cea9384f"

RPROVIDES:${PN} += "gdbm \
libgdbm.so.6 \
libgdbm6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
