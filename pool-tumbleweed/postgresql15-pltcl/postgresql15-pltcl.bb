SUMMARY = "PL/Tcl Procedural Language for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the PL/Tcl procedural language for PostgreSQL. \
With thie module one can use Tcl to write stored procedures, functions, \
and triggers. \
 \
PostgreSQL also offers the built-in procedural language PL/SQL which is \
included in the postgresql-server package."
LICENSE = "PostgreSQL"

PV = "15.3"

RPM_NAME = "postgresql15-pltcl-15.3-1.2.aarch64.rpm"
RPM_HASH = "321796a48a16655546690d168f04920f3ec0a85b672c779bd7f57aa1f049c362b093e0a7998896da67488affc0a56a69493d2a3232bccc1825fba575218cf54e"

RPROVIDES:${PN} += "postgresql-pltcl-implementation \
postgresql15-pltcl \
postgresql15-pltcl(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libtcl8.6.so()(64bit) \
postgresql-pltcl-noarch \
postgresql15-server \
tcl"

inherit rpm
