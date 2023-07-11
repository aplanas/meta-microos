SUMMARY = "Mapping Perl releases on CPAN to the location of the tarballs"
DESCRIPTION = "CPAN::Perl::Releases is a module that contains the mappings of all 'perl' \
releases that have been uploaded to CPAN to the 'authors/id/' path that the \
tarballs reside in. \
 \
This is static data, but newer versions of this module will be made \
available as new releases of 'perl' are uploaded to CPAN."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "5.20230423"

RPM_NAME = "perl-CPAN-Perl-Releases-5.20230423-1.2.noarch.rpm"
RPM_HASH = "63eca0ba61ed9e951c53c9fa6cdc54511c903fdf44d2518ba224fd9c640de1c3821307aa429ede5fd27a2a38cc806e2e786b382d737c2cd3727ba20f74a5b7c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CPAN--Perl--Releases \
perl-CPAN-Perl-Releases"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
