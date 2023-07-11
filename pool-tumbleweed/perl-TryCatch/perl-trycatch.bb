SUMMARY = "first class try catch semantics for Perl, without source filters."
DESCRIPTION = "This module aims to provide a nicer syntax and method to catch errors in \
Perl, similar to what is found in other languages (such as Java, Python or \
C++). The standard method of using 'eval {}; if ($@) {}' is often prone to \
subtle bugs, primarily that its far too easy to stomp on the error in error \
handlers. And also eval/if isn't the nicest idiom."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.003002"

RPM_NAME = "perl-TryCatch-1.003002-6.27.aarch64.rpm"
RPM_HASH = "65b8cf03b21723cbda2338344b6701bd57e2b032017dceca21636e06e23fe7830368ffd4fa3866808ee4907428ede05d422d5167b1abe86028b340db4aa5ee71"

RPROVIDES:${PN} += "perl-TryCatch"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-B--Hooks--EndOfScope \
perl-B--Hooks--OP--Check \
perl-B--Hooks--OP--PPAddr \
perl-Devel--Declare \
perl-Moose \
perl-MooseX--Types \
perl-Parse--Method--Signatures \
perl-Scope--Upper \
perl-Sub--Exporter \
perl-Variable--Magic \
perl-namespace--clean"

inherit rpm
