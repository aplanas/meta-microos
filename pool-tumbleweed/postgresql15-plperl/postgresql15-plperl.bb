SUMMARY = "The PL/Tcl, PL/Perl, and  PL/Python procedural languages for PostgreSQL"
DESCRIPTION = "This package contains the the PL/Tcl, PL/Perl, and PL/Python procedural \
languages for the back-end.  With these modules one can use Perl, \
Python, and Tcl to write stored procedures, functions and triggers. \
 \
PostgreSQL also offers the builtin procedural language PL/SQL."
LICENSE = "PostgreSQL"

PV = "15.4"

RPM_NAME = "postgresql15-plperl-15.4-1.1.aarch64.rpm"
RPM_HASH = "b25c6cf9eb8df398c893b47838c86fc3284ce8d1ea6163eed265867f3fa87840c560fc0bd441b8408137051a6d024cb936fb186d311c7b963e8fa4096e4e2617"

RPROVIDES:${PN} += "postgresql-plperl-implementation \
postgresql15-plperl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl \
postgresql-plperl-noarch \
postgresql15-server"

inherit rpm
