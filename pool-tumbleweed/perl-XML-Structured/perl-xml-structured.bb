SUMMARY = "Simple conversion API from XML to perl structures and back"
DESCRIPTION = "Provides a way to convert XML data into a predefined perl data structure and \
back to XML. Unlike with modules like XML::Simple, it is an error if the XML \
data does not match the provided skeleton (the 'DTD'). \
Another advantage is that the order of the attributes and elements is taken \
from the DTD when converting back to xml."
LICENSE = "Artistic-1.0"

PV = "1.3"

RPM_NAME = "perl-XML-Structured-1.3-1.21.aarch64.rpm"
RPM_HASH = "143463545e18d69d870d04fcd348157943924c3d201486da010597de0dc48fadaf16aba667e9a6430e012c74bb31d32d9e1599d5fe8398fa031566e4e909fc5c"

RPROVIDES:${PN} += "perl-XML--Structured \
perl-XML--Structured--saxparser \
perl-XML--Structured--saxparser-pureperl \
perl-XML-Structured"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
