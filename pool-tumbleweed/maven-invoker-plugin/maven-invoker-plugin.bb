SUMMARY = "Maven Invoker Plugin"
DESCRIPTION = "The Maven Invoker Plugin is used to run a set of Maven projects. The plugin \
can determine whether each project execution is successful, and optionally \
can verify the output generated from a given project execution."
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "maven-invoker-plugin-3.2.2-1.10.noarch.rpm"
RPM_HASH = "6a32a216bd8c919e85a649e36467c94fd0922858beec1438f978f5d92b6b13e377c34d5166337fc231f78d0c541ae7bb1e05b5bbad92cbe0398e428c37e3dced"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-invoker-plugin \
mvn-org.apache.maven.plugins-maven-invoker-plugin \
mvn-org.apache.maven.plugins-maven-invoker-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.apache-extras.beanshell-bsh \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven-maven-settings \
mvn-org.apache.maven.doxia-doxia-core \
mvn-org.apache.maven.doxia-doxia-decoration-model \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.apache.maven.doxia-doxia-site-renderer \
mvn-org.apache.maven.reporting-maven-reporting-api \
mvn-org.apache.maven.reporting-maven-reporting-impl \
mvn-org.apache.maven.shared-maven-artifact-transfer \
mvn-org.apache.maven.shared-maven-common-artifact-filters \
mvn-org.apache.maven.shared-maven-invoker \
mvn-org.apache.maven.shared-maven-script-interpreter \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.codehaus.plexus-plexus-i18n \
mvn-org.codehaus.plexus-plexus-interpolation \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
