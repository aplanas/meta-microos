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

RPM_NAME = "perl-XML-LibXML-Simple-1.01-1.13.noarch.rpm"
RPM_HASH = "ad160e756b60af7d884319a67c1092039679d66ba5fe9f220225ce8b51c2a8747bc426cfe05f615cd49ab3a38bc516c0429c2e0aea80506578de3757b3a07995"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(XML::LibXML::Simple) \
perl-XML-LibXML-Simple"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(XML::LibXML)"

inherit rpm
