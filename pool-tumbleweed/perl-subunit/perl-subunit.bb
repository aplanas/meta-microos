SUMMARY = "Perl bindings for subunit"
DESCRIPTION = "Subunit Perl bindings.  See the python3-python-subunit package for test \
processing functionality."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "perl-subunit-1.4.2-3.2.noarch.rpm"
RPM_HASH = "5820746da0c50fcdc58351df214f110e7f0d5e4f780eafb92819af987af3b0f8b9d83e98fa872d5354dc1c9c15fb98d6f6c32abeb2fdfb6e23b5e44b2183ef6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Subunit \
perl-Subunit--Diff \
perl-subunit"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-base"

inherit rpm
