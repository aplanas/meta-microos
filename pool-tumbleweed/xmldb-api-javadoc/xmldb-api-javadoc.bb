SUMMARY = "Documentation for XML:DB API for Java"
DESCRIPTION = "The API interfaces are what driver developers must implement when \
creating a new driver, and are the interfaces that applications are \
developed against. Along with the interfaces, a concrete DriverManager \
implementation is also provided."
LICENSE = "Apache-1.1"

PV = "0.1"

RPM_NAME = "xmldb-api-javadoc-0.1-27.7.noarch.rpm"
RPM_HASH = "c83e9dc933df08481c5ab78e0f3e0104fa5e69773fb553c7d9dcdf25918bd117daed81bb279ea3d6a8b01438d6d20069da9ff5ca4c1b8fd1c6c9aa91c5d0580b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmldb-api-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
