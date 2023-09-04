SUMMARY = "GNU dbm key/data database compat wrapper"
DESCRIPTION = "GNU dbm is a library of database functions that use extensible \
hashing and work similar to the standard UNIX dbm. These routines are \
provided to a programmer needing to create and manipulate a hashed \
database. \
 \
This library is providing compatibility wrappers."
LICENSE = "GPL-3.0-or-later"

PV = "1.23"

RPM_NAME = "libgdbm_compat4-1.23-2.1.aarch64.rpm"
RPM_HASH = "ac5a21c8d2b95333a79481e32979642838b568a5c599f4e64bfbb8280f5289c70b306b5ad385417342155e106497678f28a4219c2aecc8519536af12267ea37f"

RPROVIDES:${PN} += "libgdbm-compat.so.4 \
libgdbm-compat4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm.so.6"

inherit rpm
