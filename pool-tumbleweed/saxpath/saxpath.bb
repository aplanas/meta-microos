SUMMARY = "SAXPath is an event-based API for XPath parsers"
DESCRIPTION = "SAXPath is an event-based API for XPath parsers, that is, for parsers \
which parse XPath  expressions. SAXPath is intended to be for XPath \
what SAX is for XML. Note that the SAXPath package only parses XPath \
expressions; it does not evaluate them, or even provide an object \
structure for representing them once they have been parsed."
LICENSE = "Apache-2.0"

PV = "1.0_FCS"

RPM_NAME = "saxpath-1.0_FCS-39.7.noarch.rpm"
RPM_HASH = "d440dc7a959e4b206ceed061f56ec481106ff484fd48e1374d92a8aa0e2b980d7d6cbc8061f4ae5affe195b91251cb3dfcdc0b70a51125f23a4c9ce5df14c898"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-saxpath-saxpath \
mvn-saxpath-saxpath-pom- \
saxpath"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
