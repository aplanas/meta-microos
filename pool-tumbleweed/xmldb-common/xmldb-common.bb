SUMMARY = "XML:DB API for Java"
DESCRIPTION = "The API interfaces are what driver developers must implement when \
creating a new driver, and are the interfaces that applications are \
developed against. Along with the interfaces, a concrete DriverManager \
implementation is also provided."
LICENSE = "Apache-1.1"

PV = "0.1"

RPM_NAME = "xmldb-common-0.1-27.7.noarch.rpm"
RPM_HASH = "74bff4d2b636a129b999043c0ae4f2d3b8c06fec9b73100093dd976fe21323e497eb2f8233c116f0cba5f84d4667821dd908b69443d64eca2cf43ca6ff670417"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmldb-common"

RDEPENDS:${PN} += "xmldb-api"

inherit rpm
