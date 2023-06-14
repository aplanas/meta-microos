SUMMARY = "Felix OSGi OBR Service API"
DESCRIPTION = "OSGi OBR Service API."
LICENSE = "Apache-2.0"

PV = "1.0.2"

RPM_NAME = "felix-osgi-obr-1.0.2-1.6.noarch.rpm"
RPM_HASH = "f2f5ed2c00f8bc7a2d19472a746e038e5d633f6f37b9b253d144d9b2785aed066949d271b8f4ece80fc96cb73d8a99bbde761934be28d9ca62c30753c4ce4a42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-osgi-obr \
mvn-org.apache.felix-org.osgi.service.obr \
mvn-org.apache.felix-org.osgi.service.obr-pom- \
osgi-org.osgi.service.obr"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.osgi-osgi.core"

inherit rpm
