SUMMARY = "The PL/Tcl, PL/Perl, and  PL/Python procedural languages for PostgreSQL"
DESCRIPTION = "This package contains the the PL/Tcl, PL/Perl, and PL/Python procedural \
languages for the back-end.  With these modules one can use Perl, \
Python, and Tcl to write stored procedures, functions and triggers. \
 \
PostgreSQL also offers the builtin procedural language PL/SQL."
LICENSE = "PostgreSQL"

PV = "14.8"

RPM_NAME = "postgresql14-plperl-14.8-1.5.aarch64.rpm"
RPM_HASH = "99d432878950f66bc13b263a44e885500b3a22d3f31c0857f3800cf72bc9553ab6f2c57e57b34b4207ab0b220cf5da39225da99d01da3fce398fd3c502c5e135"

RPROVIDES:${PN} += "postgresql-plperl-implementation \
postgresql14-plperl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl \
postgresql-plperl-noarch \
postgresql14-server"

inherit rpm
