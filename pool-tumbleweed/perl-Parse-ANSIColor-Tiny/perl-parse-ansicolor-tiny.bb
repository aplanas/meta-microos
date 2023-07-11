SUMMARY = "Determine attributes of ANSI-Colored string"
DESCRIPTION = "Parse a string colored with ANSI escape sequences into a structure suitable \
for reformatting (into HTML, for example). \
 \
The output of terminal commands can be marked up with colors and formatting \
that in some instances you'd like to preserve. \
 \
This module is essentially the inverse of Term::ANSIColor. The array refs \
returned from parse can be passed back in to 'Term::ANSIColor::colored'. \
The strings may not match exactly due to different ways the attributes can \
be specified, but the end result should be colored the same. \
 \
This is a '::Tiny' module... it attempts to be correct for most cases with \
a small amount of code. It may not be 100% correct, especially in complex \
cases. It only handles the 'm' escape sequence ('\\033[0m') which produces \
colors and simple attributes (bold, underline) (like what can be produced \
with Term::ANSIColor). Other escape sequences are removed by default but \
you can disable this by passing 'remove_escapes => 0' to the constructor. \
 \
If you do find bugs please submit tickets (with patches, if possible)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.700"

RPM_NAME = "perl-Parse-ANSIColor-Tiny-0.700-1.3.noarch.rpm"
RPM_HASH = "499e44057df61ee9234de4e4156edb19ac0b929d6ae124d6ff6a328945428f3fdd7b4084be56edcab6cd8e4c75b8b3872368e24632c6425cce002c5b8cb79063"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Parse--ANSIColor--Tiny \
perl-Parse-ANSIColor-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
