SUMMARY = "XML:DB API for Java"
DESCRIPTION = "The API interfaces are what driver developers must implement when \
creating a new driver, and are the interfaces that applications are \
developed against. Along with the interfaces, a concrete DriverManager \
implementation is also provided."
LICENSE = "Apache-1.1"

PV = "0.1"

RPM_NAME = "xmldb-common-0.1-27.6.noarch.rpm"
RPM_HASH = "7128725636abaaffef83fc2b36586809fefc0336c8bfb60a1e0e77412105a2b22a27fb1e14cbc6e6a8f6db61bd4c2ab47bf1cb04f7901e7113f36cbf0c0025e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmldb-common"

RDEPENDS:${PN} += "xmldb-api"

inherit rpm
