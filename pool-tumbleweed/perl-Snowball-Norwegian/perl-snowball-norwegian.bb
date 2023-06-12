SUMMARY = "Porters stemming algorithm for norwegian."
DESCRIPTION = "Porters stemming algorithm for norwegian."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.2"

RPM_NAME = "perl-Snowball-Norwegian-1.2-14.25.noarch.rpm"
RPM_HASH = "027139a9e974fcdd28935620cb89b036f3cab585570f98057174363992b089c1a468a43ee5e847afe2282f34fc7aba1035f6e02898461b0a3e8abd52695ad0e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Lingua::Stem::Snowball::No) \
perl-Snowball-Norwegian"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
