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

PV = "14.8"

RPM_NAME = "postgresql14-pltcl-14.8-1.2.aarch64.rpm"
RPM_HASH = "5476252f426b20afdfb3b1abcaaa5db779adcedb37b63e6956a79882854c7b9c9b7c26451d5bf3d0374e792607434651e18387ce861b943fab51a9281a5cc97f"

RPROVIDES:${PN} += "postgresql-pltcl-implementation \
postgresql14-pltcl \
postgresql14-pltcl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libtcl8.6.so()(64bit) \
postgresql-pltcl-noarch \
postgresql14-server \
tcl"

inherit rpm
