SUMMARY = "Spec Version Maven Plugin"
DESCRIPTION = "Maven Plugin to configure APIs version and \
specs in a MANIFEST.MF file."
LICENSE = "EPL-2.0 | GPL-2.0-with-classpath-exception"

PV = "2.1"

RPM_NAME = "spec-version-maven-plugin-2.1-1.11.noarch.rpm"
RPM_HASH = "e0ae1e0aec9fb04fb4ab85e17cc620b0963fafc3f82d5f02cc9e158fe5fc0355ad729c5bde1ecd2d42bad5fb69bcec88edeae7689de541cd832522852acfae36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.glassfish.build-spec-version-maven-plugin \
mvn-org.glassfish.build-spec-version-maven-plugin-pom- \
spec-version-maven-plugin"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.plugin-tools-maven-plugin-annotations"

inherit rpm
