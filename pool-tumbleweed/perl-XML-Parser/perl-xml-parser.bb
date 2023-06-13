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

RPM_NAME = "perl-XML-Parser-2.46-1.19.aarch64.rpm"
RPM_HASH = "9e40127a84752a8118f58ad0f42f298c90eae4bf325531891afa397b0b272a94e4d99cd9e5d29ff20c278a695f24a5090cc487a8bbbe344df8fc7dc1aa5f6923"

RPROVIDES:${PN} += "perl(XML::Parser) \
perl(XML::Parser::Expat) \
perl(XML::Parser::Style::Debug) \
perl(XML::Parser::Style::Objects) \
perl(XML::Parser::Style::Stream) \
perl(XML::Parser::Style::Subs) \
perl(XML::Parser::Style::Tree) \
perl-XML-Parser \
perl-XML-Parser(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libexpat.so.1()(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(LWP::UserAgent)"

inherit rpm
