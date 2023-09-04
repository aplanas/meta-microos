SUMMARY = "OO interface for spell-checking a block of text"
DESCRIPTION = "This module is a thin layer above either Text::Aspell or Text::Hunspell \
(preferring the latter if available), and allows one to spellcheck a body \
of text. \
 \
Whereas Text::(Hu|A)spell deals with words, Text::Spellchecker deals with \
blocks of text. For instance, we provide methods for iterating through the \
text, serializing the object (thus remembering where we left off), and \
highlighting the current misspelled word within the text."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.14"

RPM_NAME = "perl-Text-SpellChecker-0.14-2.23.noarch.rpm"
RPM_HASH = "d816e18c0e958787fdc72442b3e8bcf776675d91d7658ad5817019d5014123a00211dd87b6b7ab90b23f0b70109669549e8d03a31ebec0893e4a591ca39e32a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--SpellChecker \
perl-Text-SpellChecker"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Text--Hunspell"

inherit rpm
