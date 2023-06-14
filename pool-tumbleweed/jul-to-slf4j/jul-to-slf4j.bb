SUMMARY = "JUL to SLF4J bridge"
DESCRIPTION = "JUL to SLF4J bridge."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "jul-to-slf4j-1.7.36-4.1.noarch.rpm"
RPM_HASH = "97d0771cd625ba40271ad817338506d39038dd91750d59d4f36e0ea5bec56e4ff3bfbd53377762610d2f7a0143b4a7868e42ed1fcd603709e414b50e35d3eca6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jul-to-slf4j \
mvn-org.slf4j-jul-to-slf4j \
mvn-org.slf4j-jul-to-slf4j-pom- \
osgi-jul.to.slf4j"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.slf4j-slf4j-api"

inherit rpm
