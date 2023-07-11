SUMMARY = "Lists of reserved barewords and symbol names"
DESCRIPTION = "'B::Keywords' supplies several arrays of exportable keywords: '@Scalars', \
'@Arrays', '@Hashes', '@Filehandles', '@Symbols', '@Functions', \
'@Barewords', '@BarewordsExtra', '@TieIOMethods', '@UNIVERSALMethods' and \
'@ExporterSymbols'. \
 \
The '@Symbols' array includes the contents of each of '@Scalars', \
'@Arrays', '@Hashes', '@Functions' and '@Filehandles'. \
 \
Similarly, '@Barewords' adds a few non-function keywords and operators to \
the '@Functions' array. \
 \
'@BarewordsExtra' adds a few barewords which are not in keywords.h. \
 \
All additions and modifications are welcome. \
 \
The perl parser uses a static list of keywords from _regen/keywords.pl_ \
which constitutes the strict list of keywords @Functions and @Barewords, \
though some @Functions are not functions in the strict sense. Several \
library functions use more special symbols, handles and methods."
LICENSE = "Artistic-1.0 | GPL-2.0-only"

PV = "1.24"

RPM_NAME = "perl-B-Keywords-1.24-1.8.noarch.rpm"
RPM_HASH = "bd5f74c7ec8ff68a989a567140faab3a48d9b509d84f553a3fb2ff242a322ed33a2ca8a92c633adde38d24d95f7cf801ee60a1ca9f6cb794a842a3171f27fbbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-B--Keywords \
perl-B-Keywords"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
