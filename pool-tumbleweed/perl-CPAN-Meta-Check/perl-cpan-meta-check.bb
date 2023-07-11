SUMMARY = "Verify requirements in a CPAN::Meta object"
DESCRIPTION = "This module verifies if requirements described in a CPAN::Meta object are \
present."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.017"

RPM_NAME = "perl-CPAN-Meta-Check-0.017-1.2.noarch.rpm"
RPM_HASH = "663fd6a02f741de77421035e7cf703788a870515b454551fc787d8cc62bac6b5ddf5d15e7694d388d501c88e756b25e0da22bb89c199f151361d731d7897a680"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CPAN--Meta--Check \
perl-CPAN-Meta-Check"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-CPAN--Meta--Prereqs \
perl-CPAN--Meta--Requirements \
perl-Module--Metadata"

inherit rpm
