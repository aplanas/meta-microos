SUMMARY = "Basic Clients and Utilities for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the basic utility and client programs necessary \
to maintain and work with local or remote PostgreSQL databases as well \
as manual pages for the SQL commands that PostgreSQL supports. Full \
HTML documentation for PostgreSQL can be found in the postgresql-docs \
package."
LICENSE = "PostgreSQL"

PV = "14.8"

RPM_NAME = "postgresql14-14.8-1.5.aarch64.rpm"
RPM_HASH = "dd69e64172462ee4f33d1ddbd7379d0103a076a4bf50d0e918a005c15c338a6c80c54a9c7640ee87cc62abfe2b8e75f492013faae995c7407bf016f0a62ad257"

RPROVIDES:${PN} += "postgresql \
postgresql-implementation \
postgresql14"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libpq.so.5 \
libpq5 \
libreadline.so.8 \
libz.so.1 \
postgresql-noarch"

inherit rpm
