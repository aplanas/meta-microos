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

RPM_NAME = "perl-Lingua-EN-Inflect-Phrase-0.20-1.18.noarch.rpm"
RPM_HASH = "e3f7cbfe97eec75c23bfefbd415c59f4e89c5d9a93ff2c51b93f04cd957a0d14c6fc4b6f2e402bc5b999218bab8fa056e20fe199572ff466c51ba219c42e6949"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--EN--Inflect--Phrase \
perl-Lingua-EN-Inflect-Phrase"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Lingua--EN--FindNumber \
perl-Lingua--EN--Inflect \
perl-Lingua--EN--Inflect--Number \
perl-Lingua--EN--Number--IsOrdinal \
perl-Lingua--EN--Tagger"

inherit rpm
