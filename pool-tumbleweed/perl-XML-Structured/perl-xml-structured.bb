SUMMARY = "Simple conversion API from XML to perl structures and back"
DESCRIPTION = "Provides a way to convert XML data into a predefined perl data structure and \
back to XML. Unlike with modules like XML::Simple, it is an error if the XML \
data does not match the provided skeleton (the 'DTD'). \
Another advantage is that the order of the attributes and elements is taken \
from the DTD when converting back to xml."
LICENSE = "Artistic-1.0"

PV = "1.3"

RPM_NAME = "perl-XML-Structured-1.3-1.19.aarch64.rpm"
RPM_HASH = "722f445a5d957bcc399892ac9dba5102ba1dc8ff8fb83021899ff42ccd784bf447d1249d6e8378bcf07570e526eb538531db05988a9fa165971928612c7f4e77"

RPROVIDES:${PN} += "perl(XML::Structured) \
perl(XML::Structured::saxparser) \
perl(XML::Structured::saxparser_pureperl) \
perl-XML-Structured \
perl-XML-Structured(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
