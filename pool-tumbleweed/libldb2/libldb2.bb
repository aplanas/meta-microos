SUMMARY = "An LDAP-like embedded database"
DESCRIPTION = "LDB is an LDAP-like embedded database. \
 \
This package includes the ldb2 library."
LICENSE = "LGPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "libldb2-2.7.2-1.1.aarch64.rpm"
RPM_HASH = "dc0527ef5a6a6507280728cfd3907e0b3fe45c7b4b9fef3626b948625280aeee729cd23f3281b7e3475828c789e1e58c74ac298e2761067d638e59ae89986b68"

RPROVIDES:${PN} += "libldb-key-value.so()(64bit) \
libldb-key-value.so(LDB_2.7.2_LDB)(64bit) \
libldb-tdb-err-map.so()(64bit) \
libldb-tdb-err-map.so(LDB_2.7.2_LDB)(64bit) \
libldb-tdb-int.so()(64bit) \
libldb-tdb-int.so(LDB_2.7.2_LDB)(64bit) \
libldb.so.2()(64bit) \
libldb.so.2(LDB_0.9.10)(64bit) \
libldb.so.2(LDB_0.9.12)(64bit) \
libldb.so.2(LDB_0.9.15)(64bit) \
libldb.so.2(LDB_0.9.16)(64bit) \
libldb.so.2(LDB_0.9.17)(64bit) \
libldb.so.2(LDB_0.9.18)(64bit) \
libldb.so.2(LDB_0.9.19)(64bit) \
libldb.so.2(LDB_0.9.20)(64bit) \
libldb.so.2(LDB_0.9.22)(64bit) \
libldb.so.2(LDB_0.9.23)(64bit) \
libldb.so.2(LDB_0.9.24)(64bit) \
libldb.so.2(LDB_1.0.0)(64bit) \
libldb.so.2(LDB_1.0.1)(64bit) \
libldb.so.2(LDB_1.0.2)(64bit) \
libldb.so.2(LDB_1.1.0)(64bit) \
libldb.so.2(LDB_1.1.1)(64bit) \
libldb.so.2(LDB_1.1.10)(64bit) \
libldb.so.2(LDB_1.1.11)(64bit) \
libldb.so.2(LDB_1.1.12)(64bit) \
libldb.so.2(LDB_1.1.13)(64bit) \
libldb.so.2(LDB_1.1.14)(64bit) \
libldb.so.2(LDB_1.1.15)(64bit) \
libldb.so.2(LDB_1.1.16)(64bit) \
libldb.so.2(LDB_1.1.17)(64bit) \
libldb.so.2(LDB_1.1.18)(64bit) \
libldb.so.2(LDB_1.1.19)(64bit) \
libldb.so.2(LDB_1.1.2)(64bit) \
libldb.so.2(LDB_1.1.20)(64bit) \
libldb.so.2(LDB_1.1.21)(64bit) \
libldb.so.2(LDB_1.1.22)(64bit) \
libldb.so.2(LDB_1.1.23)(64bit) \
libldb.so.2(LDB_1.1.24)(64bit) \
libldb.so.2(LDB_1.1.25)(64bit) \
libldb.so.2(LDB_1.1.26)(64bit) \
libldb.so.2(LDB_1.1.27)(64bit) \
libldb.so.2(LDB_1.1.28)(64bit) \
libldb.so.2(LDB_1.1.29)(64bit) \
libldb.so.2(LDB_1.1.3)(64bit) \
libldb.so.2(LDB_1.1.30)(64bit) \
libldb.so.2(LDB_1.1.31)(64bit) \
libldb.so.2(LDB_1.1.4)(64bit) \
libldb.so.2(LDB_1.1.5)(64bit) \
libldb.so.2(LDB_1.1.6)(64bit) \
libldb.so.2(LDB_1.1.7)(64bit) \
libldb.so.2(LDB_1.1.8)(64bit) \
libldb.so.2(LDB_1.1.9)(64bit) \
libldb.so.2(LDB_1.2.0)(64bit) \
libldb.so.2(LDB_1.2.1)(64bit) \
libldb.so.2(LDB_1.2.2)(64bit) \
libldb.so.2(LDB_1.2.3)(64bit) \
libldb.so.2(LDB_1.3.0)(64bit) \
libldb.so.2(LDB_1.3.1)(64bit) \
libldb.so.2(LDB_1.3.2)(64bit) \
libldb.so.2(LDB_1.4.0)(64bit) \
libldb.so.2(LDB_1.4.1)(64bit) \
libldb.so.2(LDB_1.5.0)(64bit) \
libldb.so.2(LDB_1.5.1)(64bit) \
libldb.so.2(LDB_1.5.2)(64bit) \
libldb.so.2(LDB_1.5.3)(64bit) \
libldb.so.2(LDB_1.6.0)(64bit) \
libldb.so.2(LDB_1.6.1)(64bit) \
libldb.so.2(LDB_1.6.2)(64bit) \
libldb.so.2(LDB_1.6.3)(64bit) \
libldb.so.2(LDB_2.0.0)(64bit) \
libldb.so.2(LDB_2.0.1)(64bit) \
libldb.so.2(LDB_2.0.2)(64bit) \
libldb.so.2(LDB_2.0.3)(64bit) \
libldb.so.2(LDB_2.0.4)(64bit) \
libldb.so.2(LDB_2.0.5)(64bit) \
libldb.so.2(LDB_2.1.0)(64bit) \
libldb.so.2(LDB_2.1.1)(64bit) \
libldb.so.2(LDB_2.2.0)(64bit) \
libldb.so.2(LDB_2.4.0)(64bit) \
libldb.so.2(LDB_2.4.1)(64bit) \
libldb.so.2(LDB_2.5.0)(64bit) \
libldb.so.2(LDB_2.6.0)(64bit) \
libldb.so.2(LDB_2.6.1)(64bit) \
libldb.so.2(LDB_2.7.0)(64bit) \
libldb.so.2(LDB_2.7.1)(64bit) \
libldb.so.2(LDB_2.7.2)(64bit) \
libldb2 \
libldb2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit) \
libtalloc.so.2(TALLOC_2.3.5)(64bit) \
libtdb.so.1()(64bit) \
libtdb.so.1(TDB_1.2.1)(64bit) \
libtdb.so.1(TDB_1.3.14)(64bit) \
libtevent.so.0()(64bit) \
libtevent.so.0(TEVENT_0.9.9)(64bit)"

inherit rpm