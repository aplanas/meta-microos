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

PV = "15"

RPM_NAME = "postgresql-15-2.7.noarch.rpm"
RPM_HASH = "eae3ab5fe4b18e9ea39dba34393b4e5a40695880429d9cd432da39317a5422f5e937cb1d89e040d8ae2dd961526fab17a89f6fbdbc28cd28830cda9615d52031"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql \
postgresql-noarch"

RDEPENDS:${PN} += "/bin/bash \
postgresql-implementation \
update-alternatives"

inherit rpm
