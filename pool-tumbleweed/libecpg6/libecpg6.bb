SUMMARY = "Shared Libraries Required for PostgreSQL Clients"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, user-defined types \
and functions. \
 \
This package provides the runtime library of the embedded SQL C \
preprocessor for PostgreSQL."
LICENSE = "PostgreSQL"

PV = "15.3"

RPM_NAME = "libecpg6-15.3-1.2.aarch64.rpm"
RPM_HASH = "558806aadb2161498eac03b08c6601e173fdacfe6a1adf22a596983893c40dfcdf9301fb36aa7217e2b4dc88b23d3c7af6b852defe5237428a95badc96e5751e"

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
