SUMMARY = "(DEPRECATED) Adding keywords to perl, in perl"
DESCRIPTION = "Devel::Declare can install subroutines called declarators which locally \
take over Perl's parser, allowing the creation of new syntax. \
 \
This document describes how to create a simple declarator."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.006022"

RPM_NAME = "perl-Devel-Declare-0.006022-1.18.aarch64.rpm"
RPM_HASH = "a23b22ae49abc862b9c588878c86fd545b6f6e83944ab7cdd79d6b30db33124b9cec9489f10137b7f635d28787aa2434f20d308b43c2d932c63c50348f9aa97e"

RPROVIDES:${PN} += "perl-Devel--Declare \
perl-Devel--Declare--Context--Simple \
perl-Devel--Declare--MethodInstaller--Simple \
perl-Devel-Declare"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-B--Hooks--EndOfScope \
perl-B--Hooks--OP--Check \
perl-Sub--Name"

inherit rpm
