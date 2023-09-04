SUMMARY = "Shared Libraries Required for PostgreSQL Clients"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, user-defined types \
and functions. \
 \
This package provides the runtime library of the embedded SQL C \
preprocessor for PostgreSQL."
LICENSE = "PostgreSQL"

PV = "15.4"

RPM_NAME = "libecpg6-15.4-1.1.aarch64.rpm"
RPM_HASH = "5f91311d100e74fda3d2292f7baa69cf39b921a0eb063a5e137d49b483401a43c7229199877e1919a31d80423b937d4216376d100c2cecad6582285cb8e96830"

RPROVIDES:${PN} += "libecpg-compat.so.3 \
libecpg.so.6 \
libecpg6 \
libpgtypes.so.3 \
postgresql-libs-/usr/lib64/libecpg.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5"

inherit rpm
