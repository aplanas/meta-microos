SUMMARY = "Convert singular to plural. Select 'a' or 'an'"
DESCRIPTION = "*[_Note:_ This module is strictly in maintenance mode now. Take a look at \
the newer Lingua::EN::Inflexion module, which offers a cleaner and more \
convenient interface, has many more features (including plural->singular \
inflexions), and is also much better tested. If you have existing code that \
relies on Lingua::EN::Inflect, see the section of the documentation \
entitled 'CONVERTING FROM LINGUA::EN::INFLECT'. ]* \
 \
The exportable subroutines of Lingua::EN::Inflect provide plural \
inflections, 'a'/'an' selection for English words, and manipulation of \
numbers as words \
 \
Plural forms of all nouns, most verbs, and some adjectives are provided. \
Where appropriate, 'classical' variants (for example: 'brother' -> \
'brethren', 'dogma' -> 'dogmata', etc.) are also provided. \
 \
Pronunciation-based 'a'/'an' selection is provided for all English words, \
and most initialisms. \
 \
It is also possible to inflect numerals (1,2,3) to ordinals (1st, 2nd, 3rd) \
and to English words ('one', 'two', 'three). \
 \
In generating these inflections, Lingua::EN::Inflect follows the Oxford \
English Dictionary and the guidelines in Fowler's Modern English Usage, \
preferring the former where the two disagree. \
 \
The module is built around standard British spelling, but is designed to \
cope with common American variants as well. Slang, jargon, and other \
English dialects are _not_ explicitly catered for. \
 \
Where two or more inflected forms exist for a single word (typically a \
'classical' form and a 'modern' form), Lingua::EN::Inflect prefers the more \
common form (typically the 'modern' one), unless 'classical' processing has \
been specified (see 'MODERN VS CLASSICAL INFLECTIONS')."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.905"

RPM_NAME = "perl-Lingua-EN-Inflect-1.905-1.12.noarch.rpm"
RPM_HASH = "15605a1fa1b0eae36b36ef3f6e353c6a61ceda38f7a09d647a40677123b7ed72cebb13dfb602dd943aba045debe45a43650947ad4c8d2fa497df6a74c73d15d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--EN--Inflect \
perl-Lingua-EN-Inflect"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
