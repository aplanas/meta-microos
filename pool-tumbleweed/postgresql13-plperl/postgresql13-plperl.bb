SUMMARY = "The PL/Tcl, PL/Perl, and  PL/Python procedural languages for PostgreSQL"
DESCRIPTION = "This package contains the the PL/Tcl, PL/Perl, and PL/Python procedural \
languages for the back-end.  With these modules one can use Perl, \
Python, and Tcl to write stored procedures, functions and triggers. \
 \
PostgreSQL also offers the builtin procedural language PL/SQL."
LICENSE = "PostgreSQL"

PV = "13.12"

RPM_NAME = "postgresql13-plperl-13.12-1.1.aarch64.rpm"
RPM_HASH = "edfd2697a58dc9c3f8af5ecf627e0fc065abdf487532375237bcdfd7a87f005339da0481303dbcc38b931f823aa84ea3ffa97bf7e7ad06da97fc4a7a928608f3"

RPROVIDES:${PN} += "postgresql-plperl-implementation \
postgresql13-plperl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl \
postgresql-plperl-noarch \
postgresql13-server"

inherit rpm
