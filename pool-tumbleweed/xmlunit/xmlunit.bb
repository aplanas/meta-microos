SUMMARY = "Provides classes to do asserts on XML"
DESCRIPTION = "XMLUnit extends JUnit to simplify unit testing of XML. It compares a control \
XML document to a test document or the result of a transformation, validates \
documents against a DTD, and (from v0.5) compares the results of XPath \
expressions."
LICENSE = "BSD-3-Clause"

PV = "1.6"

RPM_NAME = "xmlunit-1.6-2.6.noarch.rpm"
RPM_HASH = "c40b6979f6b95458f57760e8e0f9f234ec29ff266c970736f8348fb429b3486da71322b8b4dd79ba646ca25a68613b82209eead588e864663e326324d6c0e0c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(xmlunit:xmlunit) \
mvn(xmlunit:xmlunit:pom:) \
xmlunit"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
junit \
xalan-j2 \
xerces-j2 \
xml-commons-apis"

inherit rpm
