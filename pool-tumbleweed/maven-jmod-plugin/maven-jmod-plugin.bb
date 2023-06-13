SUMMARY = "Apache Maven JMod Plugin"
DESCRIPTION = "Create JMod files http://openjdk.java.net/jeps/261"
LICENSE = "Apache-2.0"

PV = "3.0.0~alpha1"

RPM_NAME = "maven-jmod-plugin-3.0.0~alpha1-2.21.noarch.rpm"
RPM_HASH = "67c892b644c9daa8a761e4719503b9d5b4cc635c8e0a137e4407cf7f711b2e8283f86d07d258b0d5b96a613fb4454b7a62520999b40a69c3b057c73b433bf5b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-jmod-plugin \
mvn(org.apache.maven.plugins:maven-jmod-plugin) \
mvn(org.apache.maven.plugins:maven-jmod-plugin:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.commons:commons-lang3) \
mvn(org.apache.maven.shared:maven-shared-utils) \
mvn(org.apache.maven:maven-core) \
mvn(org.apache.maven:maven-plugin-api) \
mvn(org.codehaus.plexus:plexus-java)"

inherit rpm
