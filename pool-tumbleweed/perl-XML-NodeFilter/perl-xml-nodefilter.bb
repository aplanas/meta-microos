SUMMARY = "XML::NodeFilter"
DESCRIPTION = "XML::NodeFilter is a generic node filter class for DOM traversal as \
specified in the DOM Level 2 Traversal and Range specification. It \
extends that specification, so this class is easier to use for Perl \
programmers."
LICENSE = "Artistic-1.0"

PV = "0.01"

RPM_NAME = "perl-XML-NodeFilter-0.01-194.31.aarch64.rpm"
RPM_HASH = "4224c207859ac74cc4b4fc5bd06021085db1336e2966c3a49a414b1b9eba5dc3f2c60e8b35d9025da52ef5948fe639a7916352c1866d8fe707053bda33cb651c"

RPROVIDES:${PN} += "perl-XML--NodeFilter \
perl-XML-NodeFilter"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
