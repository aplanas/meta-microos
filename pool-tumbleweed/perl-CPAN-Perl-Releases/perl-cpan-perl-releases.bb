SUMMARY = "Mapping Perl releases on CPAN to the location of the tarballs"
DESCRIPTION = "CPAN::Perl::Releases is a module that contains the mappings of all 'perl' \
releases that have been uploaded to CPAN to the 'authors/id/' path that the \
tarballs reside in. \
 \
This is static data, but newer versions of this module will be made \
available as new releases of 'perl' are uploaded to CPAN."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "5.20230703"

RPM_NAME = "perl-CPAN-Perl-Releases-5.20230703-1.1.noarch.rpm"
RPM_HASH = "e2649bbddfe5e031486ca7b1f74b57da40ca35f9828e990229f7b4f530c17a478a0f2f15dccaf6ecab503d1c5cd70a46e148847bf7aa23ca2ec4ae7ad69b29d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-CPAN--Perl--Releases \
perl-CPAN-Perl-Releases"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
