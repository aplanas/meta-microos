SUMMARY = "Maven dependency tree artifact"
DESCRIPTION = "Apache Maven dependency tree artifact. Originally part of maven-shared."
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "maven-dependency-tree-3.0.1-3.12.noarch.rpm"
RPM_HASH = "85ba9a0c34e6a2811e68ee365e408d8b97f05ec302447b3b8dd06439291075b3b33abfc8b2dba0a8bfe00e4100127df64e497d109112dbc41ce3db1391c216b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-dependency-tree \
mvn(org.apache.maven.shared:maven-dependency-tree) \
mvn(org.apache.maven.shared:maven-dependency-tree:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.codehaus.plexus:plexus-component-annotations) \
mvn(org.eclipse.aether:aether-util)"

inherit rpm
