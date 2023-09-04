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

RPM_NAME = "libgdbm6-1.23-2.1.aarch64.rpm"
RPM_HASH = "9b30d64ad8ca5721c87132a21b3c59e34459ba419f375d468c22f35cede4a1e7e5ddb2c72cd6087a44eee620ff7b97c00b907665f192f620e69822ebfbf0d3ef"

RPROVIDES:${PN} += "gdbm \
libgdbm.so.6 \
libgdbm6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
