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

RPM_NAME = "libecpg6-15.3-1.5.aarch64.rpm"
RPM_HASH = "af66709227a6a818eecedbdf8417e9069108cfd300113175b94f35108d7868d2408045a14a753a036e9b7852a1c797716350bc0563f7d2a29136c9284d87ad47"

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
