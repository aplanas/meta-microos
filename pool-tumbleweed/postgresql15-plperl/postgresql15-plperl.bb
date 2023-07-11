SUMMARY = "The PL/Tcl, PL/Perl, and  PL/Python procedural languages for PostgreSQL"
DESCRIPTION = "This package contains the the PL/Tcl, PL/Perl, and PL/Python procedural \
languages for the back-end.  With these modules one can use Perl, \
Python, and Tcl to write stored procedures, functions and triggers. \
 \
PostgreSQL also offers the builtin procedural language PL/SQL."
LICENSE = "PostgreSQL"

PV = "15.3"

RPM_NAME = "postgresql15-plperl-15.3-1.5.aarch64.rpm"
RPM_HASH = "0863c8ce53d0d7bbb8045a506fbed2f511bb8dfb6a2a694bb722d637067cc8c2c65bbf973506580cbfb01259b44db5cd82065799fa322ae2a3781f06ff7e7e33"

RPROVIDES:${PN} += "postgresql-plperl-implementation \
postgresql15-plperl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl \
postgresql-plperl-noarch \
postgresql15-server"

inherit rpm
