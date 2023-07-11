SUMMARY = "The provider-api module for maven-wagon"
DESCRIPTION = "The provider-api module for maven-wagon."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-provider-api-3.5.3-1.2.noarch.rpm"
RPM_HASH = "a0eb72ec9569bbaff0f0ff9300b8be28dab71bfe2bbdc9b514a7b9c3e98415f2a932f226e76375d1aee1c7dfd12f037f33a5bd8e2b02425a0a2d1a03ff4b8a4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-wagon-provider-api \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.apache.maven.wagon-wagon-provider-api-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
