SUMMARY = "The PL/Tcl, PL/Perl, and  PL/Python procedural languages for PostgreSQL"
DESCRIPTION = "This package contains the the PL/Tcl, PL/Perl, and PL/Python procedural \
languages for the back-end.  With these modules one can use Perl, \
Python, and Tcl to write stored procedures, functions and triggers. \
 \
PostgreSQL also offers the builtin procedural language PL/SQL."
LICENSE = "PostgreSQL"

PV = "12.15"

RPM_NAME = "postgresql12-plperl-12.15-1.5.aarch64.rpm"
RPM_HASH = "b4ec2fe57b0ed0eded1035bfcbd442ab4a6e4981cd96604631462485711adb64f3bbbb92b00d4359c9ae27b2469285aead34faaeba8f4de0213736780ec01d4b"

RPROVIDES:${PN} += "postgresql-plperl-implementation \
postgresql12-plperl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl \
postgresql-plperl-noarch \
postgresql12-server"

inherit rpm
