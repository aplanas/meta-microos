SUMMARY = "Perl extension for writing XML documents"
DESCRIPTION = "XML::Writer is a helper module for Perl programs that write an XML \
document. The module handles all escaping for attribute values and \
character data and constructs different types of markup, such as tags, \
comments, and processing instructions. \
 \
By default, the module performs several well-formedness checks to catch \
errors during output. This behaviour can be extremely useful during \
development and debugging, but it can be turned off for production-grade \
code. \
 \
The module can operate either in regular mode in or Namespace processing \
mode. In Namespace mode, the module will generate Namespace Declarations \
itself, and will perform additional checks on the output. \
 \
Additional support is available for a simplified data mode with no mixed \
content: newlines are automatically inserted around elements and elements \
can optionally be indented based as their nesting level."
LICENSE = "MIT"

PV = "0.900"

RPM_NAME = "perl-XML-Writer-0.900-1.14.noarch.rpm"
RPM_HASH = "738332fcac6d20f0c592cddefc1843fec96a371e557120146bbc5b294fe572e729f037367cfcb513c2f1ff6908fec0322f3a9af3058c305f0bd0cdb32e190d93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--Writer \
perl-XML--Writer---PrintChecker \
perl-XML--Writer---String \
perl-XML--Writer--Namespaces \
perl-XML-Writer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
