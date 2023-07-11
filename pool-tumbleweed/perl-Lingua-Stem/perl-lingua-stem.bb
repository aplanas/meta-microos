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

RPM_NAME = "perl-Lingua-Stem-2.31-1.13.noarch.rpm"
RPM_HASH = "ea1e7eb0decb9e6c0ecbed94ba3073641d0c08a2aad713174eb4aaf1c7fae741136e4f446f19baa457e51061e48f1859f19ff514a4bc27fe74e9b8d87cc083d8"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
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
