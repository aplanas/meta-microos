SUMMARY = "XML::LibXML clone of XML::Simple::XMLin()"
DESCRIPTION = "This module is a blunt rewrite of XML::Simple (by Grant McLean) to use the \
XML::LibXML parser for XML structures, where the original uses plain Perl \
or SAX parsers. \
 \
*Be warned:* this module thinks to be smart. You may very well shoot \
yourself in the foot with this DWIMmery. Read the whole manual page at \
least once before you start using it. If your XML is described in a schema \
or WSDL, then use XML::Compile for maintainable code."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.01"

RPM_NAME = "perl-XML-LibXML-Simple-1.01-1.14.noarch.rpm"
RPM_HASH = "87db5b22c4e613d8d5b12d197c25b08325ac8a68bca7478585d5a6cbec5d8c346fb74fd73168c708c41831d67363e848531c0efd31c59d719eb0ce2853ebd1a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--LibXML--Simple \
perl-XML-LibXML-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-XML--LibXML"

inherit rpm
