SUMMARY = "Simple API for XPath"
DESCRIPTION = "The SAXPath project is a Simple API for XPath. SAXPath is analogous to SAX \
in that the API abstracts away the details of parsing and provides a simple \
event based callback interface."
LICENSE = "Saxpath"

PV = "1.0"

RPM_NAME = "saxpath-1.0-1.1.noarch.rpm"
RPM_HASH = "4540353cfa50806f217ee9c1de46e4d8cfd40ba7bf36038777f9f54370b56dcb5f02d851f1b6eb9ec76d4eb3d92c239766693661cb35fcbbe27e39fe441213da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-saxpath-saxpath \
mvn-saxpath-saxpath-pom- \
saxpath"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
jpackage-utils"

inherit rpm
