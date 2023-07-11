SUMMARY = "Perl bindings for subunit"
DESCRIPTION = "Subunit Perl bindings.  See the python3-python-subunit package for test \
processing functionality."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "perl-subunit-1.4.2-2.4.noarch.rpm"
RPM_HASH = "a2af12dc248b3d64c56bb5049083ebdf571d6467af198cb1cec06aa034c36db30f3f07ce233f7c262f28501000313fde0ff3197911fc081db213c3c5614e8941"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Subunit \
perl-Subunit--Diff \
perl-subunit"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-base"

inherit rpm
