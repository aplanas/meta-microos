SUMMARY = "Plain Ascii Transliterations of Unicode Text"
DESCRIPTION = "It often happens that you have non-Roman text data in Unicode, but you \
can't display it-- usually because you're trying to show it to a user via \
an application that doesn't support Unicode, or because the fonts you need \
aren't accessible. You could represent the Unicode characters as '???????' \
or '\\15BA\\15A0\\1610...', but that's nearly useless to the user who actually \
wants to read what the text says. \
 \
What Text::Unidecode provides is a function, 'unidecode(...)' that takes \
Unicode data and tries to represent it in US-ASCII characters (i.e., the \
universally displayable characters between 0x00 and 0x7F). The \
representation is almost always an attempt at _transliteration_-- i.e., \
conveying, in Roman letters, the pronunciation expressed by the text in \
some other writing system. (See the example in the synopsis.) \
 \
NOTE: \
 \
To make sure your perldoc/Pod viewing setup for viewing this page is \
working: The six-letter word 'résumé' should look like 'resume' with an '/' \
accent on each 'e'. \
 \
For further tests, and help if that doesn't work, see below, A POD ENCODING \
TEST."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.30"

RPM_NAME = "perl-Text-Unidecode-1.30-2.36.noarch.rpm"
RPM_HASH = "aebd91d6b160a2e83e1989a297478a5e1d09ac0977a0837820f30f66f0ff2e8e0e7292536b2d9de873fafa4d8e60ae4bc40dcecb52f096da593418360984d6b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Text::Unidecode) \
perl-Text-Unidecode"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
