SUMMARY = "Enforcer Rules"
DESCRIPTION = "This component contains the standard Enforcer Rules."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "maven-enforcer-rules-1.4.1-3.11.noarch.rpm"
RPM_HASH = "b03a24601160b28b48b91729d9c8fd7f375488a868cb9bdcc8b383dc5aed329d5de6c9557504a59877ad9b45d2c9d70e6393d418c36999a3b63a04b09b4517f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-enforcer-rules \
mvn-org.apache.maven.enforcer-enforcer-rules \
mvn-org.apache.maven.enforcer-enforcer-rules-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-lang-commons-lang \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-compat \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.enforcer-enforcer-api \
mvn-org.apache.maven.shared-maven-artifact-transfer \
mvn-org.apache.maven.shared-maven-common-artifact-filters \
mvn-org.apache.maven.shared-maven-dependency-tree \
mvn-org.beanshell-bsh \
mvn-org.codehaus.plexus-plexus-i18n \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
