SUMMARY = "Base class SAX Drivers and Filters"
DESCRIPTION = "This module has a very simple task - to be a base class for PerlSAX drivers \
and filters. It's default behaviour is to pass the input directly to the \
output unchanged. It can be useful to use this module as a base class so \
you don't have to, for example, implement the characters() callback. \
 \
The main advantages that it provides are easy dispatching of events the \
right way (ie it takes care for you of checking that the handler has \
implemented that method, or has defined an AUTOLOAD), and the guarantee \
that filters will pass along events that they aren't implementing to \
handlers downstream that might nevertheless be interested in them."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.09"

RPM_NAME = "perl-XML-SAX-Base-1.09-1.23.noarch.rpm"
RPM_HASH = "f5413741cddb53b10bfc714d7bf7fa87babcc8c4cc2798848d056386167bd4ea3386a3c361fbec2b6cd85e8cd415960a7eb9be679e5b11e5670fa5680f2c7767"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(XML::SAX::Base) \
perl(XML::SAX::Base::NoHandler) \
perl(XML::SAX::Exception) \
perl-XML-SAX-Base"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
