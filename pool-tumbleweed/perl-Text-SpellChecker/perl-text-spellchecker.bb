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

RPM_NAME = "perl-Text-SpellChecker-0.14-2.22.noarch.rpm"
RPM_HASH = "88a926bbbef1a41aca3129b9191bc5268bfb73809eaabd564835a4f8dc32f807b62aac162e62c3502fb2a5eb3df106c1118291e0ae6c0af199333992c0273423"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--SpellChecker \
perl-Text-SpellChecker"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Text--Hunspell"

inherit rpm
