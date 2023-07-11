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

PV = "12.15"

RPM_NAME = "postgresql12-12.15-1.5.aarch64.rpm"
RPM_HASH = "1791d8ced060eaaca4a446291f463d55223b8cf80b97da02b702968873a1584cb19907a8cb5e8e9e01b5aefb8b0403b5bc843b25dcfbe21cdbbf752bc4844ee5"

RPROVIDES:${PN} += "postgresql \
postgresql-implementation \
postgresql12"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpq.so.5 \
libpq5 \
libreadline.so.8 \
libz.so.1 \
postgresql-noarch"

inherit rpm
