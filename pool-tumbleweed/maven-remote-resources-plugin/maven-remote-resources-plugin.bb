SUMMARY = "Maven Remote Resources Plugin"
DESCRIPTION = "Process resources packaged in JARs that have been deployed to \
a remote repository. The primary use case being satisfied is \
the consistent inclusion of common resources in a large set of \
projects. Maven projects at Apache use this plug-in to satisfy \
licensing requirements at Apache where each project much include \
license and notice files for each release."
LICENSE = "Apache-2.0"

PV = "1.7.0"

RPM_NAME = "maven-remote-resources-plugin-1.7.0-2.8.noarch.rpm"
RPM_HASH = "fb491839620ba0fa759c77d021383ee3e5480f8442157d8daaa1834d62d2e5a7c9f76083f3af6321621cc02a7d20c7d8220cc6a31a0577380c129ae714840ac3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-remote-resources-plugin \
mvn-org.apache.maven.plugins-maven-remote-resources-plugin \
mvn-org.apache.maven.plugins-maven-remote-resources-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.apache.maven-maven-archiver \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-compat \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven-maven-settings \
mvn-org.apache.maven.shared-maven-common-artifact-filters \
mvn-org.apache.maven.shared-maven-filtering \
mvn-org.apache.velocity-velocity \
mvn-org.codehaus.plexus-plexus-interpolation \
mvn-org.codehaus.plexus-plexus-resources \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
