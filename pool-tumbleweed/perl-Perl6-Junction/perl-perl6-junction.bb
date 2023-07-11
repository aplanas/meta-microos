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

RPM_NAME = "perl-Perl6-Junction-1.60000-3.27.noarch.rpm"
RPM_HASH = "961ff6afe50b1340c2deb1cf482e29267c187c033652a0714e89195a0f665f866929b90802bfaca57bd87008f6c23c19128a60a1283ba43acaca02c12ebf2cb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Perl6--Junction \
perl-Perl6--Junction--All \
perl-Perl6--Junction--Any \
perl-Perl6--Junction--Base \
perl-Perl6--Junction--None \
perl-Perl6--Junction--One \
perl-Perl6-Junction"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
