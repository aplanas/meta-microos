SUMMARY = "XML::NodeFilter"
DESCRIPTION = "XML::NodeFilter is a generic node filter class for DOM traversal as \
specified in the DOM Level 2 Traversal and Range specification. It \
extends that specification, so this class is easier to use for Perl \
programmers."
LICENSE = "Artistic-1.0"

PV = "0.01"

RPM_NAME = "perl-XML-NodeFilter-0.01-194.30.aarch64.rpm"
RPM_HASH = "ee997f2065eadfbe596528b193c25bc93b4aebef0984ef56009733ae90d153903ee011fe96ab62f811553c84cacb42840f14dfa396a2c42f9bd86625824a5dc9"

RPROVIDES:${PN} += "perl-XML--NodeFilter \
perl-XML-NodeFilter"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
