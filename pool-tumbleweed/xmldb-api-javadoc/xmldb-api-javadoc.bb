SUMMARY = "Documentation for XML:DB API for Java"
DESCRIPTION = "The API interfaces are what driver developers must implement when \
creating a new driver, and are the interfaces that applications are \
developed against. Along with the interfaces, a concrete DriverManager \
implementation is also provided."
LICENSE = "Apache-1.1"

PV = "0.1"

RPM_NAME = "xmldb-api-javadoc-0.1-27.6.noarch.rpm"
RPM_HASH = "3fcc4fe2b72a8837b1d51f1234a786423323fa1db0b8217579a9c9aa7bef08dbf371967230aa0774a952c933260d59c215c02824ec214aa56018387c0d737781"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmldb-api-javadoc"
RDEPENDS:${PN} += ""

inherit rpm
