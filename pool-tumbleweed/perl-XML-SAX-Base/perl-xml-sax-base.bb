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

RPM_NAME = "perl-XML-SAX-Base-1.09-1.24.noarch.rpm"
RPM_HASH = "04edf3e086afa8f47215a6e04ef270ede2ab3bf60ebb3ef6ee37feef939619ead505ff482811463a4b145f26fb664c0d191f39076d246da7609e310d1eeca45d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--SAX--Base \
perl-XML--SAX--Base--NoHandler \
perl-XML--SAX--Exception \
perl-XML-SAX-Base"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
