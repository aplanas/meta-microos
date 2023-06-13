SUMMARY = "The PL/Tcl, PL/Perl, and  PL/Python procedural languages for PostgreSQL"
DESCRIPTION = "This package contains the the PL/Tcl, PL/Perl, and PL/Python procedural \
languages for the back-end.  With these modules one can use Perl, \
Python, and Tcl to write stored procedures, functions and triggers. \
 \
PostgreSQL also offers the builtin procedural language PL/SQL."
LICENSE = "PostgreSQL"

PV = "13.11"

RPM_NAME = "postgresql13-plperl-13.11-1.2.aarch64.rpm"
RPM_HASH = "90b375f0b1986d532b19cdd1a9efb81d986d18c1cf25bcc2123b64b74ef9ccd735e2799d880e40c8451ae5d5dbf100840b989a9db15d26c4d4c70d935d36966a"

RPROVIDES:${PN} += "postgresql-plperl-implementation \
postgresql13-plperl \
postgresql13-plperl(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libperl.so()(64bit) \
perl \
postgresql-plperl-noarch \
postgresql13-server"

inherit rpm
