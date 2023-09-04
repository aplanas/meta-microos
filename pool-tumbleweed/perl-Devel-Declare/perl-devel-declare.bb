SUMMARY = "(DEPRECATED) Adding keywords to perl, in perl"
DESCRIPTION = "Devel::Declare can install subroutines called declarators which locally \
take over Perl's parser, allowing the creation of new syntax. \
 \
This document describes how to create a simple declarator."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.006022"

RPM_NAME = "perl-Devel-Declare-0.006022-1.19.aarch64.rpm"
RPM_HASH = "b4be81d070cdd6e457d19299ec768b4f29267da7b6aceb3e07e70fc6085262b25bc47c2c73c5c6414dbb99f24cee769abf5135b03bfe9c90a28f7cced4dbfe97"

RPROVIDES:${PN} += "perl-Devel--Declare \
perl-Devel--Declare--Context--Simple \
perl-Devel--Declare--MethodInstaller--Simple \
perl-Devel-Declare"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-B--Hooks--EndOfScope \
perl-B--Hooks--OP--Check \
perl-Sub--Name"

inherit rpm
