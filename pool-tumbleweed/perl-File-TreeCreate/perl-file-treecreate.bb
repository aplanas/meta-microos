SUMMARY = "Recursively create a directory tree"
DESCRIPTION = "This module was extracted from several near-identical copies used in the \
tests of some of my CPAN distributions."
LICENSE = "MIT"

PV = "0.0.1"

RPM_NAME = "perl-File-TreeCreate-0.0.1-1.9.noarch.rpm"
RPM_HASH = "172f253ac1e93a039ad11fe77241b11a25a7d9f1a17e5163409381171d96d90bc42a1f2c97f6192770cd4ca5a5fdd77a24207234eb8dfb9ab3d459edb2ac4cbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--TreeCreate \
perl-File-TreeCreate"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-autodie"

inherit rpm
