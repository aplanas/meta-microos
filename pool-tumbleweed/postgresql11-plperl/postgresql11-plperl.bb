SUMMARY = "The PL/Tcl, PL/Perl, and  PL/Python procedural languages for PostgreSQL"
DESCRIPTION = "This package contains the the PL/Tcl, PL/Perl, and PL/Python procedural \
languages for the back-end.  With these modules one can use Perl, \
Python, and Tcl to write stored procedures, functions and triggers. \
 \
PostgreSQL also offers the builtin procedural language PL/SQL."
LICENSE = "PostgreSQL"

PV = "11.20"

RPM_NAME = "postgresql11-plperl-11.20-1.5.aarch64.rpm"
RPM_HASH = "f9ea0da190875f1935a93f46747a615bc6ba2dfa269965728c7b8b36aee485dd983bd517a16671c1c486914ef21088fd66e0ba9bceacb63e5cd88abdd032a002"

RPROVIDES:${PN} += "postgresql-plperl-implementation \
postgresql11-plperl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl \
postgresql-plperl-noarch \
postgresql11-server"

inherit rpm
