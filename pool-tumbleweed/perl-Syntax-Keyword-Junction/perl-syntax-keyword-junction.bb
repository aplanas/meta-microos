SUMMARY = "Perl6 style Junction operators in Perl5"
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

PV = "0.003008"

RPM_NAME = "perl-Syntax-Keyword-Junction-0.003008-1.26.noarch.rpm"
RPM_HASH = "157e7f1411ebbe09ec55dbc510fa7acad3e12680cc51ce0db8c05e1131a78d29f13be1c20f1542b7bef9b177bd48602894324fc960ce96147363087de060cf71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Syntax--Feature--Junction \
perl-Syntax--Keyword--Junction \
perl-Syntax--Keyword--Junction--All \
perl-Syntax--Keyword--Junction--Any \
perl-Syntax--Keyword--Junction--Base \
perl-Syntax--Keyword--Junction--None \
perl-Syntax--Keyword--Junction--One \
perl-Syntax-Keyword-Junction"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Sub--Exporter--Progressive \
perl-parent \
perl-syntax"

inherit rpm
