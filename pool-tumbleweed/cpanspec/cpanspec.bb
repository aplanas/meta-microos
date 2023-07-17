SUMMARY = "Generate a SUSE spec file for a CPAN module"
DESCRIPTION = "*cpanspec* will generate a spec file to build a rpm from a CPAN-style Perl \
module distribution."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.84.00.1688930749.8cd1dcd"

RPM_NAME = "cpanspec-1.84.00.1688930749.8cd1dcd-1.1.noarch.rpm"
RPM_HASH = "4c4124a8b3496bccea3a2ad034d646e8d8666b07decc2128fc86ab4020c6499241766168cd7724ef8f38f9cfc47c036b1ae26eb28fa66ee3b69fd59f27e617d6"
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
