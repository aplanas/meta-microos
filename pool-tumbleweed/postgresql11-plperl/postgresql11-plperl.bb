SUMMARY = "The PL/Tcl, PL/Perl, and  PL/Python procedural languages for PostgreSQL"
DESCRIPTION = "This package contains the the PL/Tcl, PL/Perl, and PL/Python procedural \
languages for the back-end.  With these modules one can use Perl, \
Python, and Tcl to write stored procedures, functions and triggers. \
 \
PostgreSQL also offers the builtin procedural language PL/SQL."
LICENSE = "PostgreSQL"

PV = "11.21"

RPM_NAME = "postgresql11-plperl-11.21-1.1.aarch64.rpm"
RPM_HASH = "1b73e2fcb2375148ae2f3de1a0f02e9eb05a18dee55e4c3636d24013101d3c06941310bf094f64eb6efc25ed8855f3b705c7195febfc62211e3b339dd30fdfb4"

RPROVIDES:${PN} += "postgresql-plperl-implementation \
postgresql11-plperl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl \
postgresql-plperl-noarch \
postgresql11-server"

inherit rpm
