SUMMARY = "Simple conversion API from XML to perl structures and back"
DESCRIPTION = "Provides a way to convert XML data into a predefined perl data structure and \
back to XML. Unlike with modules like XML::Simple, it is an error if the XML \
data does not match the provided skeleton (the 'DTD'). \
Another advantage is that the order of the attributes and elements is taken \
from the DTD when converting back to xml."
LICENSE = "Artistic-1.0"

PV = "1.3"

RPM_NAME = "perl-XML-Structured-1.3-1.20.aarch64.rpm"
RPM_HASH = "869c15d3261f2854dcf64ba7d409ea6888bf51708f037e933962f5dbde6728785df41d3dbfcb5abe6f8318730be1a10f5d097432883f8de015b25ee8ed0c247f"

RPROVIDES:${PN} += "perl-XML--Structured \
perl-XML--Structured--saxparser \
perl-XML--Structured--saxparser-pureperl \
perl-XML-Structured"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
