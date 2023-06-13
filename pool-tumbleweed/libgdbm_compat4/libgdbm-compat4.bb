SUMMARY = "GNU dbm key/data database compat wrapper"
DESCRIPTION = "GNU dbm is a library of database functions that use extensible \
hashing and work similar to the standard UNIX dbm. These routines are \
provided to a programmer needing to create and manipulate a hashed \
database. \
 \
This library is providing compatibility wrappers."
LICENSE = "GPL-3.0-or-later"

PV = "1.23"

RPM_NAME = "libgdbm_compat4-1.23-1.12.aarch64.rpm"
RPM_HASH = "64993c6c42fca2993ce0b8851ca928b3ff451eaa5640de641c89520d5d15eb3d6847cd8352d6a159e45619c255de75c02e794ae11604e4598aac66576dc73d6b"

RPROVIDES:${PN} += "libgdbm_compat.so.4()(64bit) \
libgdbm_compat4 \
libgdbm_compat4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdbm.so.6()(64bit)"

inherit rpm
