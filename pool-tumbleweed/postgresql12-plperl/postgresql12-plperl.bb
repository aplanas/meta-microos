SUMMARY = "The PL/Tcl, PL/Perl, and  PL/Python procedural languages for PostgreSQL"
DESCRIPTION = "This package contains the the PL/Tcl, PL/Perl, and PL/Python procedural \
languages for the back-end.  With these modules one can use Perl, \
Python, and Tcl to write stored procedures, functions and triggers. \
 \
PostgreSQL also offers the builtin procedural language PL/SQL."
LICENSE = "PostgreSQL"

PV = "12.16"

RPM_NAME = "postgresql12-plperl-12.16-1.1.aarch64.rpm"
RPM_HASH = "94ed1155fe73bafe98856eee1619abe4290628c85df3eeb75a3dfc9f8b890a95376a29001d0057e7ac7decdefe544f7f7e934175592c674952781d16c2f28669"

RPROVIDES:${PN} += "postgresql-plperl-implementation \
postgresql12-plperl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl \
postgresql-plperl-noarch \
postgresql12-server"

inherit rpm
