SUMMARY = "Parent POM for Weld"
DESCRIPTION = "Parent POM for Weld"
LICENSE = "Apache-2.0"

PV = "34"

RPM_NAME = "weld-parent-34-1.11.noarch.rpm"
RPM_HASH = "26397358cf74121e2777a62d9484856278d3d5045c57118884c48f700d13cb7f628ff08c90e0b1763217a3827e30c61a3d2824f2a49d2daf5e53607fb52ce640"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.jboss.weld-weld-parent-pom- \
weld-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.plugins-maven-source-plugin \
mvn-org.codehaus.mojo-build-helper-maven-plugin"

inherit rpm
