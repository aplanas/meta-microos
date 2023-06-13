SUMMARY = "The PL/Tcl, PL/Perl, and  PL/Python procedural languages for PostgreSQL"
DESCRIPTION = "This package contains the the PL/Tcl, PL/Perl, and PL/Python procedural \
languages for the back-end.  With these modules one can use Perl, \
Python, and Tcl to write stored procedures, functions and triggers. \
 \
PostgreSQL also offers the builtin procedural language PL/SQL."
LICENSE = "PostgreSQL"

PV = "12.15"

RPM_NAME = "postgresql12-plperl-12.15-1.2.aarch64.rpm"
RPM_HASH = "58871f0599b30ece88bbc6fff36f61f9cf033a2c9fdd639909f28b4d50d90350cb9166566a6af6d18013a117f9da0c2e544c2c57ec6b4073fef104087e5ad4d6"

RPROVIDES:${PN} += "postgresql-plperl-implementation \
postgresql12-plperl \
postgresql12-plperl(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libperl.so()(64bit) \
perl \
postgresql-plperl-noarch \
postgresql12-server"

inherit rpm
