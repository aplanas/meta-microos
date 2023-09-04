SUMMARY = "Mapping Perl releases on CPAN to the location of the tarballs"
DESCRIPTION = "CPAN::Perl::Releases is a module that contains the mappings of all 'perl' \
releases that have been uploaded to CPAN to the 'authors/id/' path that the \
tarballs reside in. \
 \
This is static data, but newer versions of this module will be made \
available as new releases of 'perl' are uploaded to CPAN."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "5.20230720"

RPM_NAME = "perl-CPAN-Perl-Releases-5.20230720-1.2.noarch.rpm"
RPM_HASH = "756c6ff3027a830e48bafc2a88bc57913023dc8ac795ef95722f0c6bdee60068942e7664a35586775e96559cf0a537ce30a729ec3e0b27971f9e7dde0792faa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CPAN--Perl--Releases \
perl-CPAN-Perl-Releases"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
