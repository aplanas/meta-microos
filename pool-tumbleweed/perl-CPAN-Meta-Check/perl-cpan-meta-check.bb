SUMMARY = "Verify requirements in a CPAN::Meta object"
DESCRIPTION = "This module verifies if requirements described in a CPAN::Meta object are \
present."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.18.0"

RPM_NAME = "perl-CPAN-Meta-Check-0.18.0-1.2.noarch.rpm"
RPM_HASH = "99ab65903e07dee243eb2108f137b2dcda8c77e08d87f106e8ef619a8f456a0be467e29b0f52982760c9dd2ce5beac052d7df795bcc14b42ce086658893ec695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CPAN--Meta--Check \
perl-CPAN-Meta-Check"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-CPAN--Meta--Prereqs \
perl-CPAN--Meta--Requirements \
perl-Module--Metadata"

inherit rpm
