SUMMARY = "detect if English number is ordinal or cardinal"
DESCRIPTION = "This module will tell you if a number, either in words or as digits, is a \
cardinal or the ordinal \
number|http://www.ego4u.com/en/cram-up/vocabulary/numbers/ordinal manpage. \
 \
This is useful if you e.g. want to distinguish these types of numbers found \
with the Lingua::EN::FindNumber manpage and take different actions."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.05"

RPM_NAME = "perl-Lingua-EN-Number-IsOrdinal-0.05-1.28.noarch.rpm"
RPM_HASH = "e0e256a40261fb9156a5282f5cd0a443bc75a2b6d39b8bc8e2d5c5cc8c4637be09a329060947dacf2d269a357ab394b0fbb466adf74b4b56b97277ae78d37eb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--EN--Number--IsOrdinal \
perl-Lingua-EN-Number-IsOrdinal"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Lingua--EN--FindNumber"

inherit rpm
