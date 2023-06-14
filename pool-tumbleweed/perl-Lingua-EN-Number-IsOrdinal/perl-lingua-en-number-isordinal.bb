SUMMARY = "detect if English number is ordinal or cardinal"
DESCRIPTION = "This module will tell you if a number, either in words or as digits, is a \
cardinal or the ordinal \
number|http://www.ego4u.com/en/cram-up/vocabulary/numbers/ordinal manpage. \
 \
This is useful if you e.g. want to distinguish these types of numbers found \
with the Lingua::EN::FindNumber manpage and take different actions."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.05"

RPM_NAME = "perl-Lingua-EN-Number-IsOrdinal-0.05-1.26.noarch.rpm"
RPM_HASH = "7126a5fc0ff2a72ea05cd397d241719aed3997122a6038fccbdd32c0613101ce1d27a90d2fe7c8e65bcaefeb0e052ad498adf5ec5a539229ffcb5c58ecb8ee4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--EN--Number--IsOrdinal \
perl-Lingua-EN-Number-IsOrdinal"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Lingua--EN--FindNumber"

inherit rpm
