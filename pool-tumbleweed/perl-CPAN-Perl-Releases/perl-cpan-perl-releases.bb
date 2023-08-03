SUMMARY = "Mapping Perl releases on CPAN to the location of the tarballs"
DESCRIPTION = "CPAN::Perl::Releases is a module that contains the mappings of all 'perl' \
releases that have been uploaded to CPAN to the 'authors/id/' path that the \
tarballs reside in. \
 \
This is static data, but newer versions of this module will be made \
available as new releases of 'perl' are uploaded to CPAN."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "5.20230720"

RPM_NAME = "perl-CPAN-Perl-Releases-5.20230720-1.1.noarch.rpm"
RPM_HASH = "100528f21cbf24aef0ea8a50a8b679d7f5cc5dd4e64ae447b5cd01234f896376e5a7732029c2df5e3001887cc05b37fe07142c74c92b0223bb759a2452d28b9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CPAN--Perl--Releases \
perl-CPAN-Perl-Releases"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
