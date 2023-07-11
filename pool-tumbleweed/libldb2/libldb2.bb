SUMMARY = "An LDAP-like embedded database"
DESCRIPTION = "LDB is an LDAP-like embedded database. \
 \
This package includes the ldb2 library."
LICENSE = "LGPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "libldb2-2.7.2-1.2.aarch64.rpm"
RPM_HASH = "6b37d0648471b8ff2ffd48c772a19b05082475ee7c38821301473577f819d5b8626905727047ff9629fd3f6f0654eb97d1353f39e3fd0ef2233c2652af75f517"

RPROVIDES:${PN} += "libldb-key-value.so \
libldb-tdb-err-map.so \
libldb-tdb-int.so \
libldb.so.2 \
libldb2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtalloc.so.2 \
libtdb.so.1 \
libtevent.so.0"

inherit rpm
