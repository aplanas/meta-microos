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

RPM_NAME = "perl-Syntax-Keyword-Junction-0.003008-1.27.noarch.rpm"
RPM_HASH = "4c0131df8a3beb923d52996e79f811c07f363dbf942ee346e550f4927f4f1c1a799970c8c2dfa367246ddfd749c92a670e12874280f82b95f90795d701536272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Syntax--Feature--Junction \
perl-Syntax--Keyword--Junction \
perl-Syntax--Keyword--Junction--All \
perl-Syntax--Keyword--Junction--Any \
perl-Syntax--Keyword--Junction--Base \
perl-Syntax--Keyword--Junction--None \
perl-Syntax--Keyword--Junction--One \
perl-Syntax-Keyword-Junction"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Sub--Exporter--Progressive \
perl-parent \
perl-syntax"

inherit rpm
