SUMMARY = "Mapping Perl releases on CPAN to the location of the tarballs"
DESCRIPTION = "CPAN::Perl::Releases is a module that contains the mappings of all 'perl' \
releases that have been uploaded to CPAN to the 'authors/id/' path that the \
tarballs reside in. \
 \
This is static data, but newer versions of this module will be made \
available as new releases of 'perl' are uploaded to CPAN."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "5.20230423"

RPM_NAME = "perl-CPAN-Perl-Releases-5.20230423-1.1.noarch.rpm"
RPM_HASH = "e06c3f0e17bdb7700bb79550d11be2484de1f9874786425fd245d690877e65a28567850188dbc59fa31c917594a03f00443273941b52f4c8ca9b11b179ca6dda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(CPAN::Perl::Releases) \
perl-CPAN-Perl-Releases"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
