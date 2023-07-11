SUMMARY = "Apache Maven Mapping"
DESCRIPTION = "Maven shared component that implements file name mapping."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-mapping-3.0.0-3.11.noarch.rpm"
RPM_HASH = "950171a29b7899261f965becb0f39bb1e27becad07707abb1fef8fdcf30d823d54b9469abd2baecea2b5ddf4f7d4487ffc0c4fcc78542af433f76db29063f7c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-mapping \
mvn-org.apache.maven.shared-maven-mapping \
mvn-org.apache.maven.shared-maven-mapping-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-core \
mvn-org.codehaus.plexus-plexus-interpolation"

inherit rpm
