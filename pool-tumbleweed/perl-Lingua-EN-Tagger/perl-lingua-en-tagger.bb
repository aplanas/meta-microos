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

RPM_NAME = "perl-Lingua-EN-Tagger-0.31-1.15.aarch64.rpm"
RPM_HASH = "ce45935af1d773536fa616e85dee16059fd2df6d214b6058bf269023c1d89eb7af50d79d998ee54df63e0d373fb8b171f936a502dc85e86e35fb9d186fc518d3"

RPROVIDES:${PN} += "perl(Lingua::EN::Tagger) \
perl-Lingua-EN-Tagger \
perl-Lingua-EN-Tagger(aarch-64)"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(HTML::Parser) \
perl(HTML::Tagset) \
perl(Lingua::Stem) \
perl(Memoize::ExpireLRU)"

inherit rpm
