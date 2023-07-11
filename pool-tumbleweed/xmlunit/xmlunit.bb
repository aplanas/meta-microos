SUMMARY = "Provides classes to do asserts on XML"
DESCRIPTION = "XMLUnit extends JUnit to simplify unit testing of XML. It compares a control \
XML document to a test document or the result of a transformation, validates \
documents against a DTD, and (from v0.5) compares the results of XPath \
expressions."
LICENSE = "BSD-3-Clause"

PV = "1.6"

RPM_NAME = "xmlunit-1.6-2.7.noarch.rpm"
RPM_HASH = "7af55014b2f28367069969dcef7100bb42e64c48d175882ba90147060cd51e868845c367fb2d6d93c42a9eabc6219d19c05c274faa127f73404bb20a7cde6d42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-xmlunit-xmlunit \
mvn-xmlunit-xmlunit-pom- \
xmlunit"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
junit \
xalan-j2 \
xerces-j2 \
xml-commons-apis"

inherit rpm
