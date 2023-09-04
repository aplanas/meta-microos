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

RPM_NAME = "perl-Text-Unidecode-1.30-2.41.noarch.rpm"
RPM_HASH = "7a640afc6d4e50df6a027eb831f4f599aacab2eb63364627d63d6c1f75cd0208e27db9541742b874208283eed808be9a4808839bc324d3fd20595ca680b3bf21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Unidecode \
perl-Text-Unidecode"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
