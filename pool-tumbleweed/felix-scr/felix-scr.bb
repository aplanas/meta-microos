SUMMARY = "Apache Felix Service Component Runtime (SCR)"
DESCRIPTION = "Implementation of the OSGi Declarative Services Specification Version 1.3 (R6)."
LICENSE = "Apache-2.0"

PV = "2.1.16"

RPM_NAME = "felix-scr-2.1.16-1.19.noarch.rpm"
RPM_HASH = "c9601a557b73642ed8a9398fc23f41ceab73909280caf59c7f9da0ab197fd0e338b2c342f86a5a65830102ce546830ac48895d6e4b49a72d2ac8dd3997272ac5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-scr \
mvn-org.apache.felix-org.apache.felix.scr \
mvn-org.apache.felix-org.apache.felix.scr-pom- \
osgi-org.apache.felix.scr"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
