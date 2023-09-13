SUMMARY = "Apache Felix Service Component Runtime (SCR)"
DESCRIPTION = "Implementation of the OSGi Declarative Services Specification Version 1.3 (R6)."
LICENSE = "Apache-2.0"

PV = "2.1.16"

RPM_NAME = "felix-scr-2.1.16-2.1.noarch.rpm"
RPM_HASH = "df87aa9393da41a904e243408368388e4824ea629f830c36f88c39d3c2e5876ec47d807610e027fb51d8696bc580f60268fcb6154ad1492e6ae71f160982e0f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-scr \
mvn-org.apache.felix-org.apache.felix.scr \
mvn-org.apache.felix-org.apache.felix.scr-pom- \
osgi-org.apache.felix.scr"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
