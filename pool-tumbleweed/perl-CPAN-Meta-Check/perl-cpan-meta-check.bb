SUMMARY = "Verify requirements in a CPAN::Meta object"
DESCRIPTION = "This module verifies if requirements described in a CPAN::Meta object are \
present."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.18.0"

RPM_NAME = "perl-CPAN-Meta-Check-0.18.0-1.1.noarch.rpm"
RPM_HASH = "627b226bb07adf10aa6c2cbc92454be0e5f869f8ab84eb75de51cfbdc6519a7cfde4fbd84d5760e9c1a0c002a315bbe8a85488f60f1eb8f69f5e0b9d161e0028"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CPAN--Meta--Check \
perl-CPAN-Meta-Check"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-CPAN--Meta--Prereqs \
perl-CPAN--Meta--Requirements \
perl-Module--Metadata"

inherit rpm
