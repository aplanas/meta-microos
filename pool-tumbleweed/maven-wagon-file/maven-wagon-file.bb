SUMMARY = "The file module for maven-wagon"
DESCRIPTION = "The file module for maven-wagon."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-file-3.5.3-1.1.noarch.rpm"
RPM_HASH = "b77ef8d6c4f6c9177316d9e92573986f8e78c4e2e3365cc78028c2bc9365744a0f705e107fe20e68fd0bde895956a8c19293ce88664fd8f3eae46e09be317508"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-wagon-file \
mvn-org.apache.maven.wagon-wagon-file \
mvn-org.apache.maven.wagon-wagon-file-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.slf4j-slf4j-simple"

inherit rpm
