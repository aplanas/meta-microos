SUMMARY = "Perl French Stemming"
DESCRIPTION = "This module use the a modified version of the Porter Stemming Algorithm to \
return a stemmed words."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.02"

RPM_NAME = "perl-Lingua-Stem-Fr-0.02-9.25.noarch.rpm"
RPM_HASH = "c50542b346b7d645db5cc58068d5d3fc4f1ed07586d30d8a23b67882114ec8520fa5c83803237be945599f6a589137cb512a4d699b7925b1dc074f0af59c5339"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--Stem--Fr \
perl-Lingua-Stem-Fr"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
