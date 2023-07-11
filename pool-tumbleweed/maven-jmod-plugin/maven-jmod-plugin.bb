SUMMARY = "Apache Maven JMod Plugin"
DESCRIPTION = "Create JMod files http://openjdk.java.net/jeps/261"
LICENSE = "Apache-2.0"

PV = "3.0.0~alpha1"

RPM_NAME = "maven-jmod-plugin-3.0.0~alpha1-2.22.noarch.rpm"
RPM_HASH = "ae94d895924b71b1812cf58c0593e513fae03822f0bc74a14d8d56144ba1cbb7123ca3bc06251618dd6de585f1f26419877d6b76131947afca5a8fe9cff9b240"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-jmod-plugin \
mvn-org.apache.maven.plugins-maven-jmod-plugin \
mvn-org.apache.maven.plugins-maven-jmod-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.codehaus.plexus-plexus-java"

inherit rpm
