SUMMARY = "Parse cpanfile"
DESCRIPTION = "Module::CPANfile is a tool to handle cpanfile format to load application \
specific dependencies, not just for CPAN distributions."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.1004"

RPM_NAME = "perl-Module-CPANfile-1.1004-1.19.noarch.rpm"
RPM_HASH = "7de4d25e0773651b574c433e6c0200cb34eaceec3b1e4ff2db7016a784fe1f2de7be496636788261fcd55debef8c1dccf12e5ba1c8daeb1f1e578257831d3a8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--CPANfile \
perl-Module--CPANfile--Environment \
perl-Module--CPANfile--Prereq \
perl-Module--CPANfile--Prereqs \
perl-Module--CPANfile--Requirement \
perl-Module-CPANfile"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-CPAN--Meta \
perl-CPAN--Meta--Prereqs \
perl-parent"

inherit rpm
