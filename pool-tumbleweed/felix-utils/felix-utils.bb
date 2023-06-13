SUMMARY = "Utility classes for OSGi"
DESCRIPTION = "Utility classes for OSGi"
LICENSE = "Apache-2.0"

PV = "1.11.4"

RPM_NAME = "felix-utils-1.11.4-1.12.noarch.rpm"
RPM_HASH = "cbab3f0ad53eca1ab625f18e7af8706061ca8f68625a0b1e760f6cafff79d054f2817a635c4718bbf0e1d89f94d6387bd6fb9686915abd7f39c913bb013ac85a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-utils \
mvn(org.apache.felix:org.apache.felix.utils) \
mvn(org.apache.felix:org.apache.felix.utils:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
