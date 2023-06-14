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

RPM_NAME = "perl-XML-Writer-0.900-1.12.noarch.rpm"
RPM_HASH = "03b90308daed6ae60d01d9e5105fb729c503c59da7e112e25b87538fc6efe0da9b945fcfbce7e7a179114e68ddfc1aaac3c4ea327a4b78c31e01902bdf21ddd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--Writer \
perl-XML--Writer---PrintChecker \
perl-XML--Writer---String \
perl-XML--Writer--Namespaces \
perl-XML-Writer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
