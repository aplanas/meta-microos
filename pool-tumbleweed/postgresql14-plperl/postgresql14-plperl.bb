SUMMARY = "The PL/Tcl, PL/Perl, and  PL/Python procedural languages for PostgreSQL"
DESCRIPTION = "This package contains the the PL/Tcl, PL/Perl, and PL/Python procedural \
languages for the back-end.  With these modules one can use Perl, \
Python, and Tcl to write stored procedures, functions and triggers. \
 \
PostgreSQL also offers the builtin procedural language PL/SQL."
LICENSE = "PostgreSQL"

PV = "14.8"

RPM_NAME = "postgresql14-plperl-14.8-1.6.aarch64.rpm"
RPM_HASH = "8c85eb665f0077dd858901ee36a1bfe23bfc57d092d86191cfe9bce93f0445b4858f547adc9c5aefadc66d2f561f857968b7029a5bd47b9c00f32cd763c99341"

RPROVIDES:${PN} += "postgresql-plperl-implementation \
postgresql14-plperl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl \
postgresql-plperl-noarch \
postgresql14-server"

inherit rpm
