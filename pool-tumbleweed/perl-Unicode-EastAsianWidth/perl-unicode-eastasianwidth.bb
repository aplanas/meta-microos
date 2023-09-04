SUMMARY = "East Asian Width properties"
DESCRIPTION = "This module provide user-defined Unicode properties that deal with width \
status of East Asian characters, as specified in \
http://www.unicode.org/unicode/reports/tr11/. \
 \
It exports the following functions to the caller's scope, to be used by \
Perl's Unicode matching system: 'InEastAsianFullwidth', \
'InEastAsianHalfwidth', 'InEastAsianAmbiguous', 'InEastAsianNarrow' \
'InEastAsianWide', 'InEastAsianNeutral'. \
 \
In accord to TR11 cited above, two additional context-sensitive properties \
are exported: 'InFullwidth' (union of 'Fullwidth' and 'Wide') and \
'InHalfwidth' (union of 'Halfwidth', 'Narrow' and 'Neutral'). \
 \
_Ambiguous_ characters are treated by default as part of 'InHalfwidth', but \
you can modify this behaviour by assigning a true value to \
'$Unicode::EastAsianWidth::EastAsian' at compile time within a 'BEGIN' \
block before loading this module: \
 \
    BEGIN { $Unicode::EastAsianWidth::EastAsian = 1; } \
    use Unicode::EastAsianWidth; \
 \
Setting '$Unicode::EastAsianWidth::EastAsian' at run-time used to work on \
Perl versions between 5.8 and 5.14 due to an implementation detail, but it \
will no longer work on Perl 5.16 and later versions, and hence is not \
recommended."
LICENSE = "CC0-1.0"

PV = "12.0"

RPM_NAME = "perl-Unicode-EastAsianWidth-12.0-1.14.noarch.rpm"
RPM_HASH = "c23b1d8ce54137846f3c5babe6b32ab9b003883f233b1daf2417072730a14530b0da72acf0dd34a3a6947a8432cbc075e34a79c240ad732f80130c7b1fc05dfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Unicode--EastAsianWidth \
perl-Unicode-EastAsianWidth"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
