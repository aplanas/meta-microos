SUMMARY = "Simple Generic Namespace Processor"
DESCRIPTION = "This module offers a simple to process namespaced XML names (unames) from \
within any application that may need them. It also helps maintain a prefix \
to namespace URI map, and provides a number of basic checks. \
 \
The model for this module is SAX2's NamespaceSupport class, readable at \
http://www.saxproject.org/namespaces.html It adds a few perlisations where \
we thought it appropriate."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.12"

RPM_NAME = "perl-XML-NamespaceSupport-1.12-1.25.noarch.rpm"
RPM_HASH = "bc2c8cbe7bac05b455765326b11ee5d85d80ff37b9f68727f25ea6b0e6061a6fe042f9c3d1df4135903656bf373156c03d8f6f2ef5e7c898d8458256b1a11915"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--NamespaceSupport \
perl-XML-NamespaceSupport"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
