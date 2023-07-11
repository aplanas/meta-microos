SUMMARY = "Perl module for parsing XML documents"
DESCRIPTION = "This module provides ways to parse XML documents. It is built on top of \
XML::Parser::Expat, which is a lower level interface to James Clark's expat \
library. Each call to one of the parsing methods creates a new instance of \
XML::Parser::Expat which is then used to parse the document. Expat options \
may be provided when the XML::Parser object is created. These options are \
then passed on to the Expat object on each parse call. They can also be \
given as extra arguments to the parse methods, in which case they override \
options given at XML::Parser creation time. \
 \
The behavior of the parser is controlled either by 'STYLES' and/or \
'HANDLERS' options, or by setHandlers method. These all provide mechanisms \
for XML::Parser to set the handlers needed by XML::Parser::Expat. If \
neither 'Style' nor 'Handlers' are specified, then parsing just checks the \
document for being well-formed. \
 \
When underlying handlers get called, they receive as their first parameter \
the _Expat_ object, not the Parser object."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.46"

RPM_NAME = "perl-XML-Parser-2.46-1.20.aarch64.rpm"
RPM_HASH = "0feb70a01a3672b3b2a75c92b3c2be88c520bf7b9689b1792ad7cbb7e220adc89aabbfdc1cb394a52de1fb72e7b1c49b96c11ab19aa2d5a50c2fa379e80e4625"

RPROVIDES:${PN} += "perl-XML--Parser \
perl-XML--Parser--Expat \
perl-XML--Parser--Style--Debug \
perl-XML--Parser--Style--Objects \
perl-XML--Parser--Style--Stream \
perl-XML--Parser--Style--Subs \
perl-XML--Parser--Style--Tree \
perl-XML-Parser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
perl--MODULE-COMPAT-5.36.1 \
perl-LWP--UserAgent"

inherit rpm
