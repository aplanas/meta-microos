SUMMARY = "Generate a SUSE spec file for a CPAN module"
DESCRIPTION = "*cpanspec* will generate a spec file to build a rpm from a CPAN-style Perl \
module distribution."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.84.00.1688930749.8cd1dcd"

RPM_NAME = "cpanspec-1.84.00.1688930749.8cd1dcd-1.2.noarch.rpm"
RPM_HASH = "bf32b966c240c1f36cb876d5fd7ea00f6b365d8d38879fb9d5bafb16635a744b56488acc5242e97771f248ea4e3ea535143d0a2be13c3386a082e617cf041425"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpanspec \
perl-CPAN2OBS \
perl-PodViewSpec"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl--MODULE-COMPAT-5.38.0 \
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
