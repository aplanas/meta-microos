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

PV = "12.16"

RPM_NAME = "postgresql12-12.16-1.1.aarch64.rpm"
RPM_HASH = "2ed72dbeb5fd1aaefcc18924bde7f2b831bd37265cfa8c207c8faa06379e30f9ee9d95644179e61058f3d4bdb62dfcf4efc86d73771aa4b102994ff13f96f55f"

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
