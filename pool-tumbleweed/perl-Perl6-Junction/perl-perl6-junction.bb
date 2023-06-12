SUMMARY = "Perl6 style Junction operators in Perl5."
DESCRIPTION = "This is a lightweight module which provides 'Junction' operators, the most \
commonly used being 'any' and 'all'. \
 \
Inspired by the Perl6 design docs, the \
http://dev.perl.org/perl6/doc/design/exe/E06.html manpage. \
 \
Provides a limited subset of the functionality of the \
Quantum::Superpositions manpage, see the /'SEE ALSO' manpage for comment. \
 \
Notice in the the /SYNOPSIS manpage above, that if you want to match \
against a regular expression, you must use '==' or '!='. *Not* '=~' or \
'!~'. You must also use a regex object, such as 'qr/\\d/', not a plain regex \
such as '/\\d/'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.60000"

RPM_NAME = "perl-Perl6-Junction-1.60000-3.26.noarch.rpm"
RPM_HASH = "81ef6cca879185904c0d8cd12a309e4edb187cf608ac9eaa81da4c0e67af65c1e0caa7b8b37136b4f745282e3310d3c939ffc1cc4c3f19a117f6843f7a4864d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Perl6::Junction) \
perl(Perl6::Junction::All) \
perl(Perl6::Junction::Any) \
perl(Perl6::Junction::Base) \
perl(Perl6::Junction::None) \
perl(Perl6::Junction::One) \
perl-Perl6-Junction"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
