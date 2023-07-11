SUMMARY = "GNU dbm key/data database compat wrapper"
DESCRIPTION = "GNU dbm is a library of database functions that use extensible \
hashing and work similar to the standard UNIX dbm. These routines are \
provided to a programmer needing to create and manipulate a hashed \
database. \
 \
This library is providing compatibility wrappers."
LICENSE = "GPL-3.0-or-later"

PV = "1.23"

RPM_NAME = "libgdbm_compat4-1.23-1.14.aarch64.rpm"
RPM_HASH = "8f42772b41e9175733097f999d1416750e292c3152e98c8e9dd602ddaabd18c22e50c9a410774b4cb200e43fb921163d04395000684eab56bc0f7ef57ccf5868"

RPROVIDES:${PN} += "libgdbm-compat.so.4 \
libgdbm-compat4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm.so.6"

inherit rpm
