SUMMARY = "Perl module for dumping Perl objects from/to XML"
DESCRIPTION = "XML::Dumper dumps Perl data to XML format. XML::Dumper can also read \
XML data that was previously dumped by the module and convert it back \
to Perl. You can use the module read the XML from a file and write the \
XML to a file. Perl objects are blessed back to their original \
packaging; if the modules are installed on the system where the perl \
objects are reconstituted from xml, they will behave as expected. \
Intuitively, if the perl objects are converted and reconstituted in the \
same environment, all should be well. And it is. \
 \
  Authors: \
		Mike Wong <mike_w3@pacbell.net> \
		Jonathan Eisenzopf <eisen@pobox.com>"
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "0.81"

RPM_NAME = "perl-XML-Dumper-0.81-69.30.aarch64.rpm"
RPM_HASH = "6c46689c87559942151e53718cd83c2386d9b8a133deeb5dd122f342a8f6e1eb72b4915c61879112428e66ac57e104e08cd56cea22f84cd6f122dbee0d481271"

RPROVIDES:${PN} += "perl-XML--Dumper \
perl-XML-Dumper"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-XML-Parser"

inherit rpm
