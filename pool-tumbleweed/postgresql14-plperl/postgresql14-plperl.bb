SUMMARY = "The PL/Tcl, PL/Perl, and  PL/Python procedural languages for PostgreSQL"
DESCRIPTION = "This package contains the the PL/Tcl, PL/Perl, and PL/Python procedural \
languages for the back-end.  With these modules one can use Perl, \
Python, and Tcl to write stored procedures, functions and triggers. \
 \
PostgreSQL also offers the builtin procedural language PL/SQL."
LICENSE = "PostgreSQL"

PV = "14.8"

RPM_NAME = "postgresql14-plperl-14.8-1.2.aarch64.rpm"
RPM_HASH = "559b4e011f63a09f46e61d0805c04f727881c3e767dab31d25b23bae73e3a5d714d7a0606c33072bce4e97ed548384341499bac7fb79627cd3bfb955a215d6d1"

RPROVIDES:${PN} += "postgresql-plperl-implementation \
postgresql14-plperl \
postgresql14-plperl(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libperl.so()(64bit) \
perl \
postgresql-plperl-noarch \
postgresql14-server"

inherit rpm
