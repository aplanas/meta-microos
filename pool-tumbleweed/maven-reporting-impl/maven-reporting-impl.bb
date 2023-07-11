SUMMARY = "Abstract classes to manage report generation"
DESCRIPTION = "Abstract classes to manage report generation, which can be run both: \
 \
* as part of a site generation (as a maven-reporting-api's MavenReport), \
* or as a direct standalone invocation (as a maven-plugin-api's Mojo). \
 \
This is a replacement package for maven-shared-reporting-impl"
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "maven-reporting-impl-3.1.0-1.13.noarch.rpm"
RPM_HASH = "6374b9078a26e4126a14e5cd48956ae866cd45333585b9026ea8ebff754890d2d2f0e009c7ad52ec8b17864c3a088c737ad707df303034282261b31b98481f45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-reporting-impl \
mvn-org.apache.maven.reporting-maven-reporting-impl \
mvn-org.apache.maven.reporting-maven-reporting-impl-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.doxia-doxia-core \
mvn-org.apache.maven.doxia-doxia-decoration-model \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.apache.maven.doxia-doxia-site-renderer \
mvn-org.apache.maven.reporting-maven-reporting-api \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
