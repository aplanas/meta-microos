SUMMARY = "Force number of words to singular or plural"
DESCRIPTION = "This module extends the functionality of Lingua::EN::Inflect with three new \
functions available for export:"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.12"

RPM_NAME = "perl-Lingua-EN-Inflect-Number-1.12-1.28.noarch.rpm"
RPM_HASH = "e86765f72c43cf08c76a7f4a5f9775e44a771e10f026640a2b95970812575cc8f017a4917c0dad05405c671c97402e64d4e375830760d67bb1cdfaaaf7bd94fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--EN--Inflect--Number \
perl-Lingua-EN-Inflect-Number"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Lingua--EN--Inflect"

inherit rpm
