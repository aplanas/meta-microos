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

RPM_NAME = "perl-XML-NamespaceSupport-1.12-1.24.noarch.rpm"
RPM_HASH = "582a0cef555e6d31cda5978590db40fce257bd64e75e0c708f8ea100bd9ba143c8e1e9695abc4f02e9c023b5d1c8cfc4b8c7da8ff9c30098cc9e10de461aed41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--NamespaceSupport \
perl-XML-NamespaceSupport"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
