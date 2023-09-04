SUMMARY = "Checks if the documentation of a module is comprehensive"
DESCRIPTION = "Developers hate writing documentation. They'd hate it even more if their \
computer tattled on them, but maybe they'll be even more thankful in the \
long run. Even if not, _perlmodstyle_ tells you to, so you must obey. \
 \
This module provides a mechanism for determining if the pod for a given \
module is comprehensive. \
 \
It expects to find either a '=head(n>1)' or an '=item' block documenting a \
subroutine. \
 \
Consider: # an imaginary Foo.pm package Foo; \
 \
 =item foo \
 \
 The foo sub \
 \
 = cut \
 \
 sub foo {} \
 sub bar {} \
 \
 1; \
 __END__ \
 \
In this example 'Foo::foo' is covered, but 'Foo::bar' is not, so the 'Foo' \
package is only 50% (0.5) covered"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.23"

RPM_NAME = "perl-Pod-Coverage-0.23-6.13.noarch.rpm"
RPM_HASH = "a1364c770df1e4990621a16506f5e89136766ff77893fe5299961f16f75eb1680dd6d7a0ede6fbc7f2d0431784b4fa6938d6e3d6d90abe319bf29a7094577024"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--Coverage \
perl-Pod--Coverage--CountParents \
perl-Pod--Coverage--ExportOnly \
perl-Pod--Coverage--Extractor \
perl-Pod--Coverage--Overloader \
perl-Pod-Coverage"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-Devel--Symdump \
perl-Pod--Find \
perl-Pod--Parser"

inherit rpm
