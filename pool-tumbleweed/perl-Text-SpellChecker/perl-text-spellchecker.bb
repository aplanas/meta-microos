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

RPM_NAME = "perl-Text-SpellChecker-0.14-2.21.noarch.rpm"
RPM_HASH = "c8a65e7439cd5143f46208f74cbc74638104d4f6b7c8b46bf15a4acd1f2c1432cd33e3547935c4b25fd285b1542023cae405e7a9e8c44da72532711025030519"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Text::SpellChecker) \
perl-Text-SpellChecker"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Text::Hunspell)"

inherit rpm
