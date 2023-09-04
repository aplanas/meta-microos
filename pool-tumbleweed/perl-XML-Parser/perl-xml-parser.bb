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

RPM_NAME = "perl-XML-Parser-2.46-1.21.aarch64.rpm"
RPM_HASH = "98e13299e66ea7f74a87bfaa43665230d9d0f268163d919eb81fec067ae505cf490fa06f73401c6b979a934f74543f85cf9712fba34aaaaa5e700b17b2b8b4e0"

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
perl--MODULE-COMPAT-5.38.0 \
perl-LWP--UserAgent"

inherit rpm
