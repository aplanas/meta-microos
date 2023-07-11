SUMMARY = "Add pleasant whitespace to a DOM tree"
DESCRIPTION = "Long XML files can be daunting for humans to read. Of course, XML is really \
designed for computers to read - not people - but there are times when mere \
mortals do need to read and edit XML by hand. For example, if your \
application stores its configuration in XML, or you need to dump some XML \
to STDOUT for debugging purposes. \
 \
Syntax highlighting helps, but to really make sense of some XML, proper \
indentation can be vital. Hence 'XML::LibXML::PrettyPrint' - it can be \
applied to an the XML::LibXML manpage DOM tree to reformat it into a more \
readable result. \
 \
Pretty-printing XML is not as CPU-efficient as dumping it out sloppily, so \
unless you're pretty sure that a human is going to need to make sense of \
your XML, you should probably not use this module."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.006"

RPM_NAME = "perl-XML-LibXML-PrettyPrint-0.006-1.16.noarch.rpm"
RPM_HASH = "5e00822202a2bc4daec6c8ebb0a8f05531dea0c3b8d98e3b2fcdd489c4d83ef26649ed3934a27d22086dcae7ead3a5cb419dd7374d4c36c64fe8e111d7901683"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--LibXML--PrettyPrint \
perl-XML-LibXML-PrettyPrint"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-Exporter--Tiny \
perl-XML--LibXML \
perl-XML--Simple"

inherit rpm
