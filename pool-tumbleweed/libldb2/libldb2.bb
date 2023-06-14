SUMMARY = "An LDAP-like embedded database"
DESCRIPTION = "LDB is an LDAP-like embedded database. \
 \
This package includes the ldb2 library."
LICENSE = "LGPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "libldb2-2.7.2-1.1.aarch64.rpm"
RPM_HASH = "dc0527ef5a6a6507280728cfd3907e0b3fe45c7b4b9fef3626b948625280aeee729cd23f3281b7e3475828c789e1e58c74ac298e2761067d638e59ae89986b68"

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
