SUMMARY = "detect if English number is ordinal or cardinal"
DESCRIPTION = "This module will tell you if a number, either in words or as digits, is a \
cardinal or the ordinal \
number|http://www.ego4u.com/en/cram-up/vocabulary/numbers/ordinal manpage. \
 \
This is useful if you e.g. want to distinguish these types of numbers found \
with the Lingua::EN::FindNumber manpage and take different actions."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.05"

RPM_NAME = "perl-Lingua-EN-Number-IsOrdinal-0.05-1.27.noarch.rpm"
RPM_HASH = "73c58bb6aaad96205985da3f41867da8436b1cded20b4cdd0f75abba8c4aa2bdeef07bef1f2859cb48e3736040ca300dbbc7d96ff52331d7acbb4a3c1428d23d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--EN--Number--IsOrdinal \
perl-Lingua-EN-Number-IsOrdinal"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Lingua--EN--FindNumber"

inherit rpm
