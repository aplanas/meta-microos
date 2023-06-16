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

PV = "11.20"

RPM_NAME = "postgresql11-11.20-1.2.aarch64.rpm"
RPM_HASH = "286f6ad24a30bf16b320224cb17b26130064bd4ad4e65e7f52dbfa98e74a2ed4f77951260443ca8c709575ceb1c6a8b8ae877684cc0ae902f299858252a6b2ee"

RPROVIDES:${PN} += "postgresql \
postgresql-implementation \
postgresql11"

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
