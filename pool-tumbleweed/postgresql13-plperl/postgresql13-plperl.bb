SUMMARY = "The PL/Tcl, PL/Perl, and  PL/Python procedural languages for PostgreSQL"
DESCRIPTION = "This package contains the the PL/Tcl, PL/Perl, and PL/Python procedural \
languages for the back-end.  With these modules one can use Perl, \
Python, and Tcl to write stored procedures, functions and triggers. \
 \
PostgreSQL also offers the builtin procedural language PL/SQL."
LICENSE = "PostgreSQL"

PV = "13.11"

RPM_NAME = "postgresql13-plperl-13.11-1.5.aarch64.rpm"
RPM_HASH = "aea206aeae347a2a11af7b53e4f051a1d52b92db3be4cb52616943c9d8e5add6caf53f42600716cf48373dad6959518041c206d4177b682ef7cc7d47e196266e"

RPROVIDES:${PN} += "postgresql-plperl-implementation \
postgresql13-plperl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl \
postgresql-plperl-noarch \
postgresql13-server"

inherit rpm
