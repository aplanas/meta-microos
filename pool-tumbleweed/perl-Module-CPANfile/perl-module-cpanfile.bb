SUMMARY = "Parse cpanfile"
DESCRIPTION = "Module::CPANfile is a tool to handle cpanfile format to load application \
specific dependencies, not just for CPAN distributions."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.1004"

RPM_NAME = "perl-Module-CPANfile-1.1004-1.18.noarch.rpm"
RPM_HASH = "9a8048d5e8eceecc051b0db77bede03bc9ce226ff995a5ac17d5f486ed5ce50e6bad6cdecb74db01979243c1e66ac67ac702827afc4859a58bd527a7aea4a795"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--CPANfile \
perl-Module--CPANfile--Environment \
perl-Module--CPANfile--Prereq \
perl-Module--CPANfile--Prereqs \
perl-Module--CPANfile--Requirement \
perl-Module-CPANfile"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-CPAN--Meta \
perl-CPAN--Meta--Prereqs \
perl-parent"

inherit rpm
