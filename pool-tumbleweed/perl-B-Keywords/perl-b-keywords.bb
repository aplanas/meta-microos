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

PV = "1.26"

RPM_NAME = "perl-B-Keywords-1.26-1.1.noarch.rpm"
RPM_HASH = "77f3138a292281754bdbbe84d6b1aab8862bca485d53c6b3a5932b06daa117d1ed6579c954d884b75be1002defb10ffecacfcdbb68c20d9bd5d0863200574a92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-B--Keywords \
perl-B-Keywords"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
