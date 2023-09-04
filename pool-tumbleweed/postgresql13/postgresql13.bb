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

PV = "13.12"

RPM_NAME = "postgresql13-13.12-1.1.aarch64.rpm"
RPM_HASH = "7f06e9256cbcc6b5ec59d74ff474f05760616b9b6db9254a0b569bf9386843865763b42ad2b408a139c0471e6856421f9219503fa3b54a34344956e7c2e12c93"

RPROVIDES:${PN} += "postgresql \
postgresql-implementation \
postgresql13"

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
