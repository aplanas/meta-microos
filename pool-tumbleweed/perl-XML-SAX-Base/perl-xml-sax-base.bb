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

RPM_NAME = "perl-XML-SAX-Base-1.09-1.25.noarch.rpm"
RPM_HASH = "5d7f65b1c927fc0938b425766aa510a768c4fe13c7d30bf9d817ef26adda9d5ef099d1f7560f5b7fe23f891355358f49bed02e70b816b1638d8d63d787685cbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--SAX--Base \
perl-XML--SAX--Base--NoHandler \
perl-XML--SAX--Exception \
perl-XML-SAX-Base"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
