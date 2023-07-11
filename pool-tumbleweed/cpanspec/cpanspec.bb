SUMMARY = "Generate a SUSE spec file for a CPAN module"
DESCRIPTION = "*cpanspec* will generate a spec file to build a rpm from a CPAN-style Perl \
module distribution."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.83.00.1674496263.ba76ec9"

RPM_NAME = "cpanspec-1.83.00.1674496263.ba76ec9-1.2.noarch.rpm"
RPM_HASH = "acbb6491f43f13c8530543fc47ef8899cf89b343df159b8b5ce439dbae6d4111ca590287e153f4a123fe77f959075624e8349f483b2857b29382092db7e4b238"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpanspec \
perl-CPAN2OBS \
perl-PodViewSpec"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl--MODULE-COMPAT-5.36.1 \
perl-Algorithm--Diff \
perl-Archive--Tar \
perl-Archive--Zip \
perl-Class--Accessor--Chained \
perl-File--ShareDir--Install \
perl-LWP--UserAgent \
perl-Module--Build--Tiny \
perl-Parse--CPAN--Packages \
perl-Perl--PrereqScanner \
perl-Pod--POM \
perl-Pod--Simple--TextContent \
perl-Text--Autoformat \
perl-Text--Capitalize \
perl-YAML \
perl-YAML--XS"

inherit rpm
