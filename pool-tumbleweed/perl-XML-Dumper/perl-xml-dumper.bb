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

RPM_NAME = "perl-XML-Dumper-0.81-69.31.aarch64.rpm"
RPM_HASH = "37879a34e5f84116dfb9dc59a15ee4c4fdb76787b75963fb5b8e2a240a76736707c052bd5be5f3de36c1100a555f4d5d201af18a3138117526ad6a494dee0d84"

RPROVIDES:${PN} += "perl-XML--Dumper \
perl-XML-Dumper"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-XML-Parser"

inherit rpm
