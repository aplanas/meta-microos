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

RPM_NAME = "perl-Lingua-EN-Tagger-0.31-1.16.aarch64.rpm"
RPM_HASH = "0764a7c17312f5b701e53df751f296530eb58565140652a9d5a425e2424b43d479521cfc40c8dc2a12055f1733438460c21f987aa83c04f8626283a9ddf57fb6"

RPROVIDES:${PN} += "perl-Lingua--EN--Tagger \
perl-Lingua-EN-Tagger"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-HTML--Parser \
perl-HTML--Tagset \
perl-Lingua--Stem \
perl-Memoize--ExpireLRU"

inherit rpm
