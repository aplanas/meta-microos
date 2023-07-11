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

RPM_NAME = "perl-Pod-Coverage-0.23-6.12.noarch.rpm"
RPM_HASH = "e26970bb085056234518ec64bd392102269a11582e8066442bf4460cd3e3e73d98e00a892a89eb37b3d76b8b6ca91eb23da9bff78ea817b459fc30117135897c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--Coverage \
perl-Pod--Coverage--CountParents \
perl-Pod--Coverage--ExportOnly \
perl-Pod--Coverage--Extractor \
perl-Pod--Coverage--Overloader \
perl-Pod-Coverage"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-Devel--Symdump \
perl-Pod--Find \
perl-Pod--Parser"

inherit rpm
