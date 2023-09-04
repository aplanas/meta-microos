SUMMARY = "Building, finding and using tidyp library - L<http://www.tidyp.com>"
DESCRIPTION = "Building, finding and using tidyp library - L<http://www.tidyp.com>"
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "1.4.7"

RPM_NAME = "perl-Alien-Tidyp-1.4.7-8.30.noarch.rpm"
RPM_HASH = "d4fd751a8c3c24f567d04e40ab56b926b14431ea8623803c34e2d452da9a87a05063158721dafc25fec962a86eac11d37931e463ca2fea79b6889c82f9eaf2a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Alien--Tidyp \
perl-Alien--Tidyp--ConfigData \
perl-Alien-Tidyp"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-File--ShareDir"

inherit rpm
