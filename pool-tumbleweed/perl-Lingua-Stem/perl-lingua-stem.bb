SUMMARY = "Stemming of words"
DESCRIPTION = "This routine applies stemming algorithms to its parameters, returning the \
stemmed words as appropriate to the selected locale. \
 \
You can import some or all of the class methods. \
 \
use Lingua::Stem qw (stem clear_stem_cache stem_caching add_exceptions \
delete_exceptions get_exceptions set_locale get_locale :all :locale \
:exceptions :stem :caching); \
 \
 :all        - imports  stem add_exceptions delete_exceptions get_exceptions \
               set_locale get_locale \
 :stem       - imports  stem \
 :caching    - imports  stem_caching clear_stem_cache \
 :locale     - imports  set_locale get_locale \
 :exceptions - imports  add_exceptions delete_exceptions get_exceptions \
 \
Currently supported locales are: \
 \
      DA          - Danish \
      DE          - German \
      EN          - English (also EN-US and EN-UK) \
      FR          - French \
      GL          - Galician \
      IT          - Italian \
      NO          - Norwegian \
      PT          - Portuguese \
      RU          - Russian (also RU-RU and RU-RU.KOI8-R) \
      SV          - Swedish \
 \
If you have the memory and lots of stemming to do, I *strongly* suggest \
using cache level 2 and processing lists in 'big chunks' (long lists) for \
best performance."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.31"

RPM_NAME = "perl-Lingua-Stem-2.31-1.14.noarch.rpm"
RPM_HASH = "b890aea2e798cca675782a451d7922aaa6849f16b8399d9f56fdf51da7667d9c1d15b22b957db41e9f418d9ddd6d7595e2abe83eaf61d9ebfc63ecab461d1cb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--Stem \
perl-Lingua--Stem--AutoLoader \
perl-Lingua--Stem--Da \
perl-Lingua--Stem--De \
perl-Lingua--Stem--En \
perl-Lingua--Stem--EnBroken \
perl-Lingua--Stem--Gl \
perl-Lingua--Stem--No \
perl-Lingua--Stem--Pt \
perl-Lingua--Stem--Sv \
perl-Lingua-Stem"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Lingua--GL--Stemmer \
perl-Lingua--PT--Stemmer \
perl-Lingua--Stem--Fr \
perl-Lingua--Stem--It \
perl-Lingua--Stem--Ru \
perl-Lingua--Stem--Snowball--Da \
perl-Lingua--Stem--Snowball--No \
perl-Lingua--Stem--Snowball--Se \
perl-Text--German"

inherit rpm
