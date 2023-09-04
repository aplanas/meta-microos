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

RPM_NAME = "perl-XML-LibXML-Simple-1.01-1.15.noarch.rpm"
RPM_HASH = "7182aee007e2286223e5eb850e78ee38446badfb4a435af6281a9de06d455e80ab3a0cc7712c505e07cd79586e967ac26f2c16d345f020a048aaa5f3131e1a78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--LibXML--Simple \
perl-XML-LibXML-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-XML--LibXML"

inherit rpm
