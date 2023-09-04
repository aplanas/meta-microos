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

RPM_NAME = "perl-B-Keywords-1.26-1.2.noarch.rpm"
RPM_HASH = "c5d1c66a40bf16fcd90fe54a0e4d67dfdf02e3b73f10d930ab96e024ee0401d7b2f40583d6c4f6f04d674f3b7dead424e88d8c654aac72498ebe12a594da05e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-B--Keywords \
perl-B-Keywords"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
