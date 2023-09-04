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

RPM_NAME = "perl-XML-LibXML-PrettyPrint-0.006-1.17.noarch.rpm"
RPM_HASH = "fb7cbfc93cce0d2542229bb6a4c837f2d49a3eedd6d8e10d1b059b3ed5a80ae2b171597faafc0c0e33f8c788e5b24f2a14d1b6a0f35fe261ba6d1590733327e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--LibXML--PrettyPrint \
perl-XML-LibXML-PrettyPrint"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-Exporter--Tiny \
perl-XML--LibXML \
perl-XML--Simple"

inherit rpm
