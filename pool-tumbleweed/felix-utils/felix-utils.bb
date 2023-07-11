SUMMARY = "Utility classes for OSGi"
DESCRIPTION = "Utility classes for OSGi"
LICENSE = "Apache-2.0"

PV = "1.11.4"

RPM_NAME = "felix-utils-1.11.4-1.13.noarch.rpm"
RPM_HASH = "80b442d9972c70ea43b28f5a7be5cbfa9938e672195de22d271ab65be6095a2374db02d7d1f2bb0c9fbc5c9e4417036e7947c5ac149d2c6793e683e061073cff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-utils \
mvn-org.apache.felix-org.apache.felix.utils \
mvn-org.apache.felix-org.apache.felix.utils-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
