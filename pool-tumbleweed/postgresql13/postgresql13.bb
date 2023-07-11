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

PV = "13.11"

RPM_NAME = "postgresql13-13.11-1.5.aarch64.rpm"
RPM_HASH = "6efb9d12e47335112c5ab03f844638d3a7cc0a60b7c069518661aa7507f2b4317ffda819f3368617bb404a05b2d81b17ee274effc9c2bcfbb26dcacde0d27311"

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
