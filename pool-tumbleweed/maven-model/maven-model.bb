SUMMARY = "Compatibility Maven model artifact"
DESCRIPTION = "Maven model artifact"
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "maven-model-2.2.1-3.9.noarch.rpm"
RPM_HASH = "db7db80dd357c7d4dda33e80401b90d969edeee887a7b11148ebaa467689564e22090d30e4dc49ee120971238426bf11235f952d1868595d43ce2ea0f20af9c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-model \
mvn-org.apache.maven-maven-model-2.0.2 \
mvn-org.apache.maven-maven-model-2.0.6 \
mvn-org.apache.maven-maven-model-2.0.7 \
mvn-org.apache.maven-maven-model-2.0.8 \
mvn-org.apache.maven-maven-model-2.2.1 \
mvn-org.apache.maven-maven-model-pom-2.0.2 \
mvn-org.apache.maven-maven-model-pom-2.0.6 \
mvn-org.apache.maven-maven-model-pom-2.0.7 \
mvn-org.apache.maven-maven-model-pom-2.0.8 \
mvn-org.apache.maven-maven-model-pom-2.2.1"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
