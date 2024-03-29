SUMMARY = "Part-of-speech tagger for English natural language processing"
DESCRIPTION = "The module is a probability based, corpus-trained tagger that assigns POS \
tags to English text based on a lookup dictionary and a set of probability \
values. The tagger assigns appropriate tags based on conditional \
probabilities - it examines the preceding tag to determine the appropriate \
tag for the current word. Unknown words are classified according to word \
morphology or can be set to be treated as nouns or other parts of speech. \
 \
The tagger also extracts as many nouns and noun phrases as it can, using a \
set of regular expressions."
LICENSE = "GPL-3.0-only"

PV = "0.31"

RPM_NAME = "perl-Lingua-EN-Tagger-0.31-1.17.aarch64.rpm"
RPM_HASH = "42262677b5770dcfc07b9aa0e37318dce568408b02432a0de2cd9d75c4065d839931610175ba21f6fe589117aafa1b1efb28e0dd1361a6d602398857d4825003"

RPROVIDES:${PN} += "perl-Lingua--EN--Tagger \
perl-Lingua-EN-Tagger"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-HTML--Parser \
perl-HTML--Tagset \
perl-Lingua--Stem \
perl-Memoize--ExpireLRU"

inherit rpm
