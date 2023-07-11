SUMMARY = "Interface to Gnome libxml2 xml parsing and DOM library"
DESCRIPTION = "This module is an interface to libxml2, providing XML and HTML parsers with \
DOM, SAX and XMLReader interfaces, a large subset of DOM Layer 3 interface \
and a XML::XPath-like interface to XPath API of libxml2. The module is \
split into several packages which are not described in this section; unless \
stated otherwise, you only need to 'use XML::LibXML;' in your programs."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.0208"

RPM_NAME = "perl-XML-LibXML-2.0208-1.4.aarch64.rpm"
RPM_HASH = "9a425dadea4c2d49ec722f9ceb1dd7de95de20ab84b1d6486fda1f484ba1ece3bb1c0793f3b67c17c6100702932370c05dae92bae8eb1f9d50fbb2cdc2525492"

RPROVIDES:${PN} += "perl-XML--LibXML \
perl-XML--LibXML---SAXParser \
perl-XML--LibXML--Attr \
perl-XML--LibXML--AttributeHash \
perl-XML--LibXML--Boolean \
perl-XML--LibXML--CDATASection \
perl-XML--LibXML--Comment \
perl-XML--LibXML--Common \
perl-XML--LibXML--Devel \
perl-XML--LibXML--Document \
perl-XML--LibXML--DocumentFragment \
perl-XML--LibXML--Dtd \
perl-XML--LibXML--Element \
perl-XML--LibXML--ErrNo \
perl-XML--LibXML--Error \
perl-XML--LibXML--InputCallback \
perl-XML--LibXML--Literal \
perl-XML--LibXML--NamedNodeMap \
perl-XML--LibXML--Namespace \
perl-XML--LibXML--Node \
perl-XML--LibXML--NodeList \
perl-XML--LibXML--Number \
perl-XML--LibXML--PI \
perl-XML--LibXML--Pattern \
perl-XML--LibXML--Reader \
perl-XML--LibXML--RegExp \
perl-XML--LibXML--RelaxNG \
perl-XML--LibXML--SAX \
perl-XML--LibXML--SAX--AttributeNode \
perl-XML--LibXML--SAX--Builder \
perl-XML--LibXML--SAX--Generator \
perl-XML--LibXML--SAX--Parser \
perl-XML--LibXML--Schema \
perl-XML--LibXML--Text \
perl-XML--LibXML--XPathContext \
perl-XML--LibXML--XPathExpression \
perl-XML-LibXML \
perl-XML-LibXML-Common"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
perl--MODULE-COMPAT-5.36.1 \
perl-XML--NamespaceSupport \
perl-XML--SAX \
perl-XML--SAX--Base \
perl-XML--SAX--DocumentLocator \
perl-XML--SAX--Exception \
perl-parent"

inherit rpm
