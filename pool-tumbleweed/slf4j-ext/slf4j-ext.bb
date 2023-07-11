SUMMARY = "SLF4J Extensions Module"
DESCRIPTION = "Extensions to the SLF4J API."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "slf4j-ext-1.7.36-4.2.noarch.rpm"
RPM_HASH = "b95a7358ef2064d92d044ea066beb033af16b0ce6fd076e9d38b216084d953bda45fa970bea4315c7b54ff30ef1dfd068859228f9ccc904c0a5a72d7c0ebd698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.slf4j-slf4j-ext \
mvn-org.slf4j-slf4j-ext-pom- \
osgi-slf4j.ext \
slf4j-ext"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.slf4j-slf4j-api"

inherit rpm
