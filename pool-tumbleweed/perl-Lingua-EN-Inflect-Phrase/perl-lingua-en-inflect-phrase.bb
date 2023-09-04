SUMMARY = "Inflect short English Phrases"
DESCRIPTION = "Attempts to pluralize or singularize short English phrases. \
 \
Does not throw exceptions at present, if you attempt to pluralize an \
already pluralized phrase, it will leave it unchanged (and vice versa.) \
 \
The behavior of this module is subject to change as I tweak the heuristics, \
as some things get fixed others might regress. The processing of natural \
language is a messy business. \
 \
If it doesn't work, please email or submit to RT the example you tried, and \
I'll try to fix it."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.20"

RPM_NAME = "perl-Lingua-EN-Inflect-Phrase-0.20-1.19.noarch.rpm"
RPM_HASH = "367ed6420691db796ac44e74621818d5cba9b2b6e9fd981397f3132efdc03b8e3bf159a5e24de21761e1949b3c2f281a3b62e2a6707e21e68e3c20c3c26787fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--EN--Inflect--Phrase \
perl-Lingua-EN-Inflect-Phrase"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Lingua--EN--FindNumber \
perl-Lingua--EN--Inflect \
perl-Lingua--EN--Inflect--Number \
perl-Lingua--EN--Number--IsOrdinal \
perl-Lingua--EN--Tagger"

inherit rpm
