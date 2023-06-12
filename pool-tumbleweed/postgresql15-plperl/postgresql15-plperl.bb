SUMMARY = "The PL/Tcl, PL/Perl, and  PL/Python procedural languages for PostgreSQL"
DESCRIPTION = "This package contains the the PL/Tcl, PL/Perl, and PL/Python procedural \
languages for the back-end.  With these modules one can use Perl, \
Python, and Tcl to write stored procedures, functions and triggers. \
 \
PostgreSQL also offers the builtin procedural language PL/SQL."
LICENSE = "PostgreSQL"

PV = "15.3"

RPM_NAME = "postgresql15-plperl-15.3-1.2.aarch64.rpm"
RPM_HASH = "999d83a33a97906707c795fb61b4d2417d43782ea0db4e62d4e5030a4fd5f22949e0fdf40ddd1c4d6e725f9753f158f01c70ae0b04481598c5a3d303fa6497ad"

RPROVIDES:${PN} += "postgresql-plperl-implementation \
postgresql15-plperl \
postgresql15-plperl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libperl.so()(64bit) \
perl \
postgresql-plperl-noarch \
postgresql15-server"

inherit rpm
