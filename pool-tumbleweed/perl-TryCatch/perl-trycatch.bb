SUMMARY = "first class try catch semantics for Perl, without source filters."
DESCRIPTION = "This module aims to provide a nicer syntax and method to catch errors in \
Perl, similar to what is found in other languages (such as Java, Python or \
C++). The standard method of using 'eval {}; if ($@) {}' is often prone to \
subtle bugs, primarily that its far too easy to stomp on the error in error \
handlers. And also eval/if isn't the nicest idiom."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.003002"

RPM_NAME = "perl-TryCatch-1.003002-6.28.aarch64.rpm"
RPM_HASH = "f608b9cd72e67f7b5dd87d15dcce29ab8f9897cf9cfea482f85ab43f70e8ad2fba63a3ba54b6fe972521a5928b270285afe239c444a0f5fcd603c366f9c4a6ec"

RPROVIDES:${PN} += "perl-TryCatch"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
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
