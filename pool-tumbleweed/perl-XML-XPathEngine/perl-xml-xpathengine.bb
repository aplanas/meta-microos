SUMMARY = "Re-usable XPath engine for DOM-like trees"
DESCRIPTION = "This module provides an XPath engine, that can be re-used by other \
module/classes that implement trees. \
 \
In order to use the XPath engine, nodes in the user module need to mimick \
DOM nodes. The degree of similitude between the user tree and a DOM \
dictates how much of the XPath features can be used. A module implementing \
all of the DOM should be able to use this module very easily (you might \
need to add the cmp method on nodes in order to get ordered result sets). \
 \
This code is a more or less direct copy of the the XML::XPath manpage \
module by Matt Sergeant. I only removed the XML processing part to remove \
the dependency on XML::Parser, applied a couple of patches, renamed a whole \
lot of methods to make Pod::Coverage happy, and changed the docs. \
 \
The article eXtending XML XPath, \
http://www.xmltwig.com/article/extending_xml_xpath/ should give authors who \
want to use this module enough background to do so. \
 \
Otherwise, my email is below ;--) \
 \
*WARNING*: while the underlying code is rather solid, this module mostly \
lacks docs. As they say, 'patches welcome'..."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.14"

RPM_NAME = "perl-XML-XPathEngine-0.14-5.28.noarch.rpm"
RPM_HASH = "30dbbf7c309e4286f76b0bed7a721a7c21cae79171e6ab1ed8cf0cf25de759c1c4d9e77ba92d4db19229c93f6cd47498c4b9dfaf529dd5c1a9966b7e1db4561d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--XPathEngine \
perl-XML--XPathEngine--Boolean \
perl-XML--XPathEngine--Expr \
perl-XML--XPathEngine--Function \
perl-XML--XPathEngine--Literal \
perl-XML--XPathEngine--LocationPath \
perl-XML--XPathEngine--NodeSet \
perl-XML--XPathEngine--Number \
perl-XML--XPathEngine--Root \
perl-XML--XPathEngine--Step \
perl-XML--XPathEngine--Variable \
perl-XML-XPathEngine"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
