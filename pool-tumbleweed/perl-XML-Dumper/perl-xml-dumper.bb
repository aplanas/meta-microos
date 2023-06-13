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

RPM_NAME = "perl-XML-Dumper-0.81-69.29.aarch64.rpm"
RPM_HASH = "79ee0d37cc058b842c379b2fdbcd29a2eac830c296cfd8e31013c7d3b2f13400ecfb5c8e0d3bc2b4795952e7101d65c29efa61fa65207a5c51abe8681dace608"

RPROVIDES:${PN} += "perl(XML::Dumper) \
perl-XML-Dumper \
perl-XML-Dumper(aarch-64)"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl-XML-Parser"

inherit rpm
